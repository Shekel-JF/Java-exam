import java.sql.*;

public class databaseConnection
{
    public static void wypisz(Connection con)
    {
        Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery("select * from osoby")
        while(result.next())
        {
            System.out.println(result.getString("imie"));
        }
    }

    public static void main(String[] args) throws Exception
    {
        Connection connection = DriverManager.getConnection("localhost/mydatabase", "username", "password");
        wypisz(connection);
    }
}