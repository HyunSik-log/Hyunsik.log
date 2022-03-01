//Start.java
import java.util.Scanner;

public class Start {
	private static Scanner scan = new Scanner(System.in);

	public static void Logo() {
		System.out.println("------------------------------------------");
		System.out.println(" Java Programming �ǽ�");
		System.out.println(" 2022-01-28");
		System.out.println(" ccm");
		System.out.println(" [����] ");
		System.out.println(" create ���¹�ȣ �̸� �ܾ�");
		System.out.println(" drop");
		System.out.println(" input �Աݾ�");
		System.out.println(" output ��ݾ�");
		System.out.println(" info");
		System.out.println(" exit");
		System.out.println("------------------------------------------");
	}

	public static void Ending() {
		System.out.println("------------------------------------------");
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("------------------------------------------");
	}

	public static void Run() {
		AccountControl con = new AccountControl();

		while (true) {
			System.out.print(">> ");
			String msg = scan.nextLine();
			String[] sp = msg.split(" ");
			if (sp[0].equals("exit"))
				return;
			else if (sp[0].equals("drop")) {
				con.DeleteAccount();
			} else if (sp[0].equals("create")) {// create ���¹�ȣ �̸� �ܾ�
				int accid = Integer.parseInt(sp[1]);
				String name = sp[2];
				int balance = Integer.parseInt(sp[3]);
				con.MakeAccount(accid, name, balance);
			}
			con.Print();
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Logo();
		Run();
		Ending();
	}
}
