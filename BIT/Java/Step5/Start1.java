//�������̵� & Up, Downĳ����

// �θ�� ���� �������� �ż��带 ������ -> ��ġ �ʴ� ���
/*
 * ������[ Sound() ]
 * �����[ Sound() ]
 * -> ��ü�� ���� �� ����� ����� �ִٸ� ��ӱ�����...[�����ɸ� ���� �θ�Ŭ���� ����]
 */

class Animal {
	public void Sound() {
		System.out.println("������~~~");
	}
}

class Dog extends Animal {
	@Override
	public void Sound() {
		System.out.println("�۸�~~~");
	}

	public void Swing() {
		System.out.println("������ ����...");
	}
}

class Cat extends Animal {

	@Override
	public void Sound() {
		System.out.println("�߿˾߿�~~~");
	}
}

public class Start1 {
	// �����ε� ���
	public static void exam1() {
		Dog dog = new Dog();
		dog.Sound();

		Cat cat = new Cat();
		cat.Sound();
	}

	// ��ĳ����(UP casting) : �θ�Ÿ�� <- �ڽİ�ü
	// �ùٸ� ĳ����
	public static void exam2() {
		Animal ani = new Dog();
		ani.Sound();

		Animal ani1 = new Cat();
		ani1.Sound();
	}

	// ���������� �������� �����ϰ� �ʹٸ�?
	public static void exam3() {
		// ��ĳ������ ���ٸ� ������ �迭�� �ʿ��ϴ�.
		Dog[] dogs = new Dog[5];
		Cat[] cats = new Cat[5];

		// ��ĳ������ Ȱ���Ͽ� Animal�� ��� �ڽĵ��� �ϳ��� �迭�� ���� ����!
		Animal[] ani = new Animal[4];
		ani[0] = new Dog();
		ani[1] = new Cat();
		ani[2] = new Dog();
		ani[3] = new Cat();

		// ��� �������� �Ҹ��� ����.(������)
		for (Animal a : ani) {
			a.Sound();
		}

	}

	// �ٿ�ĳ����(Down casting) : �ڽ�Ÿ�� <- �θ�Ÿ��
	// ������ ĳ����(�����ؾ� �Ѵ�.)
	public static void exam4() {
		try {
			Animal ani = new Dog();
			Cat cat = (Cat) ani; // �ٿ�ĳ����(����������)
			cat.Sound(); // ����� �����߻�!-->���α׷��� ���������� ����
		} catch (ClassCastException ex) { // Exception�� �ڽ� Ŭ����
			System.out.println("����ȯ���� : " + ex.getMessage());
		} catch (Exception ex) { // ���� �ֻ��� �θ� Ŭ����

		}
	}

	// �ٿ�ĳ����(instanceof ������ Ȱ��)
	public static void exam5() {
		Animal ani = new Dog();
		if (ani instanceof Dog) { // ani�� �����ϰ� �ִ� ��ü�� Dog��ü�ΰ�?
			Dog dog = (Dog) ani;
			dog.Sound();
		}
	}

	// �ٿ�ĳ���� ��1) ��ĳ�������� ����� �迭��ü���� ���ϴ� ��ü�� ȹ���ؾ� �� ���
	public static void exam6() {
		Animal[] ani = new Animal[4];
		ani[0] = new Dog();
		ani[1] = new Cat();
		ani[2] = new Dog();
		ani[3] = new Cat();

		// ��� �������� �Ҹ��� ����.(������)
		for (Animal a : ani) {
			a.Sound();
		}

		// ����̸� �Ҹ��� ����.
		System.out.println("\n����̸�...");
		for (Animal a : ani) {
			if (a instanceof Cat)
				a.Sound();
		}
	}

	// �ٿ�ĳ���� ��2) ��ĳ�������� ����� ��Ȳ���� �ڽİ�ü�� Ȯ�� �޼��带 ȣ���ؾ� �� ���
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
