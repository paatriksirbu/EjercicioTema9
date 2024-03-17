package GuiaTuristicaMultilingue;
import java.util.List;
import java.util.ArrayList;

public class LugaresTuristicos {

    private static List<String> lugares;

    public LugaresTuristicos(){
        this.lugares = new ArrayList<>();
        lugares.add("La Sagrada Familia, Barcelona");
        lugares.add("El Prado, Madrid");
        lugares.add("La Alhambra, Granada");
        lugares.add("Park Güell, Barcelona");
        lugares.add("La Mezquita, Córdoba");
    }

    public static void mostrarLugares(){
        System.out.println("Los lugares turísticos disponibles son: ");
        for (String lugar : lugares) {
            System.out.println(lugar);
        }
    }

    public static String getLugar(int index){
        return lugares.get(index);
    }

    public int numeroLugares(){
        return lugares.size();
    }
}
