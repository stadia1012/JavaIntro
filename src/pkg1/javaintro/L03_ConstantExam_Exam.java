package pkg1.javaintro;

public class L03_ConstantExam_Exam {
//				< 상수 >
	public static void main(String[] args) {
/*
 * 원의 둘레, 반지름 * 2 * 원주율을 구하는 코드를 짜려 합니다.
 * 빈칸에 원주율을 나타내는 double 타입 상수, PI를 선언과 동시에 초기화해 코드를 완성해보세요.
 * 원주율은 3.14159입니다.
 */
		final double PI = 3.14159;
		int radius = 5;
		double result = radius * PI;
		System.out.println("결과는 " + result + "입니다.");  // 결과는 15.70795입니다.

	}

}
