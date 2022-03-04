/*
 * [���]
 * 1. extends : ��� Ű����
 * 2. ��ü ���� �帧[�θ� ���� �����ȴ�, �ڽ��� �θ��� � �����ڸ� ȣ������ ����(super)]
 * 3. �θ��� �ɹ��� �ڽĿ��� ���޵ȴ�.(�ɹ��ʵ�,�ɹ��޼���), �����ڴ� ���޴���� �ƴϴ�.
 *    �θ��� private �ɹ��� �ڽĿ��� ���޵����� �ڽ��� ������ �� ����.
 *    - �θ� get & set �޼��� ����
 *    - ���������� ����!(default-������Ű������ ������ ���ٰ���, 
 *                    protected - default + �ٸ���Ű���� �ڽ�Ŭ�������� ���� ����)
 *       �ɹ��ʵ��� �ܺ� ���� ������ �߻���.
 */

class Parent {
	public Parent() {
		System.out.println("Parent()");
	}

	public Parent(int n) {
		System.out.println("Parent(int)");
	}

	// --�ɹ� �߰�
	protected int num;

	public void fun() {
		System.out.println("Parent.fun()");
	}
}

//is a(A�� B�̴�, B�� A�� �ƴϴ�)
//�θ�� ���� �ʵ�� �޼��带 �����޾Ҵ�.
//�ʵ�� �޼��带 Ȯ��!
class Child extends Parent {
	public Child() {
		super(10);
		System.out.println("Child()");
	}

	public Child(int n) {
		super(n);
		System.out.println("Child(int)");
	}

	// --Ȯ��-
	public void fun1() {
		num = 10;
		fun(); // �θ�� ���� �������� �޼��� ȣ�� ����!
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
