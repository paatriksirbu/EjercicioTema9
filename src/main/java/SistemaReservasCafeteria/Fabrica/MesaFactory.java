package SistemaReservasCafeteria.Fabrica;
import SistemaReservasCafeteria.modelos.*;
import java.time.LocalDate;


public class MesaFactory {
    public Mesa crearMesa(String tipo, int numero, String ubicacion, String vista, int capacidad, double precioReserva, LocalDate fechaUltimaReserva) {
        switch (tipo) {
            case "individual":
                return new MesaIndividual(numero, ubicacion, precioReserva, fechaUltimaReserva, vista, capacidad);
            case "doble":
                return new MesaDoble(numero, ubicacion, precioReserva, fechaUltimaReserva, vista, capacidad);
            case "grupal":
                return new MesaGrupal(numero, ubicacion, precioReserva, fechaUltimaReserva, capacidad, capacidad);
            default:
                throw new IllegalArgumentException("La mesa introducida no es valida");
        }
    }
}
