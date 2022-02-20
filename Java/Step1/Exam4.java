
//캡슐화 구조
//TV[전원, 볼륨, 채널]
class TV {
	private boolean ispower; // true or false
	private int volume;
	private int channel; // 0~30 항상 유효한 값만 저장하기를 원하는 것(무결성)

	public TV() {
		this(2, 0); // this : 자기자신을 가리키는 식별자
					// 또 다른 생성자를 호출!
		// ispower = false;
		// volume = 2;
		// channel = 0;
	}

	public TV(int _volume, int _channel) {
		ispower = false;
		volume = _volume;
		channel = _channel;
	}

	public void OnOff() {
		ispower = !ispower;
	}

	public void UpChannel() {
		channel++;
	}

	public void DownChannel() {
		channel--;
	}

	public void ChangeChannel(int value) {
		if (value < 0 || value > 30) {
			System.out.println("없는 채널");
			return; // 함수 종료
		}

		channel = value;
	}

	// 문자열 + 기본형타입 -> 문자열 + 문자열 -> 하나의 문자열 반환
	public void Print() {
		System.out.println("---------------------------------");
		System.out.println("[전원] " + ispower);
		System.out.println("[볼륨] " + volume);
		System.out.println("[채널] " + channel);
		System.out.println("---------------------------------");
	}
}

public class Exam4 {
	public static void main(String[] args) {

		// 2개의 생성자가 제공된다.
		// 객체 생성 방법이 2가지 이다.
		TV tv1 = new TV();
		TV tv2 = new TV(10, 20);
		tv1.Print();
		tv2.Print();

		TV tv = new TV();
		tv.Print();
		tv.OnOff();
		tv.Print();
		tv.UpChannel();
		tv.UpChannel();
		tv.Print();

		tv.ChangeChannel(50);
		tv.Print();

		// 데이터가 외부에서 접근되도록 공개되어 있다.
		// tv.channel = 100; tv.Print();
	}
}
