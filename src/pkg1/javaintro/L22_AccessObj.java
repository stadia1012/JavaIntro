package pkg1.javaintro;

public class L22_AccessObj {
//			 < 접근제한자 >
/**
 * 		public : 어떤 클래스든 접근 가능
 * 		protected : 같은 패키지에선 접근 제한 없음. 다른 패키지에서는 자식 클래스만 접근 허용
 * 		private : 자기 자신만 접근 가능
 * 		default : 접근 제한자 명시하지 않는 경우. 같은 패키지에서만 접근 가능
 * 
 */
	
	public int i1 = 10;
	protected int i2 = 20;
	private int i3 = 30;
	int i4 = 40;
	
	
	public static void main(String[] args) {
		L22_AccessObj ao = new L22_AccessObj();
		System.out.println( ao.i1 );
		System.out.println( ao.i2 );
		System.out.println( ao.i3 );
		System.out.println( ao.i4 );
		
	}
}