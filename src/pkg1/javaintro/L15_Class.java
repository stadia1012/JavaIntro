package pkg1.javaintro;

public class L15_Class {
/*
 * 		# 클래스는 객체를 만드는 틀
 * 		   - 클래스에는 객체를 생성하기 위한 필드와 메서드가 정의되어 있음.
 * 		   - 클래스로부터 만들어진 객체를 인스턴스라고 한다.
 * 
 * 		# 메서드(Method)
 * 		  입력값 : 매개변수(Parameter) 또는 인자(Argument)
 * 		   - 엄밀히 따지면, 함수를 호출할 때 전달되는 실제값은 인자  ex) Car( "구급차", 1234 );
 * 		   - 전달된 인자를 받아들이는 변수를 파라미터라고 한다. (함수의 정의에 사용된 변수 = 파라미터)
 */ 
	
//		## 여러 형태의 메서드
//		# 입력도 리턴도 없는 메서드
		public void method1() {
			System.out.println("메서드1");
		}
		
//		# 입력만 있고 리턴은 없는 메서드
		public void method2(int a, int b) {
			System.out.println( a + "와 " + b + "를 받았습니다.");
		}
		
//		# 입력은 없지만 리턴은 있는 메서드
		public int method3() {
			return 0;	// 리턴 타입을 int로 명시했기 때문에 반드시 타입에 맞는 리턴 필요.
		}
		
//		# 입력과 리턴이 있는 메서드
		public int method4( int a, int b ) {
			System.out.println( a + "와 " + b + "를 받았습니다.");
			return a + b;
		}
}
