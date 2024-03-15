package SistemaReservasCafeteria.modelos;

import SistemaReservasCafeteria.Interfaces.InterfazMesa;

import java.time.LocalDate;

public abstract class Mesa implements InterfazMesa {
    private int numeroMesa;
    private String ubicacion;
    private double precioReserva;
    private LocalDate fechaUltimaReserva;
    private int capacidad;

    public Mesa(int numeroMesa, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva) {
        this.numeroMesa = numeroMesa;
        if (!ubicacion.equals("interior") && !ubicacion.equals("jardin") && !ubicacion.equals("calle")) {
            throw new IllegalArgumentException("Las vistas elegibles son interior, jardin o calle");
        }
        this.ubicacion = ubicacion;
        this.precioReserva = precioReserva;
        this.fechaUltimaReserva = fechaUltimaReserva;
        this.capacidad = capacidad;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getPrecioReserva() {
        return precioReserva;
    }

    public LocalDate getFechaUltimaReserva() {
        return fechaUltimaReserva;
    }

    public String mostrarInformacion() {
        return "Numero: " + numeroMesa + "\nUbicacion: " + ubicacion + "\nPrecio Reserva: " + precioReserva + "\nFecha Ultima Reserva: " + fechaUltimaReserva + "\nCapacidad: " + capacidad;
    }
}
