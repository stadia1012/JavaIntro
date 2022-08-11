package pkg1.javaintro;

public class L8_If {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;  // git commit 방지 default : 60으로 하기
		
		if ( x > y ) {
			System.out.println("x는 y보다 크다.");
		} else if( x < y ) {
			System.out.println("x는 y보다 작다.");
		} else {
			System.out.println("해당 없음");
		}
		
//		**실습 1 : 3의 배수이면 출력하기
		int i1 = 12;
		
		if ( i1 % 3 == 0 ) {
			System.out.printf("%d는 3의 배수가 맞습니다.", i1);
		} else {
			System.out.printf("%d는 3의 배수가 아닙니다.", i1);
		}
	}
}
