import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3_ReverseArrayTest {
    @Test
    public void returnArray(){
        IntArrayReverse testObject = new IntArrayReverse();
        int[] myArray = new int[5];

        for(int i=0; i< 5; i++){
            myArray[i] = i+1;
        }
        /*for (int j = 0; j<5; j++){
            System.out.println(myArray [j]);
        }*/

        int[] actual = testObject.arrayReverse(myArray);

        /*for (int j = 0; j<5; j++){
            System.out.println(myArray [j]);
        }*/

        Assertions.assertArrayEquals(myArray, actual);
    }
}