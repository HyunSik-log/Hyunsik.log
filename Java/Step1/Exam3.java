
class MyDate {
	public int year;
	public int month;
	public int day;
}

public class Exam3 {

	public static void PrintDate(int year, int month, int day) {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}

	// ��¥�� �̿��� ����
	// �⺻�� Ÿ���� Ȱ���Ѵٸ�?
	public static void example1() {
		int year;
		int month;
		int day;

		year = 2021;
		month = 1;
		day = 28;

		PrintDate(year, month, day);
	}

	// MyDateŸ�� ���� �� ���
	public static void example2() {
		MyDate d1 = new MyDate();

		d1.year = 2022;
		d1.month = 1;
		d1.day = 28;

		PrintDate(d1.year, d1.month, d1.day);
	}

	public static void main(String[] args) {
		example2();
	}
}
