package bit.data;

public class FaithAccount extends Account {

	public FaithAccount(String name) {
		super(name);
	}

	public FaithAccount(String name, int balance) {
		super(name, (int) (balance + balance * 0.01f));
	}

	@Override
	public void InputMoney(int money) throws Exception {
		int my = (int) (money + money * 0.01f);

		// my�� �Ա�ó���� �Ǿ�� �Ѵ�.
		super.InputMoney(my); // <-------------------
	}
}
