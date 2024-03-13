package SistemaReservasCafeteria.modelos;
import SistemaReservasCafeteria.modelos.Mesa;

import java.time.LocalDate;

public class MesaGrupal extends Mesa {
    private int cantidadEnchufes;
    private int capacidad;

    public MesaGrupal(int numero, String ubicacion, double precioReserva, LocalDate fechaUltimaReserva, int cantidadEnchufes, int capacidad) {
        super(numero, ubicacion, precioReserva, fechaUltimaReserva);
        this.cantidadEnchufes = cantidadEnchufes;
        this.capacidad = capacidad;
    }

    @Override
    public double getPrecioReserva() {
        return super.getPrecioReserva();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "Cantidad de enchufes: " + cantidadEnchufes;
    }

}
