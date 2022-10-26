package pkg1.javaintro;

public class L23_AccessObjExam {
//			< 접근제한자 실습 >
	
	public static void main(String[] args) {
		L22_AccessObj ao = new L22_AccessObj();
		System.out.println( ao.i1 );
		System.out.println( ao.i2 );
//		System.out.println( ao.i3 );   // Error. private는 자기 자신만 접근가능. (L22_AccessObj만)
		System.out.println( ao.i4 );

	}
}