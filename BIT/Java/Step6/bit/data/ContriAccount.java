package bit.data;

public class ContriAccount extends Account {

	private int contribution;

	public ContriAccount(String name) {
		// super(name);
		// contribution = 0;
		this(name, 0);
	}

	public ContriAccount(String name, int balance) {
		super(name, (int) (balance - balance * 0.01f));
		contribution = (int) (balance * 0.01f);
	}

	@Override
	public void InputMoney(int money) throws Exception {
		int my = (int) (money - money * 0.01f);

		// my�� �Ա�ó���� �Ǿ�� �Ѵ�.
		super.InputMoney(my); // <-------------------

		contribution += (int) money * 0.01f;
	}

	@Override
	public void Print() {
		super.Print();
		System.out.print(", " + contribution);
	}

	@Override
	public void Println() {
		super.Println();
		System.out.println("[��α��Ѿ�] " + contribution);
	}
}
