package pkg1.javaintro;

public class L1_HelloWorld {
//			< 클래스 생성과 console 출력 >
	public static void main(String[] args) {
		System.out.print("Hello World");
		System.out.print("Hello World");
		
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		int birthYear = 1996;
		String myName = "stadia";
//		printf : 서식이 있는 출력
		System.out.printf("나는 %d년생 %s입니다.", birthYear, myName);  // 나는 1996년생 stadia입니다.
	}
}


/* 결과 : 

	Hello WorldHello WorldHello Java
	Hello Java

 -> print와 println 차이 : ln은 줄바꿈됨 (개행문자가 붙는다)
 
<<<<<<< HEAD
 	*printf : 서식이 있는 출력 / 줄바꿈 없음
 	%d 정수형   %s 문자형   %f 실수형   %c 문자열   %b 불린형   %n 줄 바꿈
=======
 	*printf : 서식이 있는 출력
>>>>>>> ca2afac (서식이 있는 출력)
 	
 */