package SistemaReservasCafeteria.modelos;
import SistemaReservasCafeteria.modelos.Mesa;

import java.time.LocalDate;

public class MesaDoble extends Mesa {

    public MesaDoble(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva, double duracion) {
        super(numero, ubicacion, precioReserva, fechaUltimaReserva, duracion);
        this.capacidad = 2;
    }

    @Override
    public double getPrecioReserva(double duracion) {
        return super.getPrecioReserva(duracion);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion();
    }
}
