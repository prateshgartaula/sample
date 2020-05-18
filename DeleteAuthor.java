package com.cs623.paper_review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeleteAuthor {

	public static void main(String[] args) {
		
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             
            Connection conn = DriverManager.getConnection(
                                        DbContract.HOST+DbContract.DB,
                                        DbContract.USER,
                                        DbContract.PASSWORD);
           
            PreparedStatement preparedDelete = conn.prepareStatement("DELETE FROM author where author_id = 10");
           
            preparedDelete.executeUpdate();
            
            System.out.println(" records deleted");
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); //this prints the ERROR message in console
           // System.out.println(e);
        }
         
 
    }
}
