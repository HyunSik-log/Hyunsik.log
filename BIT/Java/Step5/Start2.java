//Object 클래스
//모든 클래스들은 암시적으로 Object의 자식이 된다.

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

	// Object 재정의
	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}

	@Override
	public boolean equals(Object ob) {
		// 다운 캐스팅
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

	// toString() : 자신이 원하는 정보의 문자열 반환용도로 재정의
	// 부모가 갖고 있는 toString의 반환 정보 : MyDate@1db9742
	public static void exam1() {
		MyDate d1 = new MyDate(2022, 2, 4);

		// 사용1: 명시적 호출
		String str = d1.toString();
		System.out.println(str);

		// 사용2 : 객체를 출력요청할 때 암시적으로 toString()이 호출됨.
		System.out.println(d1); // d1.toString()
	}

	// equals() : 비교
	public static void exam2() {
		MyDate d1 = new MyDate(2022, 2, 4);
		MyDate d2 = new MyDate(2022, 2, 4);

		if (d1.equals(d2)) {
			System.out.println("동일 날짜");
		} else {
			System.out.println("서로 다른 날짜");
		}
	}

	// clone() : 복사본
	// 부모가 갖고 있는 clone은 외부에서 사용할 수 없도록 접근이 제한되어 있다.
	// 이 기능이 필요하다면 재정의해서 public으로 공개하면 된다.
	// 1번째 : Cloneable이라는 인터페이스를 상속받는다.
	// 2번째 : clone 재정의
	public static void exam3() {
		MyDate d1 = new MyDate(2022, 2, 4);
		MyDate d1copy = (MyDate) d1.clone();
		d1copy.Print();
	}

	public static void main(String[] args) {
		exam3();
	}
}
