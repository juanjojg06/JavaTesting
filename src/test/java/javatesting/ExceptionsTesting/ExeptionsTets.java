package javatesting.ExceptionsTesting;

import org.junit.Test;

public class ExeptionsTets {

    @Test (expected = NullPointerException.class)

    public  void NullPointerTest(){

       Integer edat = null;
       String edatEnlletres = edat.toString();
    }

}
