/*
 * [�߻�, abstract] : �̿ϼ�
 * �߻�޼��� : �޼����� ����θ� �ִ� �޼���
 * �߻�Ŭ���� : ��ü ���� �Ұ�, �ݵ�� �θ��� ���·� ���ȴ�.
 */

//�߻� Ŭ����
abstract class Sample1 {
	// �ɹ��ʵ�, ������, �޼���...
}

//�߻� �޼��带 ���� �ִ� Ŭ������ �ݵ�� �߻� Ŭ������ �ȴ�.
abstract class Sample2 {
	// �ɹ��ʵ�, ������, �޼���...
	// �Ϻΰ� �Ʒ�ó�� �߻� �޼��尡 �ִ�.
	abstract void foo();
}

//�߻�޼��带 ���� �ִ� �߻�Ŭ������ ��ӹ����� ���ε� �߻� Ŭ������ �ȴ�.
abstract class Sample3 extends Sample2 {
}

//�߻�޼��带 �����Ǹ� �ϸ� ������ �������� Ŭ������ �ȴ�.
class Sample4 extends Sample2 {
	@Override
	void foo() {
	}
}

public class Start3 {
	public static void exam1() {
		Sample1 s1; // ���۷��� ���� ���� ����!
		// s1 = new Sample1(); //��ü ���� �Ұ�! error
	}

	public static void main(String[] args) {
		exam1();
	}
}
