import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		// TODO File Ŭ���� ����
		File f = new File("e:\\kok\\Data\\test1.txt");
		if(f.exists()){
			System.out.println("���ϸ� : " + f.getName());
			System.out.println("����� : " + f.getPath());
			System.out.println("������ : " + f.getAbsolutePath());
			System.out.println("���ϱ��� : " + f.length() + "byte");
			System.out.println("������ ������ : " + new Date(f.lastModified()));
		}else{
			System.out.println("������ �������� �ʽ��ϴ�");
		}
	}
}
