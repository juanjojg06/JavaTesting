package javatesting.arrayTesting;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayTest {
//6:19
    @Test

    public void  exempleArraySenzill(){
    String [] numeros = { "zero" , "un" , "dos" , "tres"};

    assertEquals("zero" ,numeros[0] );

    String nombres = "";

    for (String n : numeros){
        nombres += n + '|';
    }
    assertEquals(nombres,"zero|un|dos|tres|" );
    }

    @Test
    public void provesOrdenarArray(){
        String [] numeros = { "zero" , "un" , "dos" , "tres"};
        Arrays.sort(numeros);
        for ( int i = 0; i < numeros.length-1 ; i++){
            assertTrue(numeros[i].compareTo((numeros[i+1])) < 0 );
        }
    }

}
