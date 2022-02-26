class Sample {
	// 맴버 필드
	public int number;
	public String str;

	// 생성자가 제공이 안되었다면 컴파일러는 디폴트생성자를 제공해 준다.
	// - 디폴트 생성자(인자가 없는 생성자)
	// 아무 코드도 없지만 맴버 필드는 기본값으로 초기화 된다.
	public Sample() {
		System.out.println("컴파일러가 만들어주는 생성자");
	}
}

class Sample1 {
	// 맴버 필드
	public int number;
	public String str;

	// 생성자 정의
	public Sample1(int number, String str) {
		this.number = number;
		this.str = str;
	}
}

public class Start {
	public static void main(String[] args) {
		// s1 : 참조타입 변수명
		// 힙 메모리에 Sample객체가 생성(인스턴스 생성)
		// new 연산자 : [힙메모리생성] -> [생성자호출]
		// 4byte(값)+4byte(주소) Sample생성자가 없다?
		Sample s1 = new Sample();
		System.out.println(s1.number + ", " + s1.str);

		// Sample1 s2 = new Sample1(); 에러
		Sample1 s2 = new Sample1(10, "aaa");
	}
}
