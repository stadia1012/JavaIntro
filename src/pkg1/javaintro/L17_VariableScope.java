package pkg1.javaintro;

public class L17_VariableScope {
	int globalScope = 10;
	
	public void scopeTest( int value ) {
		int localScope = 20;
		System.out.println( globalScope );
		System.out.println( localScope );
		System.out.println( value );
	}
	
	public void main(String[] args ) {
		
	}
}
