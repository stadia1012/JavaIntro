package pkg1.javaintro;

public class L18_Enum {
//			< 열거형 > 
//		jdk 5부터 추가됨. 특정값만 가져다 써야할 경우
	public static void main(String[] args) {
//		# Gender 자체가 자료형처럼 쓰임
		Gender gender1;
		gender1 = Gender.MALE;
		Gender gender2;
		gender2 = Gender.FEMALE;
		
		Gender gender3;
//		gender3 = "boy";  // 이외값 할당 시 컴파일 오류
	}
}

enum Gender{
	MALE, FEMALE;
}
