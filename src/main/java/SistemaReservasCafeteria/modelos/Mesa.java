package SistemaReservasCafeteria.modelos;

import SistemaReservasCafeteria.Interfaces.InterfazMesa;

import java.time.LocalDate;

public abstract class Mesa implements InterfazMesa {
    private int numeroMesa;
    private String ubicacion;
    private double precioReserva;
    private LocalDate fechaUltimaReserva;

    public Mesa(int numeroMesa, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva) {
        this.numeroMesa = numeroMesa;
        this.ubicacion = ubicacion;
        this.precioReserva = precioReserva;
        this.fechaUltimaReserva = fechaUltimaReserva;
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
        return "Numero: " + numeroMesa + "\nUbicacion: " + ubicacion + "\nPrecio Reserva: " + precioReserva + "\nFecha Ultima Reserva: " + fechaUltimaReserva;
    }
}
