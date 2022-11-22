package pkg1.javaintro;
import pkg2.methods.*;

public class L27_InnerClass {
//			 < 내부 클래스>
// @ 사용클래스 : pkg2.methods.InnerExam
	
	public static void main(String[] args) {
//		# 1.중첩클래스 / 인스턴스 클래스
		InnerExam t1 = new InnerExam();
		InnerExam.Cal cal1 = t1.new Cal();   // 순서에 주의! new t1.Cal();이 아님
		cal1.plus();
		System.out.println(cal1.value);  // 1
	}
}
