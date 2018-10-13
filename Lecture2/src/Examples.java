import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readOneByte();
	}
	
	private static void readOneByte() {
		try {
			InputStream input = new FileInputStream("C:\\Su Cherry Wine\\JavaSE Basic Platform\\Streams\\bytes.txt");
		int intVal;
		while ((intVal = input.read()) >= 0) {
			byte byteVal = (byte) intVal;
			System.out.print(byteVal);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
