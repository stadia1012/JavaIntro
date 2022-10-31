package pkg1.javaintro;
import pkg2.methods.*;

public class L25_Super {
/*			 < Super >
 *	Super 및 오버라이딩(Overriding) 테스트
 * 
 * @사용 클래스 :
 * pkg2.methods.CarVer4(부모), Truck, TruckVer2
 * 
 */

	
	public static void main(String[] args) {
//		# 자식 인스턴스를 생성할 때 부모 인스턴스도 생성되어 부모클래스 생성자도 호출된다.
		Truck t1 = new Truck();
		
/*		# 결과
		이름 : 이름없음, 번호 : 0   // -> Truck의 부모클래스인 CarVer4 생성자 호출
		트럭 기본 생성자 호출됨     // -> Truck 생성자 호출
*/
		
//		# 오버로딩
		System.out.println( "\n# 오버로딩");
		t1.run();  // 트럭이 달립니다.
	}
}
