package SistemaReservasCafeteria.modelos;

import static org.junit.jupiter.api.Assertions.*;

class MesaDobleTest {

    @org.junit.jupiter.api.Test
    void getPrecioReserva() {
        MesaDoble mesaDoble = new MesaDoble(1, "interior", 200, null, 2);
        assertEquals(200, mesaDoble.getPrecioReserva());
    }

    @org.junit.jupiter.api.Test
    void mostrarInformacion() {
        MesaDoble mesaDoble = new MesaDoble(1, "jardin", 200, null, 2);
        assertEquals("Numero: 1, Ubicacion: jardin, Precio de reserva: 200.0, Fecha de ultima reserva: null, Capacidad: 2", mesaDoble.mostrarInformacion());
    }

}