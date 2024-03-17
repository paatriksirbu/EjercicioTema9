package GuiaTuristicaMultilingue.Idiomas;

import GuiaTuristicaMultilingue.Interfaces.Traduccion;

import java.util.Random;
import java.util.Scanner;

public class English implements Traduccion {
    Scanner sc = new Scanner(System.in);

    @Override
    public void introducirLugar() {
        System.out.println("Enter the place you want to visit: ");
    }

    @Override
    public void introducirHorario() {
        System.out.println("Enter the visiting hours: (m)orning, (a)fternoon (m/a)");
        char horario = sc.next().charAt(0);
        if (horario == 'm') {
            System.out.println("Morning: 9:00 - 13:00");
            System.out.println("Morning schedule selected");
        } else if (horario == 'a') {
            System.out.println("Afternoon: 15:00 - 19:00");
            System.out.println("Afternoon schedule selected");
        } else {
            System.out.println("Invalid option");
        }
    }

    @Override
    public void inicioRespuesta(){
        System.out.println("Starting response...");
        System.out.println("In the selected place, you can visit: ");
    }

    @Override
    public void finRespuesta(){
        Random r = new Random();
        int respuesta = r.nextInt(2);
        if (respuesta == 0){
            System.out.println("The selected schedule is not available");
        } else {
            System.out.println("The selected schedule is available");
        }

        System.out.println("Have a nice trip!!");
    }
}
