package javatesting.ExceptionsTesting;
//14:44
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
                edatEnlletres = edat.toString();
            }





        assertEquals("18" , edatEnlletres);
    }




    @Test

    public  void tryNullPointerTest(){

        Integer edat = null;
        String edatEnlletres="" ;
        String text;

        try {
            edatEnlletres = edat.toString();
        }catch (NullPointerException npe){

            edat = 18;
            edatEnlletres = edat.toString();
        } finally {
            text = "Edat == " + edatEnlletres;
        }
        assertEquals("Edat == 18" , text);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void throwingIllegalArgumentsExcepciontryNullPointerTest(){

        Integer edat = null;
        String edatEnlletres="" ;
        String text;

        try {
            System.out.println("Paso 1 Generemos NUllPointException");
            edatEnlletres = edat.toString();
        }catch (NullPointerException npe){
            System.out.println("Paso 2 Capturamos la NullPointException");
            System.out.println("Paso 3 lanzamos una excepcion");
            throw new IllegalArgumentException("excepcion crea i lanza por mi ");
        }finally {
            System.out.println("Paso final codigo de cerramiento");
        }
    }

    @Test(expected = NullPointerException.class)
    public  void exceptionErronia() {

        Integer edat = null;
        String edatEnlletres="" ;
        String text;

        try {
            System.out.println("Paso 1 Generemos NUllPointException");
            edatEnlletres = edat.toString();
            throw new IllegalArgumentException("excepcion crea i lanza por mi ");

        }catch (IllegalArgumentException e){
            System.out.println("Paso 2 Capturamos  la illegalArgumetsException");
        }finally {
            System.out.println("Paso final codigo de cerramiento");
        }

    }




}



