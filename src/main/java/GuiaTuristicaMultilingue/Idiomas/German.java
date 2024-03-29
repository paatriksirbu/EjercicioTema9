package GuiaTuristicaMultilingue.Idiomas;

import GuiaTuristicaMultilingue.Interfaces.Traduccion;
import GuiaTuristicaMultilingue.LugaresTuristicos;

import java.util.Random;
import java.util.Scanner;

public class German implements Traduccion {
    Scanner sc = new Scanner(System.in);
    private LugaresTuristicos lugaresTuristicos;

    public German(LugaresTuristicos lugaresTuristicos) {
        this.lugaresTuristicos = lugaresTuristicos;
    }

    @Override
    public void introducirLugar() {
        System.out.println("Geben Sie den Ort ein, den Sie besuchen möchten: ");
        lugaresTuristicos.mostrarLugares();

        int seleccion = sc.nextInt();
        while (seleccion < 1 || seleccion > 5) {
            System.out.println("Ungültige Option");
            seleccion = sc.nextInt();
        }

        System.out.println("Ort ausgewählt: " + lugaresTuristicos.getLugar(seleccion - 1));
        sc.nextLine();
    }

    @Override
    public void introducirHorario() {
        System.out.println("Geben Sie die Besuchszeiten ein: (m)orgen, (n)achmittag (m/n)");
        char horario = sc.next().charAt(0);
        if (horario == 'm') {
            System.out.println("Morgen: 9:00 - 13:00");
            System.out.println("Morgens ausgewählte Zeit");
        } else if (horario == 'n') {
            System.out.println("Nachmittag: 15:00 - 19:00");
            System.out.println("Nachmittags ausgewählte Zeit");
        } else {
            System.out.println("Ungültige Option");
        }
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Beginn der Antwort...");
        System.out.println("Im ausgewählten Ort können Sie besuchen: ");
    }

    @Override
    public void finRespuesta() {
        Random r = new Random();
        int respuesta = r.nextInt(2);
        if (respuesta == 0){
            System.out.println("Die ausgewählte Zeit ist nicht verfügbar");
        } else {
            System.out.println("Die ausgewählte Zeit ist verfügbar");
        }
        System.out.println("Gute Reise!!");
    }
}
