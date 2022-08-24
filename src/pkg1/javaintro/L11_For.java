package pkg1.javaintro;

public class L11_For {
//			 < For문>
//			많이 했으니 continue만 짚어보기
	public static void main(String[] args) {
//		# continue : 반복문 내 아래줄 스킵.
//		# 짝수의 합만 구하기
		int total = 0;
		for( int i1 = 1; i1 <= 100; i1++ ) {
			if ( i1 % 2 != 0) {
				continue;
			}
			total += i1;
		}
		System.out.println(total);  // 2550 -> 맞음.
	}

}
