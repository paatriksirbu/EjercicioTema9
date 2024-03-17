package GuiaTuristicaMultilingue.Idiomas;

import GuiaTuristicaMultilingue.Interfaces.Traduccion;

import java.util.Random;
import java.util.Scanner;

public class Romanian implements Traduccion {
    Scanner sc = new Scanner(System.in);

    @Override
    public void introducirLugar() {
        System.out.println("Introduceți locul pe care doriți să îl vizitați: ");
    }

    @Override
    public void introducirHorario() {
        System.out.println("Introduceți orele de vizitare: (d)imineața, (d)upă-amiază (d/D)");
        char horario = sc.next().charAt(0);
        if (horario == 'd') {
            System.out.println("Dimineața: 9:00 - 13:00");
            System.out.println("Ora selectată dimineața");
        } else if (horario == 'D') {
            System.out.println("După-amiază: 15:00 - 19:00");
            System.out.println("Ora selectată după-amiază");
        } else {
            System.out.println("Opțiune invalidă");
        }
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Începerea răspunsului...");
        System.out.println("În locul selectat, puteți vizita: ");
    }

    @Override
    public void finRespuesta() {
        System.out.println("Sfârșitul răspunsului...");
        Random r = new Random();
        int respuesta = r.nextInt(2);
        if (respuesta == 0){
            System.out.println("Programul selectat nu este disponibil");
        } else {
            System.out.println("Programul selectat este disponibil");
        }
        System.out.println("Drum bun!!");
    }
}
