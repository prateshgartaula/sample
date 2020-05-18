package com.cs623.paper_review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MultipleInsert {

	public static void main(String[] args) {
		String sqlInsertAuthor = "INSERT INTO author (firstname, lastname, author_emailaddress) VALUES (?,?,?)";
		String sqlInsertPaper = "INSERT INTO paper ( paper_id, title, author_emailaddress, abstract, filename) VALUES (?,?,?,?,?)";
		
       // String sqlQuery = sqlInsertAuthor + sqlInsertPaper;
        
        List<Author> author = new ArrayList<>();
        author.add(new Author("fname4", "lname4", "author111@yahoo.com"));
        author.add(new Author("fname5", "lname5", "author222@yahoo.com"));
        author.add(new Author("fname6", "lname6", "author333@yahoo.com"));
        
        List<Paper> paper = new ArrayList<>();
        paper.add(new Paper(4, "title4", "author111@yahoo.com", "infrastructure", "filename1"));
        paper.add(new Paper(5, "title5", "author222@yahoo.com", "need protocol", "filename2"));
        paper.add(new Paper(6, "title6", "author333@yahoo.com", "development", "filename3"));
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             
            Connection conn = DriverManager.getConnection(
                                        DbContract.HOST+DbContract.DB,
                                        DbContract.USER,
                                        DbContract.PASSWORD);
            //first query
            PreparedStatement preparedInsert1 = conn.prepareStatement(sqlInsertAuthor);
            int insertions_author = 0;
            for (Author guy : author) {
                preparedInsert1.setString(1, guy.getFirstName());
                preparedInsert1.setString(2, guy.getLastName());
                preparedInsert1.setString(3, guy.getEmailAddress());
                 
                insertions_author += preparedInsert1.executeUpdate();
            }
            System.out.println(insertions_author+" records added");
            //conn.close();
            
            //second query
            PreparedStatement preparedInsert2 = conn.prepareStatement(sqlInsertPaper);
            int insertions_paper = 0;
            for (Paper p : paper) {
                preparedInsert2.setInt(1, p.getPaper_id());
                preparedInsert2.setString(2, p.getAuthor_emailaddress());
                preparedInsert2.setString(3, p.getTitle());
                preparedInsert2.setString(4, p.getPaper_abstract());
                preparedInsert2.setString(5, p.getFilename());
                 
                insertions_paper += preparedInsert2.executeUpdate();
            }
            System.out.println(insertions_paper+" records added");
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
         
 
    }
}
