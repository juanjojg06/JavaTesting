package javatesting.ExplorantJunit;

import org.junit.*;
import org.junit.rules.ExpectedException;


public class ExplorantJUnitTest {
    @Rule
    public ExpectedException exprction = ExpectedException.none();


@Test(expected = IllegalArgumentException.class)

    public void testedJantIllegalArgumentException(){

    throw new IllegalArgumentException();

}
@Test
public void illegalParameterestest(){
    exprction.expect(IllegalArgumentException.class);

    throw  new IllegalArgumentException();
}

@Test
    public void missatgeExcepcioTest(){
    exprction.expect(IllegalArgumentException.class);
    exprction.expectMessage("the");
    throw  new IllegalArgumentException("the exceptions");

}

@BeforeClass
    public  static void executaUnCopPerClasseAbansDeQualsevolTets(){
    System.out.println("Antes de ejecutar el test , una vez por clase");
    };


@AfterClass
    public  static void executaUnCopPerClasseDespuesDeQualsevolTets(){
        System.out.println("Despues de ejecutar el test , una vez por clase");
    }

}
