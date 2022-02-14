import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    Die die;

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

    @Test
    public void


}