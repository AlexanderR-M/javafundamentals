package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.spi.AbstractSelector;
import java.util.Iterator;

public class FileOperations {
	public static void main(String[] args) {
		File file = new File("/alex/user.log");

		File directory = new File("/Alex/logs/");
		System.out.println("working directory : " + System.getProperty("user.dir"));
		System.out.println(file.isAbsolute());
		System.out.println(file.getAbsolutePath());

		createPath(directory);
		createFile(file);

		createAbsolutePath();
		// create directory using absolute path

		writeFile();

		readFile();
		
		bufferedRead();
		
		bufferedWriter();
	}

	private static void bufferedWriter() {
		try {
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter("log.txt"));
			writer.write("manolo" + ";" + "alex");
			writer.newLine();
			writer.write("Pablo" + ";" + "pablo@");
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void bufferedRead() {
		try {
			System.out.println();
			System.out.println("buffered reader");
			BufferedReader br = 
					new BufferedReader(new FileReader("log.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void readFile() {
		 
		try {
			FileReader reader = new FileReader("log.txt");
	
			
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			//check the condition first before executing the while body
			int c;
//			//if we have read '-1' the loop finishes
			while ((c = reader.read()) != -1) {
				System.out.println(c);
			}
			
			
			
			c = reader.read();
			while (c != -1) {//check if we have reached the end of the file
				System.out.println((char)c);
				
				c = reader.read();
			}
			
			reader.close();
			reader =  new FileReader("log.txt");
//			/**
//			 * execute the commands inside the "do" body first, then check the condition
//			 * if its true, repeat the execution
//			 */
			c = 0;
			do {
				c = reader.read();
				System.out.println((char)c);
			} while (c != -1);
			reader.close();
		
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}

	
	private static void writeFile() {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("log.txt");
			writer.write("Black holes");
			writer.write("Pablo");
			writer.write(8);
			// Close the writer and refresh the data to the file
			writer.close();
			// refresh data we have written to the file
			// writer.flush
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void createAbsolutePath() {
		File absoluteDir = new File(System.getProperty("user.dir") + "/logs/user.log");
		absoluteDir.mkdir();

	}

	private static void createPath(File file) {
		// TODO Auto-generated method stub
		System.out.println(file.isAbsolute());
		System.out.println(file.getAbsolutePath());

		file.getParentFile().mkdirs();
	}

	private static void createFile(File file) {
		// TODO Auto-generated method stub

		if (file.exists()) {
			System.out.println("the log file exists");

		} else {
			System.out.println("the log file does not exist");
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// with try catch, we can continue executing the code without interruption
			System.out.println("finished");
		}
	}

}
