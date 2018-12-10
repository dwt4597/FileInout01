import java.io.*;

public class FilesExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "src/우리말이름.txt";
		FileReader fr;
		BufferedReader buffer;
		try {
			fr = new FileReader(name);
			buffer = new BufferedReader(fr);
			while (true) {
				String lines = buffer.readLine();
				//먼저 EOF를 검사하고
				if (lines == null) {
					break;
				}
				//통과되면 나머지 수행
				System.out.println(lines);
			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
