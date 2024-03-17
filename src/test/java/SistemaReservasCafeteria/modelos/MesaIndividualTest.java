package SistemaReservasCafeteria.modelos;

import static org.junit.jupiter.api.Assertions.*;

class MesaIndividualTest {

    @org.junit.jupiter.api.Test
    void getPrecioReserva() {
        MesaIndividual mesaIndividual = new MesaIndividual(1, "interior", 100, null, 1);
        assertEquals(100, mesaIndividual.getPrecioReserva());
    }

    @org.junit.jupiter.api.Test
    void mostrarInformacion() {
        MesaIndividual mesaIndividual = new MesaIndividual(1, "jardin", 100, null, 1);
        assertEquals("Numero: 1, Ubicacion: jardin, Precio de reserva: 100.0, Fecha de ultima reserva: null, Capacidad: 1", mesaIndividual.mostrarInformacion());
    }

}