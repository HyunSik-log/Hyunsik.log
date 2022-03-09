package bit.lib;

import java.util.Scanner;

public class BitGlobal {
	private static Scanner scan = new Scanner(System.in);

	public static int InputInteger(String msg) {
		System.out.print(msg + " : ");
		return Integer.parseInt(scan.nextLine());
	}

	public static float InputFloat(String msg) {
		System.out.print(msg + " : ");
		return Float.parseFloat(scan.nextLine());
	}

	public static char InputChar(String msg) {
		System.out.print(msg + " : ");
		return scan.nextLine().charAt(0);
	}

	public static String InputString(String msg) {
		System.out.print(msg + " : ");
		return scan.nextLine();
	}
}
