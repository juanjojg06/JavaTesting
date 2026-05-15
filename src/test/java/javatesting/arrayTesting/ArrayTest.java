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
    public void provesOrdenarArray() {
        String[] numeros = {"zero", "un", "dos", "tres"};
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length - 1; i++) {
            assertTrue(numeros[i].compareTo((numeros[i + 1])) < 0);
        }
    }

        @Test

        public void facriArayParcialment() {

            int[] nums = { 0,1,2,3,4,5,6,7,8,9};
            Arrays.fill(nums,5,10,-1);


            for (int i = 5; i < nums.length ; i++) {
                assertTrue(nums[i] == -1);
            }

        }

        @Test

        public void copiaRangMatriu(){
        String[] dies = { "dilluns" , "dimarts" , "dimecres" , "dijous" , "divendres" , "dissabte" , "diumenge" };
        String[] feiners = Arrays.copyOfRange(dies, 0 , 5);

        assertTrue( feiners.length == 5);
        assertTrue(feiners[1].equals("dimarts"));

        String[] feinersEsclaus = Arrays.copyOfRange(feiners , 0 , 7);

        assertTrue(feinersEsclaus[0].equals("dilluns"));

        assertEquals(feinersEsclaus[5] , null);

        feinersEsclaus[5] = "dissabteDeFeina";
        feinersEsclaus[6] = "diaDeDescans";

            assertTrue(feinersEsclaus[6].equals("diaDeDescans"));

        }

        @Test

        public  void arraysIrregularsTest(){
            int[][] arrayIrregular = {{0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3},
                {0,1,2},
                {0,1},
                {0},
             };
            assertEquals(arrayIrregular.length ,  6 );
            assertEquals(arrayIrregular[0].length ,  6 );
            assertEquals(arrayIrregular[5].length ,  1 );

        }




    }


