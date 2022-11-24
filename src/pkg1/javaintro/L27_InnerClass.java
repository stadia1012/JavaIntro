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
	
	
//		# 2.정적 중첩클래스 / static 클래스
		InnerExam2.Cal2 cal2 = new InnerExam2.Cal2();
		cal2.plus();
		System.out.println( cal2.value );  // 1
		cal2.plus();
		System.out.println( cal2.value );  // 2  -> static은 동일한 변수 공유
	}
}