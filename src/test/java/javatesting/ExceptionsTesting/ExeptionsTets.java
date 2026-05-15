package javatesting.ExceptionsTesting;

import org.junit.Test;
import static org. junit. Assert.*;
public class ExeptionsTets {

    @Test (expected = NullPointerException.class)

    public  void NullPointerTest(){

       Integer edat = null;
       String edatEnlletres = edat.toString();

       assertEquals(18 , edatEnlletres);
    }



    @Test

    public  void catchNullPointerTest(){

        Integer edat = null;
        String edatEnlletres ;

            try {
     edatEnlletres = edat.toString();
            }catch (NullPointerException npe){

                edat = 18;
            }





        assertEquals(18 , edatEnlletres);
    }

}
