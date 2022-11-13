package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Main {


    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost/dvdrental";
        final String user = "postgres";
        final String password = "Mm103742";

        //DATABASE BAĞLAMAK
        Connection connection = null;
        String sql = "SELECT * FROM actor";
        String insertSql  = "INSERT INTO actor (first_name,last_name) VALUES  ('Musab','Olug') ";
        String preparedSql  = "INSERT INTO actor (first_name,last_name) VALUES (?,?) ";
        String setSql = "UPDATE actor SET first_name='Mansur' WHERE actor_id =201";
        String preparedSetSql ="UPDATE actor SET first_name=? WHERE actor_id = ?";
        String deleteSetSql = "DELETE FROM actor WHERE actor_id=201";
        String deletePreparedSetSql ="DELETE FROM actor WHERE actor_id=?";

        try{
         //   connection = DriverManager.getConnection(url,user,password);
          //   Statement statement = connection.createStatement();
           // ResultSet data = statement.executeQuery(sql);
           /* while (data.next()){
           //PRİNT FROM DATABASE
                System.out.println("ID :"+ data.getInt("actor_id") +" Name :"+ data.getString("first_name")+
                " Surname :"+ data.getString("last_name") );
               // System.out.println("Name :"+ data.getString("first_name"));
            }*/

            // data.next(); fonksiyonu: bu fonksiyon çağrıldığında bir sonraki satıra ilerler.
            // Böylece o satır üzerinde okuma yapabilmeyi sağlar. Okunacak kayıt kalmadığında “false” döner.

            //  data.first();“first” fonksiyonu: bu fonksiyon çağrıldığında sorgu sonucu kümesindeki
            //  ilk elemana erişim sağlar.

           //  data.last();“last” fonksiyonu: bu fonksiyon çağrıldığında sorgu sonucu kümesindeki
            //  son elemana erişim sağlar.

          //   data.absolute(); fonksiyonu: bu fonksiyon ile sorgu sonuç kümesindeki
            //   direkt olarak istenilen eleman işaret edilir. örneğin data.absolute(2) 2. eleman

            // ##################################################################################
            // INSERTSQL
          //  Statement statement = connection.createStatement();
            //System.out.println(statement.executeUpdate(insertSql));
            //###################################################################################

            //PREPARED STATEMENT
           /* PreparedStatement prst = connection.prepareStatement(preparedSql);
            prst.setString(1,"Bera");
            prst.setString(2,"OLUG");
            prst.executeUpdate();
            prst.close();*/


            //SET SQL
         //   Statement st = connection.createStatement();
           // st.executeUpdate(setSql);

            //PREPARED SET SQL
         /*   PreparedStatement preparedStatement = connection.prepareStatement(preparedSetSql);
            preparedStatement.setString(1,"Musab Bera ");
            preparedStatement.setInt(2,202);
            preparedStatement.executeUpdate();*/

            //DELETE SET SQL
          /*  Statement st = connection.createStatement();
            st.executeUpdate(deleteSetSql);*/

            //PREPARED DELETE SET SQL
           /* PreparedStatement prst = connection.prepareStatement(deletePreparedSetSql);
            prst.setInt(1,202);
            prst.executeUpdate();
            prst.close();*/


            //TRANSECTİONS
            connection = DriverManager.getConnection(url,user,password);
            connection  .setAutoCommit(false);

            PreparedStatement prst = connection.prepareStatement("INSERT INTO actor (first_name,last_name) VALUES (?,?)");
            prst.setString(1,"Musab");
            prst.setString(2,"Olug");
            prst.executeUpdate();

            if (true){
                throw new SQLException();
            }

            prst.setString(1,"Bera");
            prst.setString(2,"Olug");
            prst.executeUpdate();


            connection.commit();
            prst.close();
            connection.close();
        }catch (Exception e){
            if (connection != null){
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.print(e.getMessage());
        }
    }
}
