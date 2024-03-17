package GuiaTuristicaMultilingue;

import GuiaTuristicaMultilingue.Idiomas.*;
import GuiaTuristicaMultilingue.Interfaces.Traduccion;

import java.util.Scanner;

public class GuiaTuristicaMultilingue {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la Guía Turística Multilingüe");

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, elija un idioma");

        mostrarIdiomas();
        String idioma = sc.nextLine().toLowerCase();

        Traduccion traduccion = null;
        switch (idioma) {
            case "español":
                mostrarIdiomaElegido("Español");
                traduccion = new Spanish();
                break;
            case "ingles":
                mostrarIdiomaElegido("Inglés");
                traduccion = new English();
                break;
            case "rumano":
                mostrarIdiomaElegido("Rumano");
                traduccion = new Romanian();
                break;
            case "frances":
                mostrarIdiomaElegido("Francés");
                traduccion = new French();
                break;
            case "aleman":
                mostrarIdiomaElegido("Alemán");
                traduccion = new German();
                break;
            default:
                throw new IllegalStateException("El idioma elegido no es válido");
        }


        if (traduccion != null){
            traduccion.inicioRespuesta();
            traduccion.introducirLugar();
            traduccion.introducirHorario();
            traduccion.finRespuesta();
        }

    }

    public static void mostrarIdiomas () {
        System.out.println("Los idiomas disponibles son: español, ingles, rumano, aleman y frances");
    }

    public static void mostrarIdiomaElegido (String idioma){
        System.out.println("El idioma elegido es: " + idioma);
    }



}
