package SistemaReservasCafeteria.Interfaces;

import java.time.LocalDate;

public interface InterfazMesa {
    //Metodos para obtener los metodos comunes de las mesas
    int getNumeroMesa();
    String getUbicacion();
    LocalDate getFechaUltimaReserva();

    //Metodos para gestionar las reservas de mesas
    double getPrecioReserva(double duracion);
    String mostrarInformacion();
}
