import java.sql.SQLException;

public class Employee {
    private EmployeeSystem employeeSystem;

    public Employee(EmployeeSystem employeeSystem){
        this.employeeSystem = employeeSystem;
    }

    public int checkEmployeeSalary(int ID) throws SQLException {
        int salary = employeeSystem.fetchSalary(ID);
        return salary;
    }
}
