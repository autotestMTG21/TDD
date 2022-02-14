import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_TwoStringIntoOneTest {
    @Test
    public void returnTwoString(){
        StringTogether st = new StringTogether();

        String input1 = "Adam";
        String input2 = "Ballard";

        String actual = st.setStringTogether(input1,input2);

        Assertions.assertEquals("AdamBallard",actual);
    }

}
