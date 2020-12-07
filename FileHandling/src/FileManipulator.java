import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulator {
	private String fileName;

	public FileManipulator(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String read() throws IOException {
		String all = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName));
			String s = null;
			while ((s = in.readLine()) != null) {
				all = s + "\n";
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return all;
	}

	public boolean write(String s) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(s);// to write the contents in the file.
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return false;
		} catch (IOException e) {
			return false;
		}
		return true;

	}

	public boolean append(String s) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true ));
			bw.newLine();// this makes sure that the file isnt re written.
			bw.write(s);
			bw.newLine();// this makes sure that the file isnt re written.
			bw.close();// this closes the file
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;

	}

}
