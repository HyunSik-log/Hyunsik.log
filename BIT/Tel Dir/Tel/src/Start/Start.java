package Start;

import tel.App;

public class Start {
	
	public static void main(String[] args) {
		App app = App.GetInstance();
		
		app.Run();
		app.Exit();
	}
}
