package pkg1.javaintro;
import pkg2.methods.*;

public class L19_Constructor {
//			   < 생성자 >
//		객체 생성 시 필드를 초기화해주는 역할. new 연산자 뒤엔 반드시 생성자가 와야한다.
	
	/*
	 * public 클래스명 (매개변수 목록) {
	 * 		....
	 * }     -> 생성자 예시
	 * 
	 * 메서드와 다르게 리턴타입이 없음.
	 * 생성자를 명시해주지 않으면 매개변수 없는 생성자가 컴파일 시 자동으로 생성됨.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Car car1 = new Car();  // pkg2의 Car는 생성자가 없으므로 매개변수 없는 생성자 자동 생성됨
		
//		CarVer2 car2 = new CarVer2();  // 에러. CarVer2는 생성자가 지정되어 있어서 해당하는 인자를 필히 입력해야
		
		CarVer2 car3 = new CarVer2( "소방차", 1234 );
		
		System.out.println( car3.name + ", "+ car3.number );  // 소방차, 1234 
	}
}
