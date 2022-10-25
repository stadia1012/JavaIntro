package pkg1.javaintro;
import pkg2.methods.*;

public class L21_Extends {
//			  < 상속 >
	public static void main(String[] args) {
		
		Bus myBus = new Bus();
		
		myBus.run();  // 달립니다.   -> Bus의 부모 클래스 carVer3의 메서드
		myBus.pickUp();  // 승객을 태웁니다.   -> Bus의 메서드 (확장)
		
//		부모의 메서드와 자신의 메서드 둘 다 사용 가능
	}
}