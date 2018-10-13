import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		readOneByte();
		readOneChar();
	}
	
	private static void readOneByte() {
		try {
			InputStream input = new FileInputStream("C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\bytes.txt");
		int intVal;
		while ((intVal = input.read()) >= 0) {
			byte byteVal = (byte) intVal;
			System.out.print(byteVal);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void readOneChar() {
		try {
			Reader reader = new FileReader("C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\chars.txt");
		int intVal;
		while ((intVal = reader.read()) >= 0) {
			char charVal = (char) intVal;
			System.out.print(charVal);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
