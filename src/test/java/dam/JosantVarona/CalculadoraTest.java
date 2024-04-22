package dam.JosantVarona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculadoraTest {
    // Definimos el objeto para usarlo en todos los tests
    static Calculadora miCalculadora;

    @BeforeAll
    public static void setUpClass(){
        miCalculadora = new Calculadora();
    }

    @Test
    @DisplayName("Sumar dos números")
    void testSumar() {
        assertEquals(6, miCalculadora.suma(3,3));
        assertEquals(9, miCalculadora.suma(4,5));
        assertEquals(20, miCalculadora.suma(10,10));
        assertEquals(17, miCalculadora.suma(9,8));
    }
    @Test
    @DisplayName("Restar dos números")
    void testRestar() {
        assertEquals(0, miCalculadora.resta(3,3));
        assertEquals(-2, miCalculadora.resta(2,4));
        assertEquals(5, miCalculadora.resta(10,5));
        assertEquals(5, miCalculadora.resta(15,10));
    }
    @Test
    @DisplayName("Multiplicar dos números")
    void testMultiplicar() {
        assertEquals(4, miCalculadora.multiplica(2,2));
        assertEquals(6, miCalculadora.multiplica(2,3));
        assertEquals(25, miCalculadora.multiplica(5,5));
        assertEquals(100, miCalculadora.multiplica(10,10));
    }

    @Test
    @DisplayName("Divisiones enteras y reales")
    void testDivisionesEnterasYReales() throws Exception {
        assertEquals(1, miCalculadora.divide(2,2));
        assertEquals(2, miCalculadora.divide(10,5));
        assertEquals(4, miCalculadora.divide(10,2.5));
        assertEquals(7.5, miCalculadora.divide(15,2));
    }
    @Test
    @DisplayName("Potencias")
    void testPotencia() {
        assertEquals(16, miCalculadora.potencia(2,4));
        assertEquals(-27, miCalculadora.potencia(-3,3));
        assertEquals(1000, miCalculadora.potencia(10,3));
        assertEquals(1, miCalculadora.potencia(1,10));
    }
    @Test
    @DisplayName("División por cero causa excepción")
    void testDivisionPorCero() {
        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.divide(5,0);
        });

        assertEquals("El divisor es 0", thrown.getMessage());
    }
    @Test
    public void testRaizCuadradaDeUno() {

        assertEquals(1.0, miCalculadora.raizCuadrada(1));
    }
    @Test
    public void testRaizCuadradaDeCero() {

        assertEquals(0.0, miCalculadora.raizCuadrada(0));
    }
    @Test
    public void testRaizCuadradaDeCuatro() {

        assertEquals(2.0, miCalculadora.raizCuadrada(4));
    }
    @Test
    public void testRaizCuadradaNumeroNegativo() {

        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.raizCuadrada(-4);
        });
    }

}