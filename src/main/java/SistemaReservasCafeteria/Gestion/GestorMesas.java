package SistemaReservasCafeteria.Gestion;
import SistemaReservasCafeteria.modelos.Mesa;
import SistemaReservasCafeteria.modelos.MesaDoble;
import SistemaReservasCafeteria.modelos.MesaGrupal;
import SistemaReservasCafeteria.modelos.MesaIndividual;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorMesas {

    private List<Mesa> mesas;

    public GestorMesas(List<Mesa> mesas) {
        this.mesas = new ArrayList<>();
    }

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

    public MesaIndividual crearMesaIndividual(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero de la mesa: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduzca la ubicacion de la mesa: (interior, jardin, calle)");
        String ubicacion = scanner.nextLine();
        System.out.println("Introduzca la fecha de la ultima reserva: (formato YYYY-MM-DD)");
        LocalDate fechaUltimaReserva = LocalDate.parse(scanner.nextLine());

        int capacidad = 1;
        double precioReserva = 2.5;

        MesaIndividual mesaIndividual = new MesaIndividual(numero, ubicacion, precioReserva, fechaUltimaReserva, capacidad);
        agregarMesa(mesaIndividual);
        return mesaIndividual;
    }

    public MesaDoble crearMesaDoble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero de la mesa: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduzca la ubicacion de la mesa: (interior, jardin, calle)");
        String ubicacion = scanner.nextLine();
        System.out.println("Introduzca la fecha de la ultima reserva: (formato YYYY-MM-DD)");
        LocalDate fechaUltimaReserva = LocalDate.parse(scanner.nextLine());

        double precioReserva = 4.5;
        int capacidad = 2;

        MesaDoble mesaDoble = new MesaDoble(numero, ubicacion, precioReserva, fechaUltimaReserva, capacidad);
        agregarMesa(mesaDoble);
        return mesaDoble;
    }

    public MesaGrupal crearMesaGrupal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero de la mesa: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduzca la ubicacion de la mesa: (interior, jardin, calle)");
        String ubicacion = scanner.nextLine();
        System.out.println("Introduzca la fecha de la ultima reserva: (formato YYYY-MM-DD)");
        LocalDate fechaUltimaReserva = LocalDate.parse(scanner.nextLine());
        System.out.println("Introduzca la capacidad de la mesa: ");
        int capacidad = scanner.nextInt();


        double precioReserva = 7.9;
        int cantidadEnchufes = (int) (Math.random() * 8) + 1;

        MesaGrupal mesaGrupal = new MesaGrupal(numero, ubicacion, precioReserva, fechaUltimaReserva, cantidadEnchufes, capacidad);
        agregarMesa(mesaGrupal);
        return mesaGrupal;
    }
}
