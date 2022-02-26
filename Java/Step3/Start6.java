//final
//자바언어에서의 final은 단 한번 초기화가 가능하다.
//(초기화 : 변수 선언 후 최초 값을 저장)
/*
1) 선언과 동시에 초기화
   int num = 10;

2) 선언과 별도로 대입연산을 통한 초기화
   int num;
   num = 10; //초기화
*/

class Start6Sample {
	// 인스턴스 맴버
	int number; // 맴버 필드, 맴버 변수
	final int F_NUMBER; // 맴버 필드, 맴버 상수(클래스 영역에 선언된 변수)

	final int F_NUMBER1 = 10; // 모든 객체가 동일한 상수를 가진다.(동일한 값???)
	static final int F_NUMBER2 = 10; // 위 코드보다는 개선된 형태...

	public Start6Sample(int n, int n1) {
		number = n;
		F_NUMBER = n1;
	}

	void Print() {
		number = 2;
		// F_NUMBER = 2; //변경 불가
		System.out.println(number + ", " + F_NUMBER);
	}

	public void fun() {
		final int F_NUMBER1; // 지역 상수(메서드 내부에 선언된 변수)

		F_NUMBER1 = 10; // 초기화 연산
		// F_NUMBER1 = 20; //대입 연산(에러)

		System.out.println(F_NUMBER1);
	}
}

public class Start6 {
	public static void main(String[] args) {
		Start6Sample s1 = new Start6Sample(10, 20);
		s1.Print();

		s1.fun();
	}
}
