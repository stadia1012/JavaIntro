package pkg1.javaintro;
import pkg2.methods.*;

public class L20_Overload {
//			 < 오버로딩 >
//		매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술 
	
	public static void main(String[] args) {
//		# 메서드 오버로딩
		System.out.println( "# 메서드 오버로딩" );
		
		OverloadExam mo1 = new OverloadExam();
		
		System.out.println( mo1.plus( 6, 8 ) );  // 14
		System.out.println( mo1.plus( 3, 4, 2 ) );  // 9
		System.out.println( mo1.plus( "Hello ", "World" ) );  // Hello World
		
//		# 생성자 오버로딩
		System.out.println( "\n# 생성자 오버로딩" );
		
		CarVer3 car1 = new CarVer3();
		System.out.println( car1.name + car1.number );  // 이름없음0  -> 인자 없어도 기본값 출력
		
		CarVer3 car2 = new CarVer3( "경찰차", 8282 );
		System.out.println( car2.name + car2.number );  // 경찰차8282  -> 오버로딩 확인
	}
}
