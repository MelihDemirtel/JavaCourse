import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            //statement = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values('Düzce','TUR','Düzce',50000)");
           String sql = "delete from city where id = ?";
           statement = connection.prepareStatement(sql);
           statement.setInt(1,4081);

            int result = statement.executeUpdate();
            System.out.println("Delete OK");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select code,name,continent,region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("code"),
                        resultSet.getString("name"),
                        resultSet.getString("continent"),
                        resultSet.getString("region")));

                System.out.println(resultSet.getString("name"));
            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            //statement = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values('Düzce','TUR','Düzce',50000)");
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,60000);


            int result = statement.executeUpdate();
            System.out.println("Insert OK");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            //statement = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values('Düzce','TUR','Düzce',50000)");
            String sql = "update city set population = 80000 where id = 4081";
            statement = connection.prepareStatement(sql);

            int result = statement.executeUpdate();
            System.out.println("Update OK");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

}
