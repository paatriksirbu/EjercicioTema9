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
        return super.mostrarInformacion() + "\nCantidad de enchufes: " + cantidadEnchufes;
    }

    public int getNumeroEnchufes() {    //Creamos un metodo para obtener un numero aleatorio de enchufes. (Algunas tienen mas que otras)
        return (int) (Math.random() * 8) + 1;
    }
}
