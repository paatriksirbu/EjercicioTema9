package SistemaReservasCafeteria.modelos;
import SistemaReservasCafeteria.modelos.Mesa;

import java.time.LocalDate;

public class MesaIndividual extends Mesa{
    private int capacidad = 1;
    double precioReserva = 2.5;

    public MesaIndividual(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva, int capacidad) {
        super(numero, ubicacion, precioReserva, fechaUltimaReserva);
        this.capacidad = capacidad;
    }

    @Override
    public double getPrecioReserva() {
        return super.getPrecioReserva();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion();
    }

    public double calcularPrecioReserva(int duracion){
        return duracion * precioReserva;
    }
}
