package pkg1.javaintro;
import java.util.Scanner;

public class L10_While {
//			< While문 >
	public static void main(String[] args) {
//		# 1부터 100까지 더하기
		int i1 = 1;
		int total = 0;
		while (i1 <= 100) {
			total += i1;
			i1++;
		}
		System.out.println(total);  // 5050
		
//		# 실습1 : 1부터 10까지 차례로 출력
		System.out.println("\n실습1");
		int i2 = 1;
		while ( i2 <= 10 ) {
			System.out.println( i2 );
			i2++;
		}
		
//		# 실습2 : 실습1에서 짝수만 출력
		System.out.println("\n실습2");
		int i3 = 1;
		while ( i3 <= 10 ) {
			if ( i3 % 2 == 0 ) {
				System.out.println( i3 );
			}
			i3++;
		}
		
//		# do while문
		int i4 = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			
		}while(i4 != 10);
	}
}
