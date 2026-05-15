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

    @Test

    public  void  diesSetmanes(){

        List<String> diesSetmanes ;
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesCapDeSetmanes ;
       initDiesfeiners(diesFeiners);

       assertTrue(diesFeiners.size() ==  5);
    }



    public  void initDiesfeiners(List<String> dies){
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add(" dimecres");
        dies.add("dijous");
        dies.add("divendres");
    }



}
