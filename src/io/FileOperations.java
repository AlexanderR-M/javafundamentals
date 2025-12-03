package io;

import java.io.File;

public class FileOperations {
	public static void main(String[] args) {
		File file = new File("/logs/user.log");
		
		File directory = new File("/Alex/logs");
		System.out.println("working directory : " + System.getProperty("user.dir"));
		System.out.println(file.isAbsolute());
		System.out.println(file.getAbsolutePath());
		
		createPath(directory);
		createFile(file);
		
		//create directory using absolute path
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
			
		}	
		else {
			System.out.println("the log file does not exist");
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//with try catch, we can continue executing the code without interruption
			System.out.println("finished");
		}
	}

}
