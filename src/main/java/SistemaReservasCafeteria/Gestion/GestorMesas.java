package SistemaReservasCafeteria.Gestion;
import SistemaReservasCafeteria.modelos.Mesa;

import java.util.List;

public class GestorMesas {

    private List<Mesa> mesas;

    public void agregarMesa(Mesa mesa){
        mesas.add(mesa);
    }

    public void eliminarMesa(int numeroMesa){
        mesas.removeIf(mesa -> mesa.getNumeroMesa() == numeroMesa);
    }

    public void mostrarMesas(){
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }
    }
}
