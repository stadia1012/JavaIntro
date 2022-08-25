package pkg1.javaintro;

import java.util.Arrays;

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
		
		array4.length = 5; 한 번 선언된 배열의 길이 늘리기는 불가능
*/
		
//		# 반복문 이용해 배열에 값 넣기 (1부터 100)
		System.out.println("\n# 반복문 이용해 배열에 값 넣기");
		int[] array5 = new int[100];
		for( int i = 0; i < array5.length; i++ ) {
			array5[i] = i + 1;
		}
		System.out.println(array5[98]);  // 99
		
//		# 1부터 100까지 더하기 - 배열 값 꺼내기
		System.out.println("\n# 1부터 100까지 더하기");
		int sum = 0;
		for( int i = 0; i < array5.length; i++ ) {
			sum += array5[i];
		}
		System.out.println(sum);  // 5050
		
		
//		# Arrays.copyOf() 활용해 배열 길이 늘리기
		System.out.println("\n배열 늘리기");
		String[] strArr1 = {"A", "B", "C"};
		String[] newArr1 = Arrays.copyOf( strArr1, strArr1.length + 1 );  // ( 복사할 배열, 배열 길이)
		
		newArr1[3] = "D";
		
		for ( int i = 0; i < newArr1.length; i++ ) {
			System.out.print( newArr1[i] );  // ABCD
		}
//		위 방법 말고 배열을 출력하는 법 : Arrays.toString()
		System.out.println("\n" + Arrays.toString(newArr1));
	}
}
