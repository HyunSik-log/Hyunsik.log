package bit;

//�迭 ��� �����
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

	// �迭 insert �˰���(Overflow���� �˻� --> size�� ��ġ�� ���� --> size++)
	public void PushBack(Account acc) throws Exception {
		if (max <= size)
			throw new Exception("Overflow");

		accs[size] = acc;
		size++;
	}

	// �迭 delete �˰���(��ȿ�� �ε��� �˻� --> �̵� --> size--)
	public void Erase(int idx) throws Exception {
		if (idx < 0 || idx >= size) // �߸��� �ε���
			throw new Exception("�߸��� �ε���");

		for (int i = idx; i < (size - 1); i++) {
			accs[i] = accs[i + 1];
		}
		size--;
	}
}
