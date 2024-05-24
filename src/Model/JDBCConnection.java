package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    
      private Connection connection;

      //This one get connection
      
    public Connection getConnection() {
        return connection;
    }
    
//This one create the connection
    
    public void connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/SpeakUp", "root", "24071195");

        } catch (ClassNotFoundException e) {

            System.out.println(e);

        }
    }
//This one just disconnect from MySQL
    
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Succesfully connected");
            }
        } catch (SQLException e) {
            System.out.println("Error to disconect");
        }
    }

    
}
