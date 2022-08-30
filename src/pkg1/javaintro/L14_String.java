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
		String str1 = "Hello, stadia";
		
		
	}
}
