package SistemaReservasCafeteria.Fabrica;
import SistemaReservasCafeteria.modelos.*;
import java.time.LocalDate;


public class MesaFactory {
    public Mesa crearMesa(String tipo, int numero, String ubicacion, int capacidad, double precioReserva, LocalDate fechaUltimaReserva, double duracion, int cantidadEnchufes) {
        switch (tipo) {
            case "individual":
                return new MesaIndividual(numero, ubicacion, precioReserva, fechaUltimaReserva, duracion);
            case "doble":
                return new MesaDoble(numero, ubicacion, precioReserva, fechaUltimaReserva, duracion);
            case "grupal":
                return new MesaGrupal(numero, ubicacion, precioReserva, fechaUltimaReserva, cantidadEnchufes, capacidad, duracion);
            default:
                throw new IllegalArgumentException("La mesa introducida no es valida");
        }
    }
}
