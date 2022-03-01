package bit;

import bit.lib.BitGlobal;

//�帧
public class App {
	// �̱���--------------------------------------------------
	private App() {
	}

	private static App instance = null;

	public static App GetInstance() {
		if (instance == null)
			instance = new App();
		return instance;
	}
	// --------------------------------------------------------

	private AccountControl acon = AccountControl.GetInstance();

	public void Init() {
		Logo();
	}

	public void Run() {
		while (true) {
			acon.PrintAll();
			Menu();

			switch (BitGlobal.InputChar("�޴� ����")) {
			case '0':
				return;
			case '1':
				acon.MakeAccount();
				break;
			case '2':
				acon.SelectAccount();
				break;
			case '3':
				acon.InputUpdateAccount();
				break;
			case '4':
				acon.OutputUpdateAccount();
				break;
			case '5':
				acon.DeleteAccount();
				break;
			default:
				System.out.println("�߸��� ����");
			}
		}
	}

	public void Exit() {
		Ending();
	}

	private void Menu() {
		System.out.println("------------------------------------------");
		System.out.println(" [0] ���α׷� ����)");
		System.out.println(" [1] ���� ����(insert)");
		System.out.println(" [2] ���� �˻�(select)");
		System.out.println(" [3] ���� �Ա�(update)");
		System.out.println(" [4] ���� ���(update)");
		System.out.println(" [5] ���� ����(update)");
		System.out.println("------------------------------------------");
	}

	private void Logo() {
		System.out.println("------------------------------------------");
		System.out.println(" Java Programming �ǽ�");
		System.out.println(" 2022-02-03");
		System.out.println(" ccm");
		System.out.println("------------------------------------------");
	}

	private void Ending() {
		System.out.println("------------------------------------------");
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("------------------------------------------");
	}
}
