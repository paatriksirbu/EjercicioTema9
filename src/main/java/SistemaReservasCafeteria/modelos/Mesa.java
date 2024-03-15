package SistemaReservasCafeteria.modelos;

import SistemaReservasCafeteria.Interfaces.InterfazMesa;

import java.time.LocalDate;

public abstract class Mesa implements InterfazMesa {
    private int numeroMesa;
    private String ubicacion;
    private double precioReserva;
    private LocalDate fechaUltimaReserva;
    protected int capacidad;
    private double duracion;

    public Mesa(int numeroMesa, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva, double duracion) {
        this.numeroMesa = numeroMesa;
        if (!ubicacion.equals("interior") && !ubicacion.equals("jardin") && !ubicacion.equals("calle")) {
            throw new IllegalArgumentException("Las vistas elegibles son interior, jardin o calle");
        }
        this.ubicacion = ubicacion;
        this.precioReserva = precioReserva;
        this.fechaUltimaReserva = fechaUltimaReserva;
        this.duracion = duracion;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public LocalDate getFechaUltimaReserva() {
        return fechaUltimaReserva;
    }

    public double getPrecioReserva(double duracion) {
        return this.precioReserva * duracion;
    }

    public String mostrarInformacion() {
        return "Numero: " + numeroMesa + "\nVista: " + ubicacion + "\nPrecio Reserva: " + String.format("%.2f", getPrecioReserva(duracion)) + " euros" + "\nFecha Ultima Reserva: " + getFechaUltimaReserva() + "\nCapacidad: " + capacidad;
    }
}
