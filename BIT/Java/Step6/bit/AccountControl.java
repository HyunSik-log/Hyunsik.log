package bit;

import bit.data.*;
import bit.lib.BitGlobal;

public class AccountControl {
	// -�̱���--------------------------------------------------
	private AccountControl() {
		int max = BitGlobal.InputInteger("���� ����");

		// max���� ������ �� �ִ� ���尴ü ����
		arr = new MyArr(max);
	}

	private static AccountControl instance = null;

	public static AccountControl GetInstance() {
		if (instance == null)
			instance = new AccountControl();
		return instance;
	}
	// --------------------------------------------------------

	// ���尴ü ����
	private MyArr arr;

	// ��ü ���
	public void PrintAll() {
		System.out.println("-----------------------------------------");
		System.out.printf("[���尳�� : %d\n", arr.getSize());
		for (int i = 0; i < arr.getSize(); i++) {
			Account acc = arr.getData(i);
			System.out.printf("[%02d] ", i);
			acc.Print();
			System.out.println("");
		}
		System.out.println("-----------------------------------------");
	}

	private Account MakeAccount(String name, int balance) throws Exception {
		System.out.println("[1] �Ϲݰ��� [2] �ſ���� [3] ��ΰ���");
		int idx = BitGlobal.InputInteger("���¼���");

		Account acc = null;
		switch (idx) {
		case 1:
			acc = new Account(name, balance);
			break;
		case 2:
			acc = new FaithAccount(name, balance);
			break;
		case 3:
			acc = new ContriAccount(name, balance);
			break;
		default:
			throw new Exception("�߸��� ���� ����");
		}
		return acc;
	}

	// 1) insert�帧(��������->���尴ü����->[����]->�Ϸ�޽���)
	public void MakeAccount() {
		try {
			String name = BitGlobal.InputString("�̸�");
			int balance = BitGlobal.InputInteger("�Աݾ�");

			Account acc = MakeAccount(name, balance);

			// ������ ���尴ü�� ��û(����ó��, throw����!)
			arr.PushBack(acc);

			System.out.println("���� ���� ����");
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}

	// �˻� �˰���
	private int IdToIdx(int id) throws Exception {

		for (int i = 0; i < arr.getSize(); i++) {
			Account acc = arr.getData(i);
			if (acc.getAccid() == id)
				return i;
		}
		throw new Exception("���� ���̵��Դϴ�");
	}

	// 2) select�帧(�˻�Ű����ȹ�� -> �˻��˰���(�����˻�,�迭) -> ã�� ��ü ���� ���)
	public void SelectAccount() {
		try {
			int id = BitGlobal.InputInteger("���¹�ȣ");

			int idx = IdToIdx(id);

			// ����ҿ��� �ش� �ε����� ����� ��ü�� �ּ� ��ȯ��û
			Account acc = arr.getData(idx);

			acc.Println();
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}

	// 3) delete�帧(�˻�Ű����ȹ�� -> �˻��˰���(�����˻�,�迭) -> ã�� ��ü ���� ->������)
	public void DeleteAccount() {
		try {
			int id = BitGlobal.InputInteger("���¹�ȣ");

			int idx = IdToIdx(id);

			// ����ҿ��� �ش� �ε����� ����� ��ü ���� ��û
			arr.Erase(idx);

			System.out.println("�����Ǿ����ϴ�");
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}

	// 4) update�帧(�˻�Ű����ȹ�� -> �˻��˰���(�����˻�,�迭) -> ã�� ��ü��������->������)
	public void InputUpdateAccount() {
		try {
			int id = BitGlobal.InputInteger("���¹�ȣ");

			int idx = IdToIdx(id);

			// ����ҿ��� �ش� �ε��� ��ü ��ȯ ��û
			Account acc = arr.getData(idx);

			int money = BitGlobal.InputInteger("�Աݾ�");
			acc.InputMoney(money);

			System.out.println("�ԱݵǾ����ϴ�.");
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}

	public void OutputUpdateAccount() {
		try {
			int id = BitGlobal.InputInteger("���¹�ȣ");

			int idx = IdToIdx(id);

			// ����ҿ��� �ش� �ε��� ��ü ��ȯ ��û
			Account acc = arr.getData(idx);

			int money = BitGlobal.InputInteger("��ݾ�");
			acc.OutputMoney(money);

			System.out.println("��ݵǾ����ϴ�.");
		} catch (Exception ex) {
			System.out.println("���� : " + ex.getMessage());
		}
	}
}
