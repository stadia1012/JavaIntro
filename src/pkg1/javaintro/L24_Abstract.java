package pkg1.javaintro;
import pkg2.methods.*;

public class L24_Abstract {

	public static void main(String[] args) {
		
		Duck d1 = new Duck( "오리1" );  // 생성자를 통한 name 입력
		
		d1.sing();  // 꽥꽥
		d1.fly();  // 오리1이(가) 납니다.
		
		
//		Bird b1 = new Bird();  // Error : 추상클래스는 인스턴스화 할 수 없다.
	}
}