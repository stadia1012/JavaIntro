package pkg1.javaintro;

import java.util.Arrays;

public class L13_TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] array1 = new int[3][4];
//		array1[0] = 10;  // 오류 -> Array1[0]은 int가 아닌 0번 배열을 가르키기 때문
		array1[0][2] = 10;
		System.out.println( array1[0][2] );  // 10
		
		int[] array1_1 = {1, 2, 3, 4};
		int[] array1_2 = {1, 2, 3, 4, 5, 6};
		
		array1[0] = array1_1;  // 0번 배열에 1_1배열 입력
		System.out.println( Arrays.toString(array1[0]) );  // [1, 2, 3, 4]
		array1[1] = array1_2;  // 1번 배열에 1_2배열 입력
		System.out.println( Arrays.toString(array1[1]) );  // [1, 2, 3, 4, 5]
		System.out.println( array1[1][5] );  // 6
//		다차원 배열은 처음 선언 값에 넘치게 임력해도 오류 안남
		
//		# 2차원 배열의 초기화 선언
		int[][] array2 = { {1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4} };
		System.out.println("\n# 2차원 배열의 초기화 선언\n" + array2[1][1] );  // 2
		
//		# 2차원 배열 출력
		System.out.println("\n# 2차원 배열 출력");
		for ( int i = 0; i < array2.length; i++ ) {
			System.out.println( (i+1) + "번째 행입니다." );  // 소괄호 없으면 01번째
			for ( int j = 0; j < array2[i].length; j++ ) {
				System.out.print( array2[i][j] );
			}
			System.out.println("");
		}
	}
}
