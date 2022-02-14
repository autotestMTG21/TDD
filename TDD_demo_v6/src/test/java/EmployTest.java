import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EmployTest {

    private Employee employee;
    private EmployeeSystem employeeSystemMock;

    @BeforeEach
    public void setUp(){
        employeeSystemMock = mock(EmployeeSystem.class);
        employee = new Employee(employeeSystemMock);
    }

    @Test
    public void checkSalaryTest() throws SQLException {
        int salary = 45000;
        when(employeeSystemMock.fetchSalary(7)).thenReturn(salary);
        Assertions.assertEquals(45000, employee.checkEmployeeSalary(7));

    }
}
