import java.util.Scanner;

//static ���
//1) Ŭ���� �ɹ��޼��� : �ɹ� �Լ��� ���
//    - Ŭ���������� ���Ǵ� �޼���
//    - Ŭ�����ɹ��̱� ������ Ŭ�����ɹ��� ��밡���ϴ�.(this�� �������� �ʴ´�)

//2) Ŭ���� �ɹ� �ʵ� : �ɹ� �ʵ忡 ���

class Sample5 {
	private int number;

	public static void fun() {

	}

	public void fun1() { // �ν��Ͻ� �ɹ�
		this.number = 10;
	}

	public static int Add(int n1, int n2) {
		fun(); // Ŭ�����ɹ�ȣ�� ����!
		// fun1(); //�ν��Ͻ��ɹ�ȣ�� �Ұ���!
		return n1 + n2;
	}
}

class Sample4 {
	static Scanner scan = new Scanner(System.in);

	public static int InputNumber(String str) {
		System.out.print(str + " : ");
		return Integer.parseInt(scan.nextLine());
	}

	public static String StringNumber(String str) {
		System.out.print(str + " : ");
		return scan.nextLine();
	}
}

class Sample6 {
	public int number; // �ν��Ͻ� �ɹ�
	public static int s_number; // Ŭ���� �ɹ�
}

public class Start2 {
	public static void main(String[] args) {
		System.out.println(Sample5.Add(10, 20));

		int n1 = Sample4.InputNumber("���� �Է�");
		int n2 = Sample4.InputNumber("���� �Է�");
		System.out.println(Sample5.Add(n1, n2));

		// ------------------------------------------
		Sample6 s6 = new Sample6();
		System.out.println(s6.number); // 0
		System.out.println(s6.s_number); // 0 Ŭ�����ɹ��� ��ü�� ȣ�Ⱑ��(X)
		System.out.println(Sample6.s_number); // 0 Ŭ�����ɹ��� Ŭ������ȣ�����
	}
}
