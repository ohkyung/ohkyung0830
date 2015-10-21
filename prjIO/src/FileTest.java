import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		// TODO File 클래스 예제
		File f = new File("e:\\kok\\Data\\test1.txt");
		if(f.exists()){
			System.out.println("파일명 : " + f.getName());
			System.out.println("상대경로 : " + f.getPath());
			System.out.println("절대경로 : " + f.getAbsolutePath());
			System.out.println("파일길이 : " + f.length() + "byte");
			System.out.println("마지막 수정일 : " + new Date(f.lastModified()));
		}else{
			System.out.println("파일이 존재하지 않습니다");
		}
	}
}
