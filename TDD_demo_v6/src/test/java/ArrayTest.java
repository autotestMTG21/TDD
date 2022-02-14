//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayTest {
    @Test
    public void returnArrayWithoutZeros(){
        IntArray testObject = new IntArray();
        int [] myArray = new int[5];

        for(int i =0; i< myArray.length; i++){
            myArray[i] = i;

        }

        int[] actual = testObject.returnsArrayWithReplaceZeroWithOne(myArray);

        /*for(int i : actual){
            Assertions.assertTrue(i != 0);
        }*/

        for(int i : actual){
            assertTrue(i != 0);
        }
    }

}
