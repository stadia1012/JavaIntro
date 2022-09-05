package pkg1.javaintro;

public class L14_String {
//			< 참조형 타입 & String >
	public static void main(String[] args) {
/**
 * 자바의 변수 타입은 기본형 타입, 참조형 타입으로 나뉨
 * - 기본형 타입
 * 	 논리형 : boolean
 *   문자형 : char
 *   정수형 : byte, short, int, long
 *   실수형 : float, double
 * 기본형을 제외하고는 모두 참조형 타입.
 *  -> 클래스, 배열 등도 참조형 타입
 */
		String str = new String("Hello");
//		String 클래스의 인스턴스 생성. str은 생성된 인스턴스 주소를 가르키는 참조형 변수
//		new 연산자 뒤 String("Hello")는 생성자.
		
//		# String의 특수성 : 유일하게 new 연산자 없이도 인스턴스 생성 가능한 클래스
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
/*		str1, str2와 str3, str4의 차이 :
		1, 2는 같은 인스턴스를 가르킨다.
		인스턴스가 상수 영역에 생성되어 같은 값이면 같은 인스턴스를 가르키게 되어있기 때문.
		
		2, 3은 new 연산자를 사용해 인스턴스가 각각 생성되었다.
		new 연산자가 붙으면 무조건 heap 영역에 새로 인스턴스 생성한다. */
		
//		# 참조 인스턴스 확인
		if( str1 == str2 ) {			// 같은 인스턴스를 참조
			System.out.println("str1과 str2는 같은 인스턴스를 참조");
		} else {
			System.out.println("str1과 str2는 서로 다른 인스턴스를 참조");
		}
		
		if( str3 == str4 ) {			// 서로 다른 인스턴스를 참조
			System.out.println("str4과 str4는 ㅓ같은 인스턴스를 참조");
		} else {
			System.out.println("str3과 str4는 서로 다른 인스턴스를 참조");
		}
		
//		# String.equals() 메서드
		if ( str3.equals(str4) ) {		// str3와 str4는 다른 인스턴스지만 같은 값을 가짐
			System.out.println("str3와 str4는 같은 값을 가짐");
		} else {
			System.out.println("str3와 str4는 서로 다른 값을 가짐");
		}
//		동위연산자 '=='는 String 인스턴스가 같은지 비교하지만 .equals()메서드를 이용하면 값을 비교할 수 있음
	}
}
