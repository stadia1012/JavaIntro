package pkg1.javaintro;

public class L12_Array {
//			  < 배열 >
//			배열은 기본 데이터 타입이 아닌 참조형 타입
	public static void main(String[] args) {
//		# 배열 선언법 1
		int[] array1 = new int[4];  
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
		System.out.println(array1);  // [I@7d6f77cc
		System.out.println(array1[2]);  // 3
		
//		# 배열 선언법 2
		int[] array2 = new int[] {1, 2, 3, 4};
		System.out.println(array2[2]); // 3
		
//		# 배열 선언법 3
		int[] array3 = {1, 2, 3, 4};
		int i1 = array3[2];
		System.out.println(i1);  // 3

/*		# 배열 테스트
		int[] array4 = new int[3] {1, 2, 3}; 
		배열 길이와 구성요소 동시 선언은 불가
*/
		
//		# 반복문 이용해 배열에 값 넣기
		int[] array5 = new int[100];
		for( int i = 0; i < array5.length; i++ ) {
			array5[i] = i + 1;
		}
		System.out.println(array5[98]);  // 99
		
	}
}
