import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GastoTest{
    Gasto gasto = new Gasto();

    @Test
    void calcularTMB_deveCalcularTMBCorretamente() {
        assertEquals(1429.3, Gasto.calcularTMB(31, 69, false), 0.01);
        assertEquals(1715.16, Gasto.calcularNecessidadeDiariaEnergia(1429.3, 1.2), 0.01);
    }

    @Test
    void calcularTMB_deveLancarExcecaoParaIdadeInvalida() {
        assertThrows(IllegalArgumentException.class, () -> Gasto.calcularTMB(9, 69, false));
    }

    @Test
    void getFatorAtividade_deveRetornarFatorAtividadeCorretamente() {
        assertEquals(1.2, Gasto.getFatorAtividade("sedentario"));
        assertEquals(1.3, Gasto.getFatorAtividade("levemente ativo"));
        assertEquals(1.45, Gasto.getFatorAtividade("moderadamente ativo"));
        assertEquals(1.5, Gasto.getFatorAtividade("ativo"));
        assertEquals(1.7, Gasto.getFatorAtividade("muito ativo"));
    }

    @Test
    void getFatorAtividade_deveLancarExcecaoParaNivelAtividadeInvalido() {
        assertThrows(IllegalArgumentException.class, () -> Gasto.getFatorAtividade("invalido"));
    }
}