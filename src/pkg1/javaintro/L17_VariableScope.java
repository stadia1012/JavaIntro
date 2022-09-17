package pkg1.javaintro;

public class L17_VariableScope {
//			< 변수의 범위>
	int globalScope = 10;
	
	public void scopeTest1( int value1 ) {
		int localScope = 20;
		System.out.println( globalScope );
		System.out.println( localScope );
		System.out.println( value1 );
	}
	
	public void scopeTest2( int value2 ) {
		int localScope = 20;
		System.out.println( globalScope );
		System.out.println( localScope );
//		System.out.println( value1 );
	}
	
	public void main(String[] args ) {
		
	}
}
