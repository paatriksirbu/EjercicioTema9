package SistemaReservasCafeteria.Fabrica;
import SistemaReservasCafeteria.modelos.*;
import java.time.LocalDate;


public class MesaFactory {
    public Mesa crearMesa(String tipo, int numero, String ubicacion, int capacidad, double precioReserva, LocalDate fechaUltimaReserva, double duracion) {
        switch (tipo) {
            case "individual":
                return new MesaIndividual(numero, ubicacion, precioReserva, fechaUltimaReserva, capacidad, duracion);
            case "doble":
                return new MesaDoble(numero, ubicacion, precioReserva, fechaUltimaReserva, capacidad, duracion);
            case "grupal":
                return new MesaGrupal(numero, ubicacion, precioReserva, fechaUltimaReserva, capacidad, capacidad, duracion);
            default:
                throw new IllegalArgumentException("La mesa introducida no es valida");
        }
    }
}
