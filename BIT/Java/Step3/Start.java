class Sample {
	// �ɹ� �ʵ�
	public int number;
	public String str;

	// �����ڰ� ������ �ȵǾ��ٸ� �����Ϸ��� ����Ʈ�����ڸ� ������ �ش�.
	// - ����Ʈ ������(���ڰ� ���� ������)
	// �ƹ� �ڵ嵵 ������ �ɹ� �ʵ�� �⺻������ �ʱ�ȭ �ȴ�.
	public Sample() {
		System.out.println("�����Ϸ��� ������ִ� ������");
	}
}

class Sample1 {
	// �ɹ� �ʵ�
	public int number;
	public String str;

	// ������ ����
	public Sample1(int number, String str) {
		this.number = number;
		this.str = str;
	}
}

public class Start {
	public static void main(String[] args) {
		// s1 : ����Ÿ�� ������
		// �� �޸𸮿� Sample��ü�� ����(�ν��Ͻ� ����)
		// new ������ : [���޸𸮻���] -> [������ȣ��]
		// 4byte(��)+4byte(�ּ�) Sample�����ڰ� ����?
		Sample s1 = new Sample();
		System.out.println(s1.number + ", " + s1.str);

		// Sample1 s2 = new Sample1(); ����
		Sample1 s2 = new Sample1(10, "aaa");
	}
}
