package pkg2.methods;

public class MyMethods {
//	L14_String에서 참조타입과 원시타입의 특징을 확인하기 위해 사용
//	참조 변수와 기본형 변수 차이 확인을 위한 1을 더하는 메서드 addOne (리턴 안 함)
	public void addOne( int value ) {
		value++;
	}
	
	public void addOne( int[] arr ) {
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] ++;
		}
	}
}
