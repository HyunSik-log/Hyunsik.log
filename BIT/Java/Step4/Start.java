import bit.App;

public class Start {

	public static void main(String[] args) {
		App app = App.GetInstance();

		app.Init();
		app.Run();
		app.Exit();
	}
}
