/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.derby.jdbc.ClientDriver;
//import tic.tac.toe.User;
import java.util.ArrayList;
import java.util.List;


public class DAL {

    User checker = new User();
    static Connection con;

    public static void initDatabase() {

        try {

            DriverManager.registerDriver(new ClientDriver());
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/AppDatabase", "root", "root");

        } catch (SQLException ex) {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void selectPalyer(User client) //Client.getUsername()
    {
        try {

            initDatabase();

            Statement stmt = con.createStatement();
            String queryString = new String("Select * from Client where USERNAME = '" + client.getUsername() + "'");
            ResultSet rs = stmt.executeQuery(queryString);

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void InsertPlayer(User client) {
        try {

            initDatabase();
            Statement stmt = con.createStatement();

            System.out.println(client.getPassword());
            System.out.println(client.getUsername());
            System.out.println(client.getScore());

            String queryString = new String("INSERT INTO Client (USERNAME, PASSWORD, SCORE) VALUES ('" + client.getUsername() + "','" + client.getPassword() + "', 0)");
            stmt.executeUpdate(queryString);

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void UpdatePlayer(User client) //mainly for updating the scores after each game
    {
        try {

            initDatabase();
            PreparedStatement ps = con.prepareStatement("Update into Client Values(?,?,?)");
            ps.setString(1, client.getUsername());
            ps.setString(2, client.getPassword());
            ps.setInt(3, client.getScore());
            ps.executeUpdate();

            ps.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*public static ResultSet selectAll() throws SQLException {

        initDatabase();

        Statement stmt;
        stmt = con.createStatement();
        String queryString = new String("Select * from ROOT.PALYERSDATA");
        ResultSet r = stmt.executeQuery(queryString);
        while (r.next()) {
            System.out.println(r);
        }

        stmt.close();
        con.close();
        return r;
    }*/
    
public static List<User> retrieveAll ()
    {
       List<User> clients = new ArrayList<>();
       
            try {     
                
                initDatabase();
                
                Statement stmt = con.createStatement() ; 
                String queryString = new String("Select * from Client");
                
                ResultSet rs = stmt.executeQuery(queryString);
                
                int counter = 0;
                
                while(rs.next()){
                    System.out.println("retrieveAll " + rs.getString(1));
                    User client = new User();
                    client.setUsername(rs.getString(1));
                    client.setScore(rs.getInt(3));
                    //clients.add(counter, client);
                    clients.add(client);
                    counter++;
                }
                
                stmt.close();
                con.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
     
        return clients;
    }

   
    public static User checkUserExits(String username){
        
        User user = new User();
        
        try {
            
            initDatabase();
            
            Statement stmt = con.createStatement() ;
            String queryString = new String("Select * From Client Where username = ?"); 
            
            PreparedStatement pst = con.prepareStatement(queryString);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                user.setScore(rs.getInt(3));
                
            } else {
                user = null;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }

}
