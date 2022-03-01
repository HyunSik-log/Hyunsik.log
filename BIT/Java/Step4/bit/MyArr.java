package bit;

//배열 기반 저장소
public class MyArr {
	private Account[] accs;
	private int max;
	private int size;

	public MyArr() {
		this(10);
	}

	public MyArr(int max) {
		this.max = max;
		this.size = 0;
		this.accs = new Account[max];
	}

	public int getSize() {
		return size;
	}

	public Account getData(int idx) {
		return accs[idx];
	}

	// 배열 insert 알고리즘(Overflow조건 검사 --> size의 위치에 저장 --> size++)
	public void PushBack(Account acc) throws Exception {
		if (max <= size)
			throw new Exception("Overflow");

		accs[size] = acc;
		size++;
	}

	// 배열 delete 알고리즘(유효한 인덱스 검사 --> 이동 --> size--)
	public void Erase(int idx) throws Exception {
		if (idx < 0 || idx >= size) // 잘못된 인덱스
			throw new Exception("잘못된 인덱스");

		for (int i = idx; i < (size - 1); i++) {
			accs[i] = accs[i + 1];
		}
		size--;
	}
}
