import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {
    @Test
    public void twoIntoOne(){
        StringTwoIntoOne testObject = new StringTwoIntoOne();
        String a = "Hello";
        String b = "World";
        String actual = testObject.mergeTwoString(a,b);

        Assertions.assertEquals(a+b,actual);
    }

}
