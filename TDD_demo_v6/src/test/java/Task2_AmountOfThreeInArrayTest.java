import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_AmountOfThreeInArrayTest {
    @Test
    public void returnAmountOfThreeInArray(){
        AmountOfThreeInArray testObject = new AmountOfThreeInArray();
        int[] arr = testObject.creatArrayOfDesiredLength(5);

        int actual = testObject.amountOfThree(arr);
        Assertions.assertEquals(5,actual);

    }


}
