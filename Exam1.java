import java.util.Scanner;

// static �ɹ��� static�ɹ��� ��밡���ϴ�.
// 1) static      : Ŭ���� �ɹ�
// 2) NON static  : �ν��Ͻ� �ɹ� 
public class Exam1 {

	// hello, world
	public static void Example1() {
		System.out.println("Hello, World!");
	}

	// �⺻ ��� �Լ�
	// out : ��� ��ü
	// 1) print : �⺻��Ÿ�԰� Object, String Ÿ���� ���ڷ� ���� �����ε� ����.
	// �����ε�(Overloading) : �Լ��� �̸��� ����, �Ű������� �ٸ� �Լ����� ����
	// ������� ���ϴ� Ÿ���� ����ϴ� �뵵!
	public static void Example2() {
		System.out.print(10);
		System.out.print('A');
	}

	// 2) println
	// ����ó���� �ȴ�.
	public static void Example3() {
		System.out.println(10);
		System.out.println('A');
	}

	// 3) printf : C���� �����Ǵ� printf�� ����� ����!
	// �����ε� ������ �ƴϴ�.
	// ������ �̿��ؼ� �پ��� Ÿ���� ���
	// "%d" : ����Ÿ��, "%c" : ���� Ÿ��, "%f" : �Ǽ� Ÿ��, "%s: : ���ڿ� Ÿ��
	public static void Example4() {
		System.out.printf("%d, %c, %f, %s\n", 10, 'A', 10.1f, "���ڿ�");
	}

	// �Է°�ü
	// System.in.
	// �Էº�����ü : Scanner
	public static void Example5() {
		// java.util.Scanner scan;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = scan.nextLine();

		System.out.print("���� : ");
		String temp = scan.nextLine(); // "10"
		int age = Integer.parseInt(temp);

		System.out.print("������ : "); // "10.1"
		float weight = Float.parseFloat(scan.nextLine());

		System.out.print("����(�� or ��) : "); // "��"
		char gender = scan.nextLine().charAt(0);

		System.out.printf("%s, %d, %.1f, %c\n", name, age, weight, gender);
	}

	public static void main(String[] args) {
		Example5();
	}
}
