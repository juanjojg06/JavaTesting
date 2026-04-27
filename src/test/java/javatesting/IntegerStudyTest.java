package javatesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerStudyTest {

    @Test
    public void integerStudy(){

        Integer vuit = new Integer(8);
        Integer tretze = 13;
        int esperat = 13;
        assertEquals(" El nombre tretze val realment 13" , esperat, tretze.intValue() );
    }

}
