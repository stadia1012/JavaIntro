package pkg1.javaintro;
// 참조 : https://bvc12.tistory.com/196

public class L28_Exception {
//			< Exception / throws >
//	- 오류 발생 시 프로그램이 강제종료 되지만 Exception을 사용하면 계속 실행됨
	
	public static void main(String[] args) {
		int i = 30;
		int j = 0;
		try{
			int k = i / j;
		}catch(ArithmeticException ex){
			System.out.println( "오류 : 0으로 나눌 수 없음 " + ex.toString() );  // 오류 : 0으로 나눌 수 없음 java.lang.ArithmeticException: / by zero
		}finally {
			System.out.println( "finally는 오류가 있던 없던 무조건 실행" );
		}
		
//		- finally 블럭은 생략 가능
//		- catch는 여러개 가능
		System.out.println( "오류 발생 시에도 프로그램은 종료되지 않는다." );
		
		
//		# throws : 메서드를 호출하는 쪽에서 오류 처리하도록 한다.
		int i2 = 10;
		int j2 = 0;
		try{
			int k = divide(i2, j2);  // divide는 하기에 선언
			System.out.println(k);
		} catch(ArithmeticException ex2) {
			System.out.println( "오류 : 0으로 나눌 수 없음");
		}
		
		
//		# throw : 예외 강제 발생
		System.out.println("\n# throw");
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 강제 발생");  // 예외 강제 발생
			System.out.println( e.toString() );  // java.lang.Exception
		}
	}
	
		public static int divide( int i, int j ) throws ArithmeticException{
			int k = i / j;
			return k;
		}      
}    
