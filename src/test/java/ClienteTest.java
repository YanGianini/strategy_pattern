import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveRealisarDeposito() {
        Cliente cliente = new Cliente();
        cliente.setSaldo(5000f);
        cliente.Depositar(500f);
        assertEquals(5500f, cliente.getSaldo());
    }

    @Test
    void deveRealisarRetirada() {
        Cliente cliente = new Cliente();
        cliente.setSaldo(5000f);
        cliente.Retirar(500f);
        assertEquals(4500f, cliente.getSaldo());
    }
}
