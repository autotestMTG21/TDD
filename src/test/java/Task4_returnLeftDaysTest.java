import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Task4_returnLeftDaysTest {

    @Test
    public void returnLeftDag(){
        Dag testObject = new Dag();

        LocalDate dateOfBirth = LocalDate.of(1990, 1, 1);
        LocalDate today = LocalDate.now();

        long actual = testObject.returnDays(dateOfBirth,today);

        Assertions.assertEquals(11727,actual);

    }

}