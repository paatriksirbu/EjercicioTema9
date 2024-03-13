package SistemaReservasCafeteria.modelos;

import SistemaReservasCafeteria.Interfaces.InterfazMesa;

import java.time.LocalDate;

public abstract class Mesa implements InterfazMesa {
    private int numero;
    private String ubicacion;
    private double precioReserva;
    private LocalDate fechaUltimaReserva;

    public Mesa(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.precioReserva = precioReserva;
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    public int getNumero() {
        return numero;
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
        return "Numero: " + numero + "\nUbicacion: " + ubicacion + "\nPrecio Reserva: " + precioReserva + "\nFecha Ultima Reserva: " + fechaUltimaReserva;
    }
}
