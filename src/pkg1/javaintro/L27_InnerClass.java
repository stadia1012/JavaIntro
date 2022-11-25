package pkg1.javaintro;
import pkg2.methods.*;

public class L27_InnerClass {
//			 < 내부클래스/ 익명클래스>
// @ 사용클래스 : pkg2.methods.InnerExam, 2, 3, Action, MyAction
	
	public static void main(String[] args) {
//		# 1.중첩클래스 / 인스턴스 클래스
		InnerExam t1 = new InnerExam();
		InnerExam.Cal cal1 = t1.new Cal();   // 순서에 주의! new t1.Cal();이 아님
		cal1.plus();
		System.out.println(cal1.value);  // 1
		cal1.plus();
		System.out.println(cal1.value);  //2
	
	
//		# 2.정적 중첩클래스 / static 클래스
//		   -> static으로 정의된 내부클래스 (필드 선언 시 static으로 선언한 것과 같다)
		InnerExam2.Cal2 cal2 = new InnerExam2.Cal2();
		cal2.plus();
		System.out.println( cal2.value );  // 1
		cal2.plus();
		System.out.println( cal2.value );  // 2
		
		
//		# 3.지역 중첩클래스 / 지역 클래스
//		   -> 메소드 안에 클래스 선언  (메서드 안에서 지역 변수처럼 사용. 메서드 밖에서 사용 불가)
		InnerExam3 t3 = new InnerExam3();
		t3.exec();
		
		
//		# 4.익명클래스  (pkg2의 Action, MyAction)
		Action action = new MyAction();
		action.exec();  // exec
		
		
		Action action2 = new Action(){
			public void exec(){
				System.out.println( "exec2" );
			}
		};
		action2.exec();  // exec2
		
//		action과 action2는 동일한 효과
//		생성자 다음에 중괄호 열고 닫고가 나오면, 해당 생성자 이름에 해당하는 클래스를 상속받는 이름없는 객체를 만드는 것.
//		익명클래스를 만드는 이유 : Action을 상속받는 클래스를 굳이 만들 필요가 없을 경우
	}
}