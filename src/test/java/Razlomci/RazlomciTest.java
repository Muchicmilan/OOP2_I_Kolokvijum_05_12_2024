package Razlomci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RazlomciTest {
    private Razlomci r1;
    private Razlomci r2;
    @BeforeEach
    void setUp(){
        r1 = new Razlomci(3,4);
        r2 = new Razlomci(1,2);
    }
    @Test
    void shouldCheckAdditionIsCorrect(){
        int expectedR3Brojilac = 3*2+4;
        int expectedR3Imenilac = 8;
        Razlomci r3 = r1.addition(r2);
        Assertions.assertThat(r3.getBrojilac()).isEqualTo(expectedR3Brojilac);
        Assertions.assertThat(r3.getImenilac()).isEqualTo(expectedR3Imenilac);
    }
    @Test
    void shouldCheckSubtractionIsCorrect(){
        int expectedR3Brojilac = 3*2-4;
        int expectedR3Imenilac = 8;
        Razlomci r3 = r1.subtraction(r2);
        Assertions.assertThat(r3.getBrojilac()).isEqualTo(expectedR3Brojilac);
        Assertions.assertThat(r3.getImenilac()).isEqualTo(expectedR3Imenilac);
    }
    @Test
    void shouldCheckMultiplicationIsCorrect(){
        int expectedR3Brojilac = 3;
        int expectedR3Imenilac = 8;
        Razlomci r3 = r1.multiplication(r2);
        Assertions.assertThat(r3.getBrojilac()).isEqualTo(expectedR3Brojilac);
        Assertions.assertThat(r3.getImenilac()).isEqualTo(expectedR3Imenilac);
    }
    @Test
    void shouldCheckDivisionIsCorrect(){
        int expectedR3Brojilac = 6;
        int expectedR3Imenilac = 4;
        Razlomci r3 = r1.division(r2);
        Assertions.assertThat(r3.getBrojilac()).isEqualTo(expectedR3Brojilac);
        Assertions.assertThat(r3.getImenilac()).isEqualTo(expectedR3Imenilac);
    }
    @Test
    void shouldCheckValueIsCorrect(){
        double expectedValue = 0.5;
        Assertions.assertThat(r2.value()).isEqualTo(expectedValue);
    }
    @Test
    void shouldCheckIfToStringIsCorrect(){
        String expectedString = r1.getBrojilac() + " / " + r1.getImenilac();
        Assertions.assertThat(r1.toString().equals(expectedString)).isTrue();
    }
}