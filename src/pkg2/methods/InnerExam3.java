package pkg2.methods;
//		< 메소드 안에 클래스 생성 >

public class InnerExam3 {
	
	public void exec() {
		class Cal3 {  // public 붙이면 에러표시
			int value = 0;
			public void plus() {
				value++;
			}
		}
	}
}