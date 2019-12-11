package scrambledWords;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteEmbaralhadorParImpar {

    @BeforeEach
    public void before() {
        System.out.println("@Before");
    }

    @AfterEach
    public void after() {
        System.out.println("@After");
    }

    @org.junit.jupiter.api.Test
    void testeEmbaralharPalavraPar() {
        EmbaralhadorParImpar par = new EmbaralhadorParImpar();
        assertEquals("omot", par.embaralhador("moto"));
    }

    @org.junit.jupiter.api.Test
    void testeEmbaralharPalavraImpar() {
        EmbaralhadorParImpar impar = new EmbaralhadorParImpar();
        assertEquals("miapr", impar.embaralhador("impar"));
    }
}
