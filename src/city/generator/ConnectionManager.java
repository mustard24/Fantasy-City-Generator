/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city.generator;
import java.sql.*;

/**
 *
 * @author Dustin Moody
 */
public class ConnectionManager {
    Connection conn;
    Statement stmt;
    ConnectionManager(){
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String server ="jdbc:mysql://localhost:3306/db_fantasycities";
            String username = "root";
            String password = "CS310";
            System.out.println("Connecting to " + server + "...");
            conn = DriverManager.getConnection(server, username, password);
            stmt = conn.createStatement();
            if(conn.isValid(0)){
                System.out.println("Successful Connection");
            }
            else{
                System.out.println("Connection failed!"); 
            }
        }
        catch (Exception e){
            System.err.println(e.toString());
            
        }
        
            
                
    }
    public Boolean login(String username, String password){
        String query;
        PreparedStatement pstmt;
        boolean results;
        ResultSet resultset = null;
        ResultSetMetaData metadata = null;
        int columnCount = 0;
        try{
            if (conn.isValid(0)){
                query = "SELECT * FROM USER WHERE username = ? AND password = ?";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                results = pstmt.execute();
                while ( results || pstmt.getUpdateCount() != -1) {
                    if (results){
                        resultset = pstmt.getResultSet();
                        metadata = resultset.getMetaData();
                        columnCount = metadata.getColumnCount();
                        while(resultset.next()){
                            // Need to contemplate ways to load up the next screen with this info
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.err.println(e.toString());
            
        }
        return false;
    }
}

