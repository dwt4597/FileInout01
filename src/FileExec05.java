import com.biz.files.service.*;

public class FileExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "src/우리말이름.txt";
		UserSe05 s = new UserSe05(readFile);
		
		s.readFile();
	}

}
