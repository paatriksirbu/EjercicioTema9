package SistemaReservasCafeteria.modelos;
import SistemaReservasCafeteria.modelos.Mesa;

import java.time.LocalDate;

public class MesaDoble extends Mesa {
    private String vista;
    private int capacidad = 2;


    public MesaDoble(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva, String vista, int capacidad) {
        super(numero, ubicacion, precioReserva, fechaUltimaReserva);
        this.vista = vista;
        this.capacidad = capacidad;
    }

    @Override
    public double getPrecioReserva() {
        return super.getPrecioReserva();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "Vista: " + vista;
    }
}
