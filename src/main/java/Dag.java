import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static java.time.temporal.ChronoUnit.DAYS;


public class Dag{
    public long returnDays(LocalDate dateOfBirth, LocalDate today){

        long daysDiff = DAYS.between(dateOfBirth, today); // calculate time between two days
        return daysDiff;
    }


}
