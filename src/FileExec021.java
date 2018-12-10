import com.biz.files.service.*;

public class FileExec021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "src/우리말이름.txt";
		UserSe02 s = new UserSe02(readFile);
		
		s.readFile();
	}

}
