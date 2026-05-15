package javatesting.collectionTesting;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
public class SimpleCollectionTest {

    @Test

    public  void fristCollectionTest(){

        String[] nombres =  { "zero" , "un" , "dos" , "tres"};
        List<String> numeros =  new ArrayList<>();

        for( String s : nombres ){
            numeros.add(s);
        }
        numeros.add("quatre");
       assertTrue(numeros.size() ==  5);
        List<String>llistaNumeros = Arrays.asList(nombres);
        //llistaNumeros.add("quatre");
        assertTrue(llistaNumeros.size() ==  4);
    }
}
