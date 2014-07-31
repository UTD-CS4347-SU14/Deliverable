/**
 * The University of Texas at Dallas
 * CS 4347.0U1 - Final Project Deliverable
 *
 * The Wizard's Music Shop
 * https://github.com/UTD-CS4347-SU14/Deliverable
 *
 * @author Kristen Williams
 * @author Scarlett Hunt
 * @author Spencer Fusco
 * @author Zack Urben
 */
package MusicWizzard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    //Set up a String with the name for the DB driver.
//    final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    //Set up a String for the URL of the DB we connect to.
    final String DB_URL = "jdbc:derby:MusicWizzardDB;create=true";
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
//            Class.forName(this.JDBC_DRIVER);// .newInstance();
            this.connection = DriverManager.getConnection(this.DB_URL);
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            this.seedDB();
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

        } catch (SQLException e) {
            e.printStackTrace();
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

        } catch (SQLException e) {
            e.printStackTrace();
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param query
     * @return this.rSet
     */
    public ResultSet select(String query) {
        try {
            this.statement = this.connection.createStatement();
            this.rSet = this.statement.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return this.rSet;
    }

    public void seedDB() {
        try {
            String[] sql = new String[]{
                "create table customer ("
                + "CID int primary key,"
                + "CFname varchar(15) not null,"
                + "CLname varchar(15) not null,"
                + "CMiddle char not null,"
                + "CEmail varchar(256) not null,"
                + "CPhone char(10) not null"
                + ")",
                "create table employee("
                + "EID int primary key,"
                + "ESSN int not null,"
                + "EFname varchar(15) not null,"
                + "ELname varchar(15) not null,"
                + "EMiddle char not null,"
                + "EHours int not null,"
                + "Active boolean default true"
                + ")",
                "create table album("
                + "AlbumID int primary key,"
                + "ArtistID int not null,"
                + "ReleaseDate date not null"
                + ")",
                "create table artist("
                + "ArtistID int primary key,"
                + "ArtistFName varchar(20) not null,"
                + "ArtistLName varchar(20) not null,"
                + "ArtistMName char,"
                + "Genre varchar(30) not null"
                + ")",
                "alter table album "
                + "add foreign key (ArtistID)"
                + "references artist(ArtistID)",
                "create table inventory("
                + "ItemID int primary key,"
                + "ItemName varchar(30) not null,"
                + "ItemPrice decimal(10,2) not null,"
                + "ItemStock int not null,"
                + "ArtistID int,"
                + "foreign key (ArtistID) references artist(ArtistID)"
                + ")",
                "create table sold("
                + "SoldID int primary key,"
                + "TransactionID int not null,"
                + "Quantity int not null,"
                + "ItemID int not null,"
                + "ItemPrice decimal(10,2) not null,"
                + "foreign key (ItemID) references inventory(ItemID)"
                + ")",
                "create table storetransaction("
                + "TransactionID int primary key,"
                + "Total decimal(10,2) not null,"
                + "SubTotal decimal(10,2) not null,"
                + "Tax decimal(10,2) not null,"
                + "CustomerID int not null,"
                + "EmployeeID int not null,"
                + "TimeSold timestamp,"
                + "foreign key (CustomerID) references customer(CID),"
                + "foreign key (EmployeeID) references employee(EID)"
                + ")",
                "alter table sold "
                + "add foreign key (TransactionID)"
                + "references storetransaction(TransactionID)",
                "insert into customer "
                + "values (1, 'Tim', 'Smith', 'A', 'timsmith@email.com', '1234567890')",
                "insert into customer "
                + "values (2, 'Jim', 'Bob', 'E', 'jimbob@email.com', '9876543321')",
                "insert into customer "
                + "values (3, 'Sara', 'Jules', 'E', 'sara1234@email.com', '2345632278')",
                "insert into customer "
                + "values (4, 'Troy', 'Jules', 'R', 'troyjules@email.com', '2345632278')",
                "insert into customer "
                + "values (5, 'Josh', 'Gunter', 'C', 'joshgunter@email.com', '7867657766')",
                "insert into employee "
                + "values (1, 333451234, 'Zack', 'Roberts', 'T', 40, true)",
                "insert into employee "
                + "values (2, 987654444, 'Greg', 'Green', 'G', 32, true)",
                "insert into employee "
                + "values (3, 346667656, 'Chris', 'Smith', 'C', 20, true)",
                "insert into employee "
                + "values (4, 870987765, 'Stephen', 'Hebrew', 'H', 18, true)",
                "insert into employee "
                + "values (5, 765565543, 'Sara', 'Adam', 'A', 40, true)",
                "insert into artist "
                + "values (1, 'Green', 'Jordan', 'A', 'Folk')",
                "insert into artist "
                + "values (2, 'Tim', 'Bishop', 'A', 'Rock')",
                "insert into artist "
                + "values (3, 'Ryan', 'Raddon', 'K',  'Dance')",
                "insert into artist "
                + "values (4, 'Burt', 'Wonder', 'F', 'Rock')",
                "insert into artist "
                + "values (5, 'Ricky', 'Bobby', 'G', 'Country')",
                "insert into album "
                + "values (1, 1, '2012-12-01')",
                "insert into album "
                + "values (2, 2, '2014-01-22')",
                "insert into album "
                + "values (3, 1, '2008-09-12')",
                "insert into album "
                + "values (4, 3, '2006-11-01')",
                "insert into album values (5, 5, '1999-08-22')",
                "insert into inventory values"
                + "(1, 'CD', 12.99, 25, 1)",
                "insert into inventory values"
                + "(2, 'Poster', 8.99, 100, 2)",
                "insert into inventory values"
                + "(3, 'Record', 20.99, 5, 2)",
                "insert into inventory values"
                + "(4, 'Shirt', 12.99, 200, 3)",
                "insert into inventory values"
                + "(5, 'CD', 12.99, 250, 5)",
                "insert into storetransaction(TransactionID, Total, SubTotal, Tax, CustomerID, EmployeeID)"
                + "values(1, 14.87, 12.99, 1.88, 1, 1)",
                "insert into storetransaction(TransactionID, Total, SubTotal, Tax, CustomerID, EmployeeID)"
                + "values(2, 30.00, 25.99, 4.01, 2, 1)",
                "insert into storetransaction(TransactionID, Total, SubTotal, Tax, CustomerID, EmployeeID)"
                + "values(3, 35.67, 31.98, 3.69, 1, 3)",
                "insert into storetransaction(TransactionID, Total, SubTotal, Tax, CustomerID, EmployeeID)"
                + "values(4, 13.00, 10.99, 2.01, 4, 4)",
                "insert into storetransaction(TransactionID, Total, SubTotal, Tax, CustomerID, EmployeeID)"
                + "values(5, 30.00, 25.99, 4.01, 3, 5)",
                "insert into sold values (1, 1, 1, 1, 12.99)",
                "insert into sold values (2, 2, 1, 3, 25.99)",
                "insert into sold values (3, 3, 2, 4, 15.99)",
                "insert into sold values (4, 4, 1, 2, 10.99)",
                "insert into sold values (5, 5, 1, 3, 25.99)",};

            this.statement = this.connection.createStatement();
            for (String q : sql) {
//                System.out.println("{DB}: " + q);
//                System.out.println(this.statement.executeUpdate(q));
                this.statement.executeUpdate(q);
            }
        } catch (SQLException e) {
            // any error means the tables exist
        }
    }
}
