package nl_study_01;

public class JavaStatements {
	public static void main(String[] args) {
		// 1번째 원칙 : 모든 문장의 끝에는 세미콜론(;) 을 붙여야 한다. 안 붙이면 컴파일 에러!
		System.out.println("Java Statement Test");
		
		// 2번째 : 주석
		// <- 이거 달면 주석 처리가 가능하다.
		// System.out.println("Java Statement Test"); <- 실행 안됨
		/**
		 * 
		 * 여
		 * 러
		 * 줄
		 * 
		 */
		
		// 3번쨰 : 예약어는 변수명으로 사용할 수 없다.
		// 예를 들면 -> int, short, char, String => 변수명으로 사용할 수 없다.
		//int int = 10; 
		
		// Java 의 데이터 타입
		// 원시 데이터 타입(Primitive Data Types)
		// 8가지 
		// 논리형, 문자형, 정수형, 실수형
		// 논리형 데이터 타입 -> boolean => 값 : true or false
		
		boolean isOdd = false;
		boolean isEven = true;
		
		// 문자형 -> char
		char firstCharOfName = 'J'; // 한 글자 밖에 못담고, '(single quote) 를 사용해서 선언한다.
		
		// 정수형 -> byte < short < int < double
		// 담을 수 있는 값의 범위가 다르다.
		// byte : 8비트 -128 ~ 127
		byte a = 10;
		// short : 16비트
		short b = 20;
		// int : 32비트
		int c = 2100000000;
		// long : 64비트 ( 알고리즘 풀 때, 아주 큰 수가 나올 수 있는 경우 쓴다 )
		long d = 9399129;
		
		// 실수형 -> float, double
		float e = 3.14f;
		double f = 392d;
		
		// Casting -> 형 변환
		// 자동 형변환, 명시적 형변환
	
		// 작은 크기의 타입이 큰 크기의 타입으로 자동 변환 되는 거 -> 자동형변환
		// 명시적 형변환
		// 큰 크기가 작은 크기로 변경할 경우
		int num = (int) 3.4;
		System.out.println(num);
		char A = (char) 65;
		// ASCII CODE -> 쓸 수 있는 대부분의 문자를 숫자로 표현해놓은 코드
		System.out.println(A);
		char aCh = (char) 97;
		System.out.println(aCh);
	}
}
