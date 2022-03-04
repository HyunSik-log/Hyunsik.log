//Object Ŭ����
//��� Ŭ�������� �Ͻ������� Object�� �ڽ��� �ȴ�.

class MyDate implements Cloneable {
	private int year;
	private int month;
	private int day;

	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public void Print() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}

	// Object ������
	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}

	@Override
	public boolean equals(Object ob) {
		// �ٿ� ĳ����
		if (ob instanceof MyDate) {
			MyDate d1 = (MyDate) ob;
			if (this.year == d1.year && this.month == d1.month && this.day == d1.day)
				return true;
		}
		return false;
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}

public class Start2 {

	// toString() : �ڽ��� ���ϴ� ������ ���ڿ� ��ȯ�뵵�� ������
	// �θ� ���� �ִ� toString�� ��ȯ ���� : MyDate@1db9742
	public static void exam1() {
		MyDate d1 = new MyDate(2022, 2, 4);

		// ���1: ����� ȣ��
		String str = d1.toString();
		System.out.println(str);

		// ���2 : ��ü�� ��¿�û�� �� �Ͻ������� toString()�� ȣ���.
		System.out.println(d1); // d1.toString()
	}

	// equals() : ��
	public static void exam2() {
		MyDate d1 = new MyDate(2022, 2, 4);
		MyDate d2 = new MyDate(2022, 2, 4);

		if (d1.equals(d2)) {
			System.out.println("���� ��¥");
		} else {
			System.out.println("���� �ٸ� ��¥");
		}
	}

	// clone() : ���纻
	// �θ� ���� �ִ� clone�� �ܺο��� ����� �� ������ ������ ���ѵǾ� �ִ�.
	// �� ����� �ʿ��ϴٸ� �������ؼ� public���� �����ϸ� �ȴ�.
	// 1��° : Cloneable�̶�� �������̽��� ��ӹ޴´�.
	// 2��° : clone ������
	public static void exam3() {
		MyDate d1 = new MyDate(2022, 2, 4);
		MyDate d1copy = (MyDate) d1.clone();
		d1copy.Print();
	}

	public static void main(String[] args) {
		exam3();
	}
}
