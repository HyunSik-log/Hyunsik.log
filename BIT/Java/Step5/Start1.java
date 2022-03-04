//오버라이드 & Up, Down캐스팅

// 부모로 부터 물려받은 매서드를 재정의 -> 원치 않는 기능
/*
 * 강아지[ Sound() ]
 * 고양이[ Sound() ]
 * -> 객체를 만들 때 공통된 기능이 있다면 상속구조로...[공통기능를 갖는 부모클래스 정의]
 */

class Animal {
	public void Sound() {
		System.out.println("으르렁~~~");
	}
}

class Dog extends Animal {
	@Override
	public void Sound() {
		System.out.println("멍멍~~~");
	}

	public void Swing() {
		System.out.println("꼬리를 흔든다...");
	}
}

class Cat extends Animal {

	@Override
	public void Sound() {
		System.out.println("야옹야옹~~~");
	}
}

public class Start1 {
	// 오버로드 사용
	public static void exam1() {
		Dog dog = new Dog();
		dog.Sound();

		Cat cat = new Cat();
		cat.Sound();
	}

	// 업캐스팅(UP casting) : 부모타입 <- 자식객체
	// 올바른 캐스팅
	public static void exam2() {
		Animal ani = new Dog();
		ani.Sound();

		Animal ani1 = new Cat();
		ani1.Sound();
	}

	// 여러마리의 동물들을 생성하고 싶다면?
	public static void exam3() {
		// 업캐스팅이 없다면 동물별 배열이 필요하다.
		Dog[] dogs = new Dog[5];
		Cat[] cats = new Cat[5];

		// 업캐스팅을 활용하여 Animal의 모든 자식들을 하나의 배열에 저장 가능!
		Animal[] ani = new Animal[4];
		ani[0] = new Dog();
		ani[1] = new Cat();
		ani[2] = new Dog();
		ani[3] = new Cat();

		// 모든 동물들이 소리를 낸다.(다형성)
		for (Animal a : ani) {
			a.Sound();
		}

	}

	// 다운캐스팅(Down casting) : 자식타입 <- 부모타입
	// 강제적 캐스팅(조심해야 한다.)
	public static void exam4() {
		try {
			Animal ani = new Dog();
			Cat cat = (Cat) ani; // 다운캐스팅(강제적으로)
			cat.Sound(); // 실행시 에러발생!-->프로그램이 강제적으로 종료
		} catch (ClassCastException ex) { // Exception의 자식 클래스
			System.out.println("형변환오류 : " + ex.getMessage());
		} catch (Exception ex) { // 예외 최상위 부모 클래스

		}
	}

	// 다운캐스팅(instanceof 연산자 활용)
	public static void exam5() {
		Animal ani = new Dog();
		if (ani instanceof Dog) { // ani이 저장하고 있는 객체가 Dog객체인가?
			Dog dog = (Dog) ani;
			dog.Sound();
		}
	}

	// 다운캐스팅 예1) 업캐스팅으로 저장된 배열객체에서 원하는 객체만 획득해야 할 경우
	public static void exam6() {
		Animal[] ani = new Animal[4];
		ani[0] = new Dog();
		ani[1] = new Cat();
		ani[2] = new Dog();
		ani[3] = new Cat();

		// 모든 동물들이 소리를 낸다.(다형성)
		for (Animal a : ani) {
			a.Sound();
		}

		// 고양이만 소리를 낸다.
		System.out.println("\n고양이만...");
		for (Animal a : ani) {
			if (a instanceof Cat)
				a.Sound();
		}
	}

	// 다운캐스팅 예2) 업캐스팅으로 저장된 상황에서 자식객체의 확장 메서드를 호출해야 할 경우
	public static void exam7() {
		Animal ani = new Dog();
		ani.Sound();
		if (ani instanceof Dog) {
			Dog dog = (Dog) ani;
			dog.Swing();
		}
	}

	public static void main(String[] args) {
		exam7();
	}
}
