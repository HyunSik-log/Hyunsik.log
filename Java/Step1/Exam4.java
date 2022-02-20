
//ĸ��ȭ ����
//TV[����, ����, ä��]
class TV {
	private boolean ispower; // true or false
	private int volume;
	private int channel; // 0~30 �׻� ��ȿ�� ���� �����ϱ⸦ ���ϴ� ��(���Ἲ)

	public TV() {
		this(2, 0); // this : �ڱ��ڽ��� ����Ű�� �ĺ���
					// �� �ٸ� �����ڸ� ȣ��!
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
			System.out.println("���� ä��");
			return; // �Լ� ����
		}

		channel = value;
	}

	// ���ڿ� + �⺻��Ÿ�� -> ���ڿ� + ���ڿ� -> �ϳ��� ���ڿ� ��ȯ
	public void Print() {
		System.out.println("---------------------------------");
		System.out.println("[����] " + ispower);
		System.out.println("[����] " + volume);
		System.out.println("[ä��] " + channel);
		System.out.println("---------------------------------");
	}
}

public class Exam4 {
	public static void main(String[] args) {

		// 2���� �����ڰ� �����ȴ�.
		// ��ü ���� ����� 2���� �̴�.
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

		// �����Ͱ� �ܺο��� ���ٵǵ��� �����Ǿ� �ִ�.
		// tv.channel = 100; tv.Print();
	}
}
