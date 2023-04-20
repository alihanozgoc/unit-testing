import org.example.Calculator;
import org.junit.jupiter.api.*;


public class CalculatorTests {

    Calculator calculator;

    @BeforeAll
    public static void setupClass(){
        System.out.println("Setup class method executed!");
    }

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
        System.out.println("Setup method executed!");
    }

    @Test
    public void additionTest(){
        double additionResult = calculator.addition(1.5,3.6);
        Assertions.assertEquals(5.1, additionResult);
    }

    @Disabled("Substraction method inactive for a while")
    @Test
    public void substractionTest(){
        double substractionResult = calculator.subtraction(3.5,2.1);
        Assertions.assertEquals(1.4,substractionResult);
    }

    @Test
    public void multiplicationTest(){
        double multiplicationResult = calculator.multiplication(2.0,3.5);
        Assertions.assertEquals(7.0,multiplicationResult);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Teardown method executed");
    }

    @AfterAll
    public static void tearDownClass(){
        System.out.println("Teardown class method executed!");
    }
}
