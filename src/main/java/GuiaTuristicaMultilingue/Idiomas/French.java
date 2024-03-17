package GuiaTuristicaMultilingue.Idiomas;

import GuiaTuristicaMultilingue.Interfaces.Traduccion;

import java.util.Random;
import java.util.Scanner;

public class French implements Traduccion {
    Scanner sc = new Scanner(System.in);

    @Override
    public void introducirLugar() {
        System.out.println("Entrez le lieu que vous souhaitez visiter: ");
    }

    @Override
    public void introducirHorario() {
        System.out.println("Entrez les heures de visite: (m)atin, (a)près-midi (m/a)");
        char horario = sc.next().charAt(0);
        if (horario == 'm') {
            System.out.println("Matin: 9:00 - 13:00");
            System.out.println("Horaire du matin sélectionné");
        } else if (horario == 'a') {
            System.out.println("Après-midi: 15:00 - 19:00");
            System.out.println("Horaire de l'après-midi sélectionné");
        } else {
            System.out.println("Option invalide");
        }
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Début de la réponse...");
        System.out.println("Dans le lieu sélectionné, vous pouvez visiter: ");
    }

    @Override
    public void finRespuesta() {
        Random r = new Random();
        int respuesta = r.nextInt(2);
        if (respuesta == 0){
            System.out.println("L'horaire sélectionné n'est pas disponible");
        } else {
            System.out.println("L'horaire sélectionné est disponible");
        }
        System.out.println("Bon voyage!!");
    }
}
