package pkg1.javaintro;
import pkg2.methods.*;

public class L25_Super {
//			 < Super >
//	this가 자신을 가르키는 것처럼 super는 부모클래스를 나타냄
	public static void main(String[] args) {
//		# 자식 인스턴스를 생성할 때 부모 인스턴스도 생성되어 부모클래스 생성자도 호출된다.
		Truck t1 = new Truck();
		
/*		결과 :
		이름 : 이름없음, 번호 : 0  // -> Truck의 부모클래스인 CarVer4 생성자 호출
		트럭 기본 생성자 호출됨     // -> Truck 생성자 호출
*/
	}
}
