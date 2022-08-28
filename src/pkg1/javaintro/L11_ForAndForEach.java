package pkg1.javaintro;

public class L11_ForAndForEach {
/*			 < for문 + for each문 >
		for문은 많이 했으니 continue만 짚어보기
		for each문은 java 1.5버전부터 추가
 */
	public static void main(String[] args) {
//		# continue : 반복문 내 아래줄 스킵.
//		# 1부터 100까지 짝수의 합만 구하기
		int total = 0;
		for( int i1 = 1; i1 <= 100; i1++ ) {
			if ( i1 % 2 != 0) {
				continue;
			}
			total += i1;
		}
		System.out.println(total);  // 2550 -> 맞음.
		
//		# for each로 배열 값 출력
//		명령어는 for이지만 다른 언어와 통일을 위해 for each라고 부름
		int[] arr1 = { 1, 2, 3, 4, 5};
		for(int value1:arr1) {		
			System.out.print( value1 ); // 12345
		}
	}
}
