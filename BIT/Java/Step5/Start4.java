//�߻�Ŭ���� ����(Start1 �ڵ� ����)
/*
Dog�� Cat�� ����� �ʹ�.
Sound()��� ������ ����� ���� �ִ���.
[����]����� ���� �θ� �ʿ��� ����.
  ���1) Dog�� Cat �� �ϳ��� �θ�� ó��
  ���2) ���ο� ��ü�� �����ؼ� �θ�� ó�� --> �������� ���ߴ� ��ü�� ���ǰ� �ȴ�.[�߻�]
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
		System.out.println("�۸�~~~");
	}

	public void Swing() {
		System.out.println("������ ����...");
	}
}

class Cat1 extends Animal1 {

	@Override
	public void Sound() {
		System.out.println("�߿˾߿�~~~");
	}
}

public class Start4 {
	public static void main(String[] args) {
		Animal1[] anis = new Animal1[4];
		anis[0] = new Dog1();

		Animal1 ani = new Dog1();
	}
}
