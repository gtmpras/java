import java.sql.*;

public class App {
    private static final String Url = "jdbc:mysql://localhost:3306/prasoon";
    private static final String user = "root";
    private static final String PASSWORD = "mysql";
    public static void main(String[] args) {
     //Connection con = null;
    
     try(Connection conn = DriverManager.getConnection(Url, user, PASSWORD)){
        System.out.println("Connection established");

        //creating tables
        //String sql = "Create table student_info (id INT PRIMARY KEY,name VARCHAR(50),address VARCHAR(50))";
        // String sql = "Insert into student_info values(1,'Milan Dangi', 'Narayanpur')";
        // Statement st = conn.createStatement();
        // st.executeUpdate(sql);
        // System.out.println("Table is created");

        //performing selecting operation
        String sql = "Select * from student_info";
        Statement st = conn.createStatement();
        ResultSet rslt = st.executeQuery(sql);
        while (rslt.next()) {
            System.out.println(rslt.getInt(1)+" "+rslt.getString("name"));
        }

        

     }
     catch(SQLException ex){
        ex.printStackTrace();
     }

    
    }
}
