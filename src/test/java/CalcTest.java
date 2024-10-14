import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    Calc calc = new Calc();

    @Test
    void calcularIMC_Correto() {
        assertEquals(25.0, Calc.calcularIMC(80, 1.80));
    }

    @Test
    void peso_Correto() {
        assertEquals("Peso Normal", Calc.peso(23.0));
        assertEquals("Obeso", Calc.peso(32.0));
        assertEquals("Abaixo do peso", Calc.peso(18.0));
    }
    
    @Test
    void pesoCrianca_Correto() {
        assertEquals(17.0, Calc.pesoCrianca(4));
        assertEquals(19.0, Calc.pesoCrianca(5));
    }

    @Test
    void pesoCrianca_Invalido() {
        assertThrows(IllegalArgumentException.class, () -> Calc.pesoCrianca(2));
        assertThrows(IllegalArgumentException.class, () -> Calc.pesoCrianca(11));
    }

    @Test
    void pesoAdulto_Correto() {
        assertEquals(73.92, Calc.pesoAdulto(1.76, true), 0.01);
        assertEquals(69.3, Calc.pesoAdulto(1.65, false), 0.01);
    }

    @Test
    void pesoAdulto_Invalido() {
        assertThrows(IllegalArgumentException.class, () -> Calc.pesoAdulto(0, true));
    }

    @Test
    void pesoIdoso_Correto() {
        assertEquals(76.96, Calc.pesoIdoso(1.78, 68), 0.01);
        assertEquals(67.23, Calc.pesoIdoso(1.65, 75), 0.01);
    }

    @Test
    void pesoIdoso_Invalido() {
        assertThrows(IllegalArgumentException.class, () -> Calc.pesoIdoso(0, 68));
        assertThrows(IllegalArgumentException.class, () -> Calc.pesoIdoso(1.78, 64));
    }
}