package pkg1.javaintro;

public class L17_VariableScope {
//			< 변수의 범위>
//	기본적으로 변수의 사용 가능 범위는 '선언된 블럭 내'라고 보면 된다
	int globalScope = 10;
	static int staticVal = 15;
	
	public void scopeTest1( int value1 ) {
		int localScope = 20;
		System.out.println( globalScope );
		System.out.println( localScope );
		System.out.println( value1 );
	}
	
	public void scopeTest2( int value2 ) {
		System.out.println( globalScope );
//		System.out.println( localScope );
//		System.out.println( value1 );
		System.out.println( value2 );
		System.out.println( staticVal );  // 가능
	}
	
	public static void main(String[] args ) {
//		# static의 특징
		System.out.println( "\n# static의 특징");
//		System.out.println( globalScope );
		System.out.println( staticVal );  // 15
		
/*		static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다
		static 메서드는 static한 필드만 사용할 수 있다 (globalScope 사용 불가) */
		
		
//		# 인스턴스화
		L17_VariableScope v1 = new L17_VariableScope();
		System.out.println( v1.globalScope );  // 10  인스턴스화 후 사용가능
		
//		# 인스턴스화 예시
		System.out.println( "\n# 인스턴스화 예시");
		L17_VariableScope v2 = new L17_VariableScope();
		v1.globalScope = 11;
		v2.globalScope = 22;
		System.out.println( v1.globalScope );  // 11
		System.out.println( v2.globalScope );  // 22
		
		v1.staticVal = 110;
		v2.staticVal = 220;
		System.out.println( v1.staticVal );  // 220
		System.out.println( v2.staticVal );  // 220
		
//		static한 필드는 인스턴스 생성 시 공간이 만들어 지는 것이 아닌, 값을 저장할 수 있는 공간이 하나 (값을 공유)
//		"클래스 변수"라고도 부름. 이외는 인스턴스 변수
		
		System.out.println( L17_VariableScope.staticVal );  // 220
//		공유하기 때문에 인스턴스명이 아닌 클래스로도 호출 가능. 이게 더 바람직한 출력 방법
	}
}
