package SistemaReservasCafeteria.modelos;

import static org.junit.jupiter.api.Assertions.*;

class MesaGrupalTest {

    @org.junit.jupiter.api.Test
    void getPrecioReserva() {
        MesaGrupal mesaGrupal = new MesaGrupal(1, "interior", 100, null, 2, 4);
        assertEquals(100, mesaGrupal.getPrecioReserva());
    }

    @org.junit.jupiter.api.Test
    void mostrarInformacion() {
        MesaGrupal mesaGrupal = new MesaGrupal(1, "interior", 100, null, 2, 4);
        assertEquals("Numero: 1\nUbicacion: interior\nPrecio Reserva: 100.0\nFecha Ultima Reserva: nullCantidad de enchufes: 2", mesaGrupal.mostrarInformacion());
    }

}