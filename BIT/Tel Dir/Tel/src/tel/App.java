package tel;

import tel.lib.*;

public class App {
	private App() {
	}

	private static App instance = null;

	public static App GetInstance() {
		if (instance == null)
			instance = new App();
		return instance;
	}

	private TelControl acon = TelControl.GetInstance();

	public void Run() {
		while(true) {
			acon.PrintAll();
			Menu();
			
			switch(TelLib.InputChar("�޴� ����")) {
			case '1': acon.MakeTel();				break;
			case '2': acon.SearchTel();				break;
			case '3': acon.SelectTel();				break;
			case '4': acon.UpdateTel();				break;
			case '5': acon.DeleteTel();				break;
			case '6': return;
			}
		}
	}
	
	public void Exit() {
		Ending();
	}
	
	private void Menu() {
		System.out.println("---------��ȭ��ȣ�� ����---------");
		System.out.println(" 1. ��ȭ��ȣ ����");
		System.out.println(" 2. ��ȭ��ȣ ��ȸ");
		System.out.println(" 3. ��ȭ��ȣ �˻�");
		System.out.println(" 4. ��ȭ��ȣ ����");
		System.out.println(" 5. ��ȭ��ȣ ����");
		System.out.println(" 6. ����");
	}

	private void Ending() {
		System.out.println("---------------------");
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("---------------------");
	}
}






