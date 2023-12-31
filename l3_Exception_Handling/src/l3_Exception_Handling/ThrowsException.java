package l3_Exception_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			readFile();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void readFile() throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader f = new FileReader("");
		BufferedReader b = new BufferedReader(f);
		
	}
}
