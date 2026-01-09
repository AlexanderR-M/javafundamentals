package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import oopmodeling.addressbook.Contact;

public class FileUtil {
	public static void writeToFile(String content, String file) {
		try(BufferedWriter writer = 
					new BufferedWriter(new FileWriter(file));) {
			writer.write(content);
			writer.newLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
