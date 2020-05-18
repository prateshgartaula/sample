package com.cs623.paper_review;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Pratesh Gartaula
 * change sqlSelectQuery = prop.getProperty("q1");
 * there is a properties file which has q1 and q2
 */
public class PreparedSelect2 {

	public static void main(String[] args) throws IOException {
		// String sqlSelectQuery = "SELECT * FROM author";

		FileInputStream fis = new FileInputStream("/CS623database/resources/sqlQueries.properties");
		Properties prop = new Properties();
		// load the content of myfile.properties into java.util.Properties class
		prop.load(fis);
		// read value from java.util.Properties
		String sqlSelectQuery1 = prop.getProperty("q2");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(DbContract.HOST + DbContract.DB, DbContract.USER,
					DbContract.PASSWORD);

			// prepared statement: QUERY
			PreparedStatement preparedSelect = conn.prepareStatement(sqlSelectQuery1);
			ResultSet rs1 = preparedSelect.executeQuery(); // added for select

			// to print result of select statement
			try {
				while (rs1.next()) {
					String reviewer_emailaddress = rs1.getString(1);
					String recommendation = rs1.getString(2);
					int review_id = rs1.getInt(3);
					int paper_id = rs1.getInt(4);
					String author_emailaddress = rs1.getString(5);
					int meritscore = rs1.getInt(6);
					int readability = rs1.getInt(7);
					int originalscore = rs1.getInt(8);
					int relevancescore = rs1.getInt(9);
					
//int paper_id, String author_emailaddress, String title, String paper_abstract, String filename
					System.out.printf("%s\t%s\t%d\t%d\t%s\t%d\t%d\t%d\t%d\n", reviewer_emailaddress, recommendation, review_id, paper_id, author_emailaddress, meritscore, readability,originalscore, relevancescore );
				}

			} catch (java.sql.SQLException sqle) {
				sqle.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
