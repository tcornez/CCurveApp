import javax.swing.JFrame;

//**********************************************************************
//  Name: MyApp.java
//  The highest level of the app.
//**********************************************************************
public class MyApp {

	public static void main(String[] args) {
		JFrame frame = new C_curveFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}