package bit;

public class Account {
	private static int s_accid = 1000;

	private final int ACCID;
	private final String NAME;
	private int balance;

	// 생성자
	public Account(String name) {
		this(name, 0);
	}

	public Account(String name, int balance) {
		ACCID = s_accid;
		NAME = name;
		this.setBalance(balance);

		s_accid = s_accid + 10;
	}

	// get & set 메서드(필요에 의해서 외부 노출)
	public int getAccid() {
		return ACCID;
	}

	public String getName() {
		return NAME;
	}

	public int getBalance() {
		return balance;
	}

	private void setBalance(int balance) {
		if (balance < 0)
			return;

		this.balance = balance;
	}

	// 기능메서드
	// throws Exception : 예외명세(이 함수는 Exception 객체를 던지는 함수야)
	public void InputMoney(int money) throws Exception {
		if (money <= 0)
			throw new Exception("잘못된 금액입니다."); // 예외발생
		balance = balance + money;
	}

	public void OutputMoney(int money) throws Exception {
		if (money <= 0)
			throw new Exception("잘못된 금액입니다."); // 예외발생

		if (balance < money)
			throw new Exception("잔액이 부족합니다.");

		balance = balance - money;
	}

	public void Print() {
		System.out.println(ACCID + ", " + NAME + ", " + balance);
	}

	public void Println() {
		System.out.println("[계좌번호] " + ACCID);
		System.out.println("[이름] " + NAME);
		System.out.println("[잔액] " + balance);
	}
}
