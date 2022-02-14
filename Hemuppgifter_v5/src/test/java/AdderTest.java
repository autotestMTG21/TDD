import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    Adder testOjbect;

    @Test
    public void addTest(){
        // Arrange
        testOjbect = new Adder();
        int a = 1;
        int b = 5;
        int expected = 7;

        // Act
        int actual = testOjbect.add(a,b);

        // Assert
        assertEquals(expected,actual);

    }

}