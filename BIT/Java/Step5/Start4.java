//추상클래스 적용(Start1 코드 복사)
/*
Dog와 Cat을 만들고 싶다.
Sound()라는 동일한 기능을 갖고 있더라.
[공통]기능을 갖는 부모가 필요해 졌다.
  방법1) Dog나 Cat 중 하나를 부모로 처리
  방법2) 새로운 객체를 정의해서 부모로 처리 --> 생각지도 못했던 객체가 정의가 된다.[추상]
*/

abstract class Animal1 {
	private String name;

	public Animal1() {

	}

	public void func() {

	}

	abstract public void Sound();
}

class Dog1 extends Animal1 {

	@Override
	public void Sound() {
		System.out.println("멍멍~~~");
	}

	public void Swing() {
		System.out.println("꼬리를 흔든다...");
	}
}

class Cat1 extends Animal1 {

	@Override
	public void Sound() {
		System.out.println("야옹야옹~~~");
	}
}

public class Start4 {
	public static void main(String[] args) {
		Animal1[] anis = new Animal1[4];
		anis[0] = new Dog1();

		Animal1 ani = new Dog1();
	}
}
