package com.example.jdbc_sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyJdbc {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdc-setup", "root", "Steena@96");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from `jbdc-setup`.`people`");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));
            }
            // Close the ResultSet, Statement, and Connection when done
            resultSet.close();
            statement.close();
            connection.close();
        }  catch (SQLException e) {
        Logger.getLogger(MyJdbc.class.getName()).log(Level.SEVERE, "An SQL exception occurred", e);
    }

}
}
