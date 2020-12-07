import java.io.IOException;

public class FileDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileManipulator sam=new FileManipulator("ada.txt");
		sam.write("These are the original contents");
		System.out.println(">This is the original contents of the file");
		System.out.println(sam.read());
		boolean x = sam.write("This clears the contents of the file, and adds this string");
		System.out.println(">Write was succesful? - " + x);
		System.out.println(sam.read());
		boolean y = sam.append("this is added to the file without rewriting");
		System.out.println(">Write was succesful? - " + y);
		System.out.println(sam.read());

	}

}
