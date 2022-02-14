import java.sql.*;

public class EmployeeSystem {

    public EmployeeSystem(){

    }

    public int fetchSalary(int id) throws SQLException {
        Connection conn = DriverManager.getConnection("DB URL");
        Statement statement = conn.createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM EMPLOYEE WHERE ID" +id+" ");
        int salary = rs.getInt("SALARY");
        return salary;
    }
}
