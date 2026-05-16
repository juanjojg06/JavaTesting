package javatesting.ExplorantJunit;

import org.junit.Rule;
import org.junit.Test;
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



}
