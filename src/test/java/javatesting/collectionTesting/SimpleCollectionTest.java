package javatesting.collectionTesting;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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

    @Test

    public  void  diesSetmanes(){

        List<String> diesSetmanes  = new ArrayList<>();
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesCapDeSetmanes = new ArrayList<>() ;
       initDiesfeiners(diesFeiners);

       assertTrue(diesFeiners.size() ==  5);

    assertEquals(0, diesSetmanes.size());
    assertFalse(diesSetmanes.containsAll(diesFeiners));

   diesSetmanes.addAll(diesFeiners);

        assertEquals(5, diesSetmanes.size());
        assertTrue(diesSetmanes.containsAll(diesFeiners));
    }



    public  void initDiesfeiners(List<String> dies){
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add(" dimecres");
        dies.add("dijous");
        dies.add("divendres");
    }



}
