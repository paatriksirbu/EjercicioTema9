package SistemaReservasCafeteria.modelos;
import SistemaReservasCafeteria.modelos.Mesa;

import java.time.LocalDate;

public class MesaDoble extends Mesa {
    private int capacidad = 2;


    public MesaDoble(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva,int capacidad, double duracion) {
        super(numero, ubicacion, precioReserva, fechaUltimaReserva, duracion);
        this.capacidad = capacidad;
    }

    @Override
    public double getPrecioReserva(double duracion) {
        return super.getPrecioReserva(duracion);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() ;
    }
}
