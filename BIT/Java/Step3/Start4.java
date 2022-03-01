//static맴버필드 활용2(생성된 인스턴스 개수 세기?)

class Star4Sample {
	private static int s_count = 0; // 객체가 공유

	// 생성자
	public Star4Sample() {
		s_count++;
		System.out.println(s_count + "번째 객체가 생성되었습니다.");
	}
}

public class Start4 {
	public static void main(String[] args) {
		// Star4Sample 객체 1개가 생성
		Star4Sample s1 = new Star4Sample();

		// Star4Sample 객체를 담을 5개의 저장공간 생성
		Star4Sample[] s2 = new Star4Sample[5];

		// 배열의 0번째 공간 저장 : Star4Sample객체를 1개 생성
		s2[0] = new Star4Sample();
	}
}
