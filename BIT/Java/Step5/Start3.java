/*
 * [추상, abstract] : 미완성
 * 추상메서드 : 메서드의 선언부만 있는 메서드
 * 추상클래스 : 객체 생성 불가, 반드시 부모의 형태로 사용된다.
 */

//추상 클래스
abstract class Sample1 {
	// 맴버필드, 생성자, 메서드...
}

//추상 메서드를 갖고 있는 클래스는 반드시 추상 클래스가 된다.
abstract class Sample2 {
	// 맴버필드, 생성자, 메서드...
	// 일부가 아래처럼 추상 메서드가 있다.
	abstract void foo();
}

//추상메서드를 갖고 있는 추상클래스를 상속받으면 본인도 추상 클래스가 된다.
abstract class Sample3 extends Sample2 {
}

//추상메서드를 재정의를 하면 본인은 정상적인 클래스가 된다.
class Sample4 extends Sample2 {
	@Override
	void foo() {
	}
}

public class Start3 {
	public static void exam1() {
		Sample1 s1; // 레퍼런스 변수 선언 가능!
		// s1 = new Sample1(); //객체 생성 불가! error
	}

	public static void main(String[] args) {
		exam1();
	}
}
