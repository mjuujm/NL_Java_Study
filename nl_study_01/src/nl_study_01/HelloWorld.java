package nl_study_01;

public class HelloWorld {
	public static void main(String[] args) {
		// 어떤 클래스 안에, main 이라는 메서드가 있다면 -> 실행 가능한 클래스이다.
		System.out.println("Hello World!");
		// System 이라는 객체에서
		// .out -> System 이라는 객체에서 out 이라는 필드라는 것을 얻어온다.
		// out 이라는 필드에서 println 이라는 메서드를 가져오고
		// println 의 argumetn 로 "Hello World!" 라는 String 객체를 집어넣는다.
	}
}
// 실행 : Ctrl + F11