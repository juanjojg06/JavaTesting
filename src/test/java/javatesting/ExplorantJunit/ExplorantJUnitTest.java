package javatesting.ExplorantJunit;

import org.junit.Test;

import java.security.InvalidParameterException;

public class ExplorantJUnitTest {

@Test(expected = IllegalArgumentException.class)

    public void testedJantIllegalArgumentException(){

    throw new IllegalArgumentException();

}

}
