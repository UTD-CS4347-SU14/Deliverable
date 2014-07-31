/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MusicWizzard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spencer Fusco
 * @author Kristen Williams
 * @author Scarlett Hunt
 * @author Zack Urben
 */
public class Database {
    //Set up a String with the name for the DB driver.
    final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    //Set up a String for the URL of the DB we connect to.
    final String DB_URL = "jdbc:derby://localhost:1527/MusicStore";
    Connection connection;
    Statement statement = null;
    ResultSet rSet = null;
    ResultSetMetaData metaData;
    String query;
    
    /**
     * Connects to the MusicStore database
     */
    public Database() {

        try {
            Class.forName(this.JDBC_DRIVER);// .newInstance();
            this.connection = DriverManager.getConnection(this.DB_URL);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         
    }// End Database Constructor
    
    /**
     * 
     * @param query 
     */
    public void insert(String query) {
        try {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 
     * @param query 
     */
    public void update(String query) {
        try {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * 
     * @param query 
     */
    public void delete(String query) {
        try {
            this.statement = this.connection.createStatement();
            this.statement.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param query 
     * @return this.rSet
     */
    public ResultSet select(String query) {
        try {
            System.out.println("query = " + query);
            this.statement = this.connection.createStatement();
            this.rSet = this.statement.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return this.rSet;
    }
}
