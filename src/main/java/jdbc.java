import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager


                        .getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "7275@5998")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from emp_data");
            //System.out.println(resultSet);
            while (resultSet.next()) {
                String first_name = resultSet.getString("start_date" );
                System.out.println(first_name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

