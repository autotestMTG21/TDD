import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.test.util.ReflectionTestUtils;


import java.time.Duration;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


class BigClassTest {
    BigClass testOjbect;

    // @BeforeEach  Happens before each test
    @BeforeEach
    public void beforeEach(){
        System.out.println("This happens before each test in this class");

    }

    // @BeforeAll Happens once before tests
    @BeforeAll
    public static void beforeAll(){
        System.out.println("This happens before all tests in this class");
    }

    //  @AfterEach Happens after each test
    @AfterEach
    public void afterEach(){
        System.out.println("This happens after each test in this class");
    }

    // @AfterAll  Happens once after tests
    @AfterAll
    public static void afterAll(){
        System.out.println("This is the last thing that is run before the test class is finished");
    }

    @Test // If there are no getters, use ReflectionTestUtils
    public void testBigClassConstructorWithNumber(){
        int number = 5;
        testOjbect = new BigClass(number);

        assertEquals(number, ((Integer) ReflectionTestUtils.getField(testOjbect,"number")),0);
    }

    @Test
    public void testBigClassConstructorWithText(){
        String text = "Hello";
        testOjbect = new BigClass(text);

        assertEquals(text,((String) ReflectionTestUtils.getField(testOjbect,"text")));
    }

    @Test
    public void testkBigClassConstructorwithTwoParameters(){
        int number = 5;
        String text = "Hello";
        testOjbect = new BigClass(number,text);

        assertEquals(number, ((Integer) ReflectionTestUtils.getField(testOjbect,"number")),0);
        assertEquals(text,((String) ReflectionTestUtils.getField(testOjbect,"text")));
    }

    @Test
    public void testgetNumber(){
        int number = -5;
        testOjbect = new BigClass(number);

        int actual = testOjbect.getNumber();

        assertEquals(-5,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,5,6,10})
    public void testSetNumber(int number){
        testOjbect = new BigClass(number);
        int actual = testOjbect.getNumber();

        assertTrue(actual>0);
    }

    @Test
    public void testgetText(){
        String text = "hello world";
        testOjbect = new BigClass(text);

        assertEquals("hello world",testOjbect.getText());
    }

    @ParameterizedTest
    @ValueSource (strings= {"hejsan","god morgon","tack","hejdå"})
    public void testsetText(String text){
        testOjbect = new BigClass(text);
        String actual = testOjbect.getText();
        boolean result = StringUtils.isNotEmpty(actual);// isNotBlank

        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource (strings = {"Hello", "daytime","stuDent"})
    public void testReturnUpperCase(String text){
        testOjbect = new BigClass(text);
        String actual = testOjbect.returnStringUppCase(text);
        boolean result = StringUtils.isAllUpperCase(actual);

        assertTrue(result);
        // System.out.println("Text is " + actual);

    }

    @ParameterizedTest
    @ValueSource (strings = {"Hello", "daytime","stuDent"})
    public void testReturnNull(String text){
        testOjbect = new BigClass(text);
        String actual = testOjbect.returnStringNull(text);
        assertNull(actual);
        System.out.println(actual);
    }


    @Test
    public void testAddAndSum(){
        int number = 10;
        testOjbect = new BigClass(number);
        int actual = testOjbect.addAndSum(number);

        assertEquals(25 ,actual);

    }

    @Test
    public void testToString(){
        int number = 20;
        String text = "HelloWorld";
        testOjbect = new BigClass(number,text);
        String actual = testOjbect.toString();

        assertEquals(20+"HelloWorld", actual);
    }

    /*@Test
    public void testToString1(){

        int number = -3;
        String text = "NiCe";
        testOjbect = new BigClass(number,text);
        String actual = testOjbect.toString();

        assertEquals("BigClass{number=-3, text='NiCe'}", actual);

        System.out.println(actual);

    }*/

}