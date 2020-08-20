import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//**********************************************************************
//Name: C_curveFrame.java
//Derived from JFrame
//**********************************************************************
public class C_curveFrame extends JFrame {

	// TASK 1: DECLARE DATA MEMBERS
	// NOTE: THESE WILL BE GUI ELEMENTS AND JPANEL THAT WILL BE PLACED
	// IN THE WINDOW FRAME. JPANEL WILL BE USED TO HOLD THE GUI ELEMENTS.
	private JPanel panel;
	private JLabel levelLabel;
	private JTextField levelField;
	private JButton button;
	private C_curveComponent cCurveDrawComponent;

	// DEFAULT CONSTRUCTOR
	public C_curveFrame() {
		// TASK 1: SET THE WIDTH AND HEIGHT OF THE WINDOW FRAME TO 700
		this.setSize(700, 700);

		// TASK 2: INSTANTIATE THE JPANEL CONTAINER TO HOLD THE GUI ELEMENTS
		panel = new JPanel();

		// TASK 3: BUILD EACH GUI ELEMENT AND ADD THEM TO THE JPANEL

		levelLabel = new JLabel("Level: ");
		levelField = new JTextField(10); // FIELD WIDTH OF 10
		levelField.setText("" + 12); // INITIALIZE THE TEXT FIELD TO 12
		button = new JButton("Create C-curve");
		// TASK 4: ADD EACH GUI ELEMENT TO THE PANEL
		panel.add(levelLabel);
		panel.add(levelField);
		panel.add(button);

		// TASK 5: INSTANTIATE THE DRAWING COMPONENT AND ADD IT TO THE JPANEL
		cCurveDrawComponent = new C_curveComponent();
		cCurveDrawComponent.setPreferredSize(new Dimension(700, 700));
		cCurveDrawComponent.setLevel(12); // 12 is the default level
		panel.add(cCurveDrawComponent);

		// TASK 7: ADD THE COMPLETED PANEL TO THE FRAME WINDOW
		this.add(panel);

		// TASK 6: REGISTER AN ACTION LISTENER FOR THE BUTTON
		ActionListener listener = new AddMyListener();
		button.addActionListener(listener);
	}

	class AddMyListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// TASK 1: GET THE FRACTAL LEVEL INPUT BY THE USER
			int level = Integer.parseInt(levelField.getText());
			cCurveDrawComponent.setLevel(level);

			// TASK 2: COMPUTE THE STARTING AND ENDING XY COORDINATES
			int frame_width = 700;
			int frame_height = 700;
			int x1 = frame_width / 4;
			int y1 = frame_height / 3;
			int x2 = frame_width - x1;
			int y2 = y1;

			// TASK 3: SET THE XY START AND END FOR THE DRAWING COMPONENT
			cCurveDrawComponent.setXY(x1, y1, x2, y2);

			// TASK 4: CREATE THE CURVE ON THE DRAWING COMPONENT
			cCurveDrawComponent.createCcurve();
		}
	}
}
