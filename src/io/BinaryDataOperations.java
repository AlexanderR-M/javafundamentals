package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryDataOperations {
	public static void main(String[] args) {
		
		writeBinaryData();
		try {
			readBinaryData();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	

	private static void readBinaryData() throws FileNotFoundException {
		DataInputStream is = new DataInputStream(new FileInputStream(""));
		try {
			is.readChar();
			is.readInt();
			is.readUTF();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private static void writeBinaryData() {
		
		try (DataOutputStream os =  new DataOutputStream(new FileOutputStream("data.bat"))){
			
			os.writeChar(25);
			os.writeInt(32);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
