package pkg1.javaintro;
import pkg2.methods.*;

public class L27_InnerClass {
//			 < 내부 클래스>
// @ 사용클래스 : pkg2.methods.InnerExam
	
	public static void main(String[] args) {
		InnerExam t1 = new InnerExam();
		InnerExam.Cal cal1 = new t1.Cal();

	}
}
