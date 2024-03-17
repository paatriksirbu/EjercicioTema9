package GuiaTuristicaMultilingue.Idiomas;

import GuiaTuristicaMultilingue.Interfaces.Traduccion;

import java.util.Random;
import java.util.Scanner;

public class Spanish implements Traduccion {
    Scanner sc = new Scanner(System.in);

    @Override
    public void introducirLugar() {
        System.out.println("Introduce el lugar que deseas visitar: ");
    }

    @Override
    public void introducirHorario() {
        System.out.println("Introduce el horario de visita: (m)añana, (t)arde (m/t)");
        char horario = sc.next().charAt(0);
        if (horario == 'm') {
            System.out.println("Mañana: 9:00 - 13:00");
            System.out.println("Horario de mañana seleccionado");
        } else if (horario == 't') {
            System.out.println("Tarde: 15:00 - 19:00");
            System.out.println("Horario de tarde seleccionado");
        } else {
            System.out.println("Opción no válida");
        }
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Comenzando respuesta...");
        System.out.println("En el lugar seleccionado, puedes visitar: ");
    }

    @Override
    public void finRespuesta() {
        Random r = new Random();
        int respuesta = r.nextInt(2);
        if (respuesta == 0){
            System.out.println("El horario seleccionado no está disponible");
        } else {
            System.out.println("El horario seleccionado está disponible");
        }

        System.out.println("¡Buen viaje!");
    }
}
