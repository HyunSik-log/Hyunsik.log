/*
 * [상속]
 * 1. extends : 상속 키워드
 * 2. 객체 생성 흐름[부모가 먼저 생성된다, 자식은 부모의 어떤 생성자를 호출할지 결정(super)]
 * 3. 부모의 맴버가 자식에게 전달된다.(맴버필드,맴버메서드), 생성자는 전달대상이 아니다.
 *    부모의 private 맴버는 자식에게 전달되지만 자식이 접근할 수 없다.
 *    - 부모가 get & set 메서드 제공
 *    - 접근지정자 변경!(default-동일패키지에서 누구나 접근가능, 
 *                    protected - default + 다른패키지의 자식클래스에서 접근 가능)
 *       맴버필드의 외부 접근 문제가 발생함.
 */

class Parent {
	public Parent() {
		System.out.println("Parent()");
	}

	public Parent(int n) {
		System.out.println("Parent(int)");
	}

	// --맴버 추가
	protected int num;

	public void fun() {
		System.out.println("Parent.fun()");
	}
}

//is a(A는 B이다, B는 A가 아니다)
//부모로 부터 필드와 메서드를 물려받았다.
//필드와 메서드를 확장!
class Child extends Parent {
	public Child() {
		super(10);
		System.out.println("Child()");
	}

	public Child(int n) {
		super(n);
		System.out.println("Child(int)");
	}

	// --확장-
	public void fun1() {
		num = 10;
		fun(); // 부모로 부터 물려받은 메서드 호출 가능!
		System.out.println("Child.fun1()");
	}
}

public class Start {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.fun();
		c1.fun1();
		System.out.println("------------");
		Child c2 = new Child(10);
		c2.fun();
		c2.fun1();
	}
}
