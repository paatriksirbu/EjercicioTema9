package SistemaReservasCafeteria;
import java.time.LocalDate;
import SistemaReservasCafeteria.Gestion.GestorMesas;
import SistemaReservasCafeteria.modelos.*;

import java.util.*;

public class SistemaReservasCafeteria {
    public static void main(String[] args) {

        System.out.println("\nBienvenido al sistema de reservas de la cafeteria");
        System.out.println("    -Desarrollado por el equipo SRBTech-  ");

        System.out.println("\nPor favor, seleccione una opcion: ");
        System.out.println("1. Reservar mesa");
        System.out.println("2. Cancelar reserva");
        System.out.println("3. Mostrar mesas disponibles");
        System.out.println("4. Salir");


        Scanner scanner = new Scanner(System.in);
        GestorMesas gestorMesas = new GestorMesas(new ArrayList<>());
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Por favor, elija el tipo de mesa que quiere seleccionar: ");
                System.out.println("1. Mesa individual - 2,50€/hora");
                System.out.println("2. Mesa doble - 4,50€/hora");
                System.out.println("3. Mesa grupal ' 7,90€/hora");
                int tipoMesa = scanner.nextInt();
                switch (tipoMesa) {
                    case 1:
                        System.out.println("Mesa individual");
                        MesaIndividual mesaIndividual = gestorMesas .crearMesaIndividual();
                        System.out.println("La mesa individual ha sido creada con exito.");
                        System.out.println("\n  Detalles de la mesa individual: ");
                        System.out.println(mesaIndividual.mostrarInformacion());
                        break;
                    case 2:
                        System.out.println("Mesa doble");
                        MesaDoble mesaDoble = gestorMesas.crearMesaDoble();
                        System.out.println("La mesa doble ha sido creada con exito.");
                        System.out.println("\n  Detalles de la mesa doble: ");
                        System.out.println(mesaDoble.mostrarInformacion());
                        break;
                    case 3:
                        System.out.println("Mesa grupal");
                        MesaGrupal mesaGrupal = gestorMesas.crearMesaGrupal();
                        System.out.println("La mesa grupal ha sido creada con exito.");
                        System.out.println("\n  Detalles de la mesa grupal: ");
                        System.out.println(mesaGrupal.mostrarInformacion());
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

                break;
            case 2:
                System.out.println("Cancelar reserva");
                break;
            case 3:
                System.out.println("Mostrar mesas disponibles");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
