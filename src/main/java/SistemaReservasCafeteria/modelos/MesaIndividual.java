package SistemaReservasCafeteria.modelos;
import SistemaReservasCafeteria.modelos.Mesa;

import java.time.LocalDate;
import java.util.Scanner;

public class MesaIndividual extends Mesa{
    private int capacidad = 1;
    double precioReserva = 2.5;

    public MesaIndividual(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva, int capacidad, double duracion) {
        super(numero, ubicacion, precioReserva, fechaUltimaReserva, duracion);
        this.capacidad = capacidad;
    }

    @Override
    public double getPrecioReserva(double duracion) {
        return super.getPrecioReserva(duracion);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion();
    }

    public double calcularPrecioReserva(int duracion){
        return duracion * precioReserva;
    }


}
