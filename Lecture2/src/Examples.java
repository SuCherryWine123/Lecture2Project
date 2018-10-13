import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		readOneByte();
//		readOneChar();
//		readArrayOfByte();
//		readArrayOfChar();
		// writeByte();
//		readAndWriteBytes();
//		writeChar();
		readAndWriteChars();
	}

	private static void readOneByte() {
		InputStream input = null;
		try {
			input = new FileInputStream(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\bytes.txt");
			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;
				System.out.print(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readOneChar() {
		Reader reader = null;
		try {
			reader = new FileReader("C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\chars.txt");
			int intVal;
			while ((intVal = reader.read()) >= 0) {
				char charVal = (char) intVal;
				System.out.print(charVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readArrayOfByte() {
		InputStream input = null;
		try {
			input = new FileInputStream(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\bytes.txt");
			int length;
			byte[] byteBuff = new byte[10];
			while ((length = input.read(byteBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					byte byteVal = byteBuff[i];
					System.out.print(byteVal);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void readArrayOfChar() {
		Reader reader = null;
		try {
			reader = new FileReader("C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\chars.txt");
			int length;
			char[] charBuff = new char[10];
			while ((length = reader.read(charBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					char charVal = charBuff[i];
					System.out.print(charVal);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writeByte() {
		OutputStream output = null;
		try {
			output = new FileOutputStream(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\writebytes.txt");
			byte byteVal = 100;
			output.write(byteVal);

			byte[] byteVal1 = { 0, 63, 127 };
			output.write(byteVal1);

			output.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readAndWriteBytes() {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\bytes.txt");
			output = new FileOutputStream(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\readandwritebytes.txt");
			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;
				output.write(byteVal);
				output.flush();
			}

			byte[] byteBuff = new byte[10];
			int length;
			while ((length = input.read(byteBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					byte byteVal = byteBuff[i];
					output.write(byteVal);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writeChar() {
		Writer writer = null;
		try {
			writer = new FileWriter(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\writeonechars.txt");
			char charVal = 'a';
			writer.write(charVal);

			char[] charbuff = { 'a', 'b', 'c' };
			writer.write(charbuff);

			String stringVal = "Hello World";
			writer.write(stringVal);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readAndWriteChars() {
		InputStream input = null;
		OutputStream output = null;
		Writer writer = null;
		try {
			input = new FileInputStream(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\bytes.txt");
			writer = new FileWriter(
					"C:\\Su Cherry Wine\\workspaceSEadvance\\SEAdvanceLecture2\\Lecture2\\writeandwritechars.txt");
			int intVal;
			while ((intVal = input.read()) >= 0) {
				char charVal = 'a';
				writer.write(charVal);
				writer.flush();
			}

			byte[] byteBuff = new byte[10];
			int length;
			while ((length = input.read(byteBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					byte byteVal = byteBuff[i];
					output.write(byteVal);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
