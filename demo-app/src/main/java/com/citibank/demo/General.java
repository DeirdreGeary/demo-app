package com.citibank.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class General {

	
	 public static void WriteProps() {

			Properties prop = new Properties();
			OutputStream output = null;

			try {

	//			output = new FileOutputStream("/home/student/git/demo-app/demo-app/src/main/resources/config.properties");
				output = new FileOutputStream("src/main/resources/config.properties");

				// set the properties value
				prop.setProperty("databasename", "localhost");
				prop.setProperty("dbuser", "mkyong");
				prop.setProperty("dbpassword", "password");

				// save properties to project root folder
				prop.store(output, null);

			} catch (IOException io) {
				io.printStackTrace();
			} finally {
				if (output != null) {
					try {
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
		  }

public static void ReadProps() {

	Properties prop = new Properties();
	InputStream input = null;

	try {

//			output = new FileOutputStream("/home/student/git/demo-app/demo-app/src/main/resources/config.properties");
		input = new FileInputStream("src/main/resources/config.properties");

		// set the properties value
		// load a properties file
				prop.load(input);

				// get the property value and print it out
				System.out.println(prop.getProperty("databasename"));
				System.out.println(prop.getProperty("dbuser"));
				System.out.println(prop.getProperty("dbpassword"));

			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		  }
}
