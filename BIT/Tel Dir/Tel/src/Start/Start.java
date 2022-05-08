package Start;

import java.io.IOException;

import tel.App;

public class Start {
	
	public static void main(String[] args) throws IOException {
		App app = App.GetInstance();
		
		app.Run();
		app.Exit();
	}
}