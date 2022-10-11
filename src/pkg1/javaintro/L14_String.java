package pkg1.javaintro;
import pkg2.methods.MyMethods;

public class L14_String {
//			< 참조형 타입 & String >
	public static void main(String[] args) {
/**
 * 자바의 변수 타입은 기본형 타입, 참조형 타입으로 나뉨
 * - 기본형 타입
 * 	 논리형 : boolean
 *   문자형 : char(2)
 *   정수형 : byte(1), short(2), int(4), long(8)
 *   실수형 : float(4), double(8)
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
		
		
//		# 참조 인스턴스 확인 : 등호는 인스턴스 주소를 비교
		if( str1 == str2 ) {			// 같은 인스턴스를 참조
			System.out.println("str1과 str2는 같은 인스턴스를 참조");
		} else {
			System.out.println("str1과 str2는 서로 다른 인스턴스를 참조");
		}
		
		if( str3 == str4 ) {			// 서로 다른 인스턴스를 참조
			System.out.println("str4와 str4는 같은 인스턴스를 참조");
		} else {
			System.out.println("str3와 str4는 서로 다른 인스턴스를 참조");
		}
		
//		# String.equals() : 값을 비교
		if ( str3.equals(str4) ) {		// str3와 str4는 다른 인스턴스지만 같은 값을 가짐
			System.out.println("str3와 str4는 같은 값을 가짐");
		} else {
			System.out.println("str3와 str4는 서로 다른 값을 가짐");
		}
//		동위연산자 '=='는 String 인스턴스가 같은지 비교하지만 .equals()메서드를 이용하면 값을 비교할 수 있음
		
		
//		# 참조 타입 VS 원시 타입 -> 메서드의 인자
		System.out.println( "\n# 참조 타입 VS 원시 타입" );
		MyMethods exam1 = new MyMethods();
		
//		addOne은 인자에 1을 더하는 메서드
		int value1 = 10;
		exam1.addOne( value1 );
		System.out.println( value1 );  // 10
		
		int[] arr1 = {10};
		exam1.addOne( arr1 );
		System.out.println( arr1[0] );  // 11
		
//		 ->> 기본형 int는 매개변수로 전달될 때, 10이라는 값이 전달됨
//			 참조형은 주소가 전달되기 때문에 메서드에서 수정 시 주소에 있는 값이 수정됨 (MyMethods.java 확인)
		
		
//		# String의 메서드1 - length()
		System.out.println( "\n# .length 메서드" );
		String str5 = "Hello World";
		System.out.println( str5.length() );  // 11 (공백도 포함)
		
//		# String의 메서드2 - concat()  결합
		System.out.println( "\n# .concat 메서드" );
		String str6 = ", What's up?";
		System.out.println( str5.concat(str6) );  // Hello World, What's up?
		System.out.println( str5.concat( ", How are you?") );  // Hello World, How are you?
		
		System.out.println( str5 );  // Hello World  -> concat을 사용한다고 원래 값이 바뀌진 않음
		
//		# String의 메서드3 - substring()  자르기
		System.out.println( "\n# .substring 메서드" );
		System.out.println( str5.substring(3) );  // lo World   -> 3부터 끝까지
		System.out.println( str5.substring(3, 7) );  // lo W    -> 3부터 7전까지
	}
}
