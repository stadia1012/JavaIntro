package pkg1.javaintro;
import pkg2.methods.*;

public class L26_Interface {
//			< 인터페이스 > 
//	pkg2.methods.TV, LedTV / Calculator, MyCal사용
	
/*	인터페이스 특징 :
	- 인터페이스의 모든 메서드는 추상메서드(public abstract)로 선언해야됨. 멤버 변수는 상수(public static final) 정의 가능
  	  (추상메서드와 상수 표시는 생략해도 컴파일 과정에서 자동 생성)
	- interface는 다중 상속 가능
	- JDK 1.8부터 default methods 사용 가능 -> 인터페이스에 메서드 추가할 시 모든 구현체에 코드 작성 과정을 줄이기 위해 추가.
	- 인터페이스의 메소드를 하나라도 구현하지 않는다면 해당 구현 클래스는 추상클래스가 됨
	
	* default 메소드와 interface 내 static 메소드는 JDK 8부터 가능. 여기선 구현 불가.
 */
	public static void main(String[] args) {
		
		LedTV tv1 = new LedTV();
		
		tv1.turnOff();   // LedTV를 끕니다.
		tv1.turnOn();    // LedTV를 켭니다.
		tv1.ledLight();  // LED TV가 빛을 발합니다.
		
		
//		# 참조변수 타입으로 인터페이스 가능
		TV tv2 = new LedTV();
		tv2.turnOn();
//		tv2.ledLight();  // 단, 인터페이스가 가진 메소드만 사용 가능 (LedTV 메서드 사용 불가)
		
	}
}