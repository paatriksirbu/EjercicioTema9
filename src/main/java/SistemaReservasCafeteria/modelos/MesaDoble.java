package SistemaReservasCafeteria.modelos;
import SistemaReservasCafeteria.modelos.Mesa;

import java.time.LocalDate;

public class MesaDoble extends Mesa {
    private int capacidad = 2;


    public MesaDoble(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva,int capacidad) {
        super(numero, ubicacion, precioReserva, fechaUltimaReserva);
        this.capacidad = capacidad;
    }

    @Override
    public double getPrecioReserva() {
        return super.getPrecioReserva();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() ;
    }
}
