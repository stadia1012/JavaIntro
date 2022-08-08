package pkg1.javaintro;

public class L6_Operator {
//			< 산술연산자 >
	/* 부호 연산자 ( + - )
	 * 산술 연산자 ( + - * / %
	 * 증감 연산자 ( ++ --)
	 * 
	 * 부호연산자와 증감연산자는 단항연산자
	 */
	public static void main(String[] args) {
		// 단항연산자 -는 부호를 반전 시킴
		int i1 = -5;
		System.out.println(i1);  // -5
		int i2 = -i1;
		System.out.println(i2);  // 5
		
		
		// 증감연산자 연산 순서
		int i3 = 5;
		int i4 = ++i3;
		System.out.println(i3);  // 6
		System.out.println(i4);  // 6
		
		int i5 = 5;
		int i6 = i5++;
		System.out.println(i5);  // 6
		System.out.println(i6);  // 5
		
		// int형의 연산 결과는 int형
		int i = 5;
		int j = 2;
		System.out.println(i / j);  // 2
		// 피연산자 둘 중 하나는 실수여야 실수값 반환
		System.out.println(i / (double)j);  // 2.5
		
		// 나머지 연산자
		System.out.println(i % j);  // 1
		
	}

}
