package tel;

import tel.data.*;

public class Arr {
	private Tel[] accs;
	private int max;
	private int size;

	public Arr() {
		this(10);
	}

	public Arr(int max) {
		this.max = max;
		this.size = 0;
		this.accs = new Tel[max];
	}

	public int getSize() {
		return size;
	}

	public Tel getData(int idx) {
		return accs[idx];
	}

	public void PushBack(Tel acc) throws Exception {
		if (max <= size)
			throw new Exception("Overflow");
		accs[size] = acc;
		size++;
	}

	public void Delete(int idx) throws Exception {
		if (idx < 0 || idx >= size)
			throw new Exception("잘못된 인덱스");

		for (int i = idx; i < (size - 1); i++) {
			accs[i] = accs[i + 1];
		}
		size--;
	}
}