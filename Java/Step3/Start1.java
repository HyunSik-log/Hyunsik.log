//객체(맴버필드) 초기화 방법

class Sample3 {
	// 1) 맴버 필드 선언의 위치에서 초기화(모든 객체들이 동일한 값으로 초기화 된다.)
	public int number = 10;
	public String str = "문자열";

	// (*)클래스맴버 초기화 영역(클래스맴버 초기화, 복잡한 연산이 필요할 때)
	// 가장 먼저 실행(클래스의 어떤 맴버를 호출하든 그 이전에)
	// 한번만 실행
	static {
		System.out.println("클래스맴버 초기화 영역");
	}

	// 2)인스턴스 초기화 영역(인스턴스 생성시 호출) : 복잡한 연산이 필요할 때
	{
		number = 20;
		str = "인스턴스 초기화영역";
		System.out.println("인스턴스 초기화 영역");
	}

	// 3)생성자(가장 많이 사용, 모든 객체들이 서로다른 값으로 초기화 가능)
	public Sample3(int number, String str) {
		this.number = number;
		this.str = str;
		System.out.println("생성자");
	}
}

public class Start1 {
	public static void main(String[] args) {
		Sample3 s1 = new Sample3(100, "생성자");
		System.out.println(s1.number + ", " + s1.str);

		Sample3 s2 = new Sample3(200, "생성자호출");
		System.out.println(s2.number + ", " + s2.str);
	}
}
