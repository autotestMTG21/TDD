import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Task5_returnRandomArrayListTest {


    @Test
        public void returnArrayListRandom(){
            SetArrayListRandom testObject = new SetArrayListRandom();
            /*Random ran = new Random();  // move to production code
            int[] arr = new int[100];
            for(int i =0; i<arr.length; i++){
                arr[i] = ran.nextInt(101);
            }*/

            int[] actual = testObject.arraylistRandom();

            /*for (int j = 0; j< actual.length; j++){ // just use for-loop to check the elements in array
                System.out.println( actual [j]);
            }*/

            for(int i=0; i< actual.length; i++){
                Assertions.assertTrue(actual[i]>0 && actual[i]<100);// 测试值类型为数组的测试方法，用到for循环
            }
            Assertions.assertTrue( actual.length == 100);

        }

}
