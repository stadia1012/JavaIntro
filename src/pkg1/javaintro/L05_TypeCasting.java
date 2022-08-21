package pkg1.javaintro;

public class L05_TypeCasting {
/*			< 기본형의 형변환 >
	묵시적 형변환 관계 (좌항은 우항에 담길 수 있다.)
	byte < short,char < int < long < float < double
*/
	public static void main(String[] args) {
		int x = 50000;
		long y = x;  // 묵시적 형변환 가능
		
		
		long x2 = 5;
//		int y2 = x2;  // 실제로 값 5가 int에 들어갈 수 있지만 컴파일러는 판단 못함 -> 오류 발생
		int y2 = (int) x2;  // 값을 담기 전 int로 강제 형변환 진행
		System.out.println(y2);  // 5
		
		long x3 = 10;
		float y3 = x3;  // long(8)이 float(4)보다 byte 크기가 더 큰데도 가능.
		System.out.println(y3);  // 10.0
		
		/* 실수를 int에 강제로 담으면? */
		double doubleValue = 123.456;
		int intValue = (int) doubleValue;
		System.out.println(intValue);  // 123  -> 소수점 아래는 삭제.
		
		System.out.println(doubleValue);  // 123.456 -> 기존 변수엔 영향 없음
		
		/* char를 int로 강제 형변환? */
		char charValue = 'X';
		int intValue2 = (int) charValue;
		System.out.println(intValue2);  // 88. ASCII 코드 출력
		
		/* String을 int로 강제 형변환? */
		String stringValue = "abcABC";
//		int intValue3 = (int) stringValue;  // "can not cast from String to int"
//		System.out.println = intValue3;
//		-> 컴파일 오류 발생		
	}

}
