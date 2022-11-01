package pkg1.javaintro;
import pkg2.methods.*;

public class L24_Abstract {
//			< 추상클래스 >   -> pkg2의 Bird(추상클래스), Duck(구현한 클래스) 사용
/* 	# 추상클래스 특징 :
 *	상속받은 추상클래스의 추상메서드는 *반드시* 구현해야한다.
 *	추상클래스는 인스턴스화 할 수 없다.
 */
	public static void main(String[] args) {
		
		Duck d1 = new Duck( "오리1" );  // 생성자를 통한 name 입력
		
		d1.sing();  // 꽥꽥
		d1.fly();  // 오리1이(가) 납니다.
		
		
//		Bird b1 = new Bird();  // Error : 추상클래스는 인스턴스화 할 수 없다.
	}
}