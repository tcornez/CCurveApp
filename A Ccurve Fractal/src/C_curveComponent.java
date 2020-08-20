import java.awt.Graphics;
import javax.swing.JComponent;
//**********************************************************************
//Name: C_curveComponent.java
//Represents the drawing canvas.
//Derived from JComponent
//**********************************************************************

public class C_curveComponent extends JComponent {

	// DATA MEMBERS: THE DRAWING COMPONENT
	// Each drawing component requires a start and end point.
	private Fractal fractal;
	private int level;
	private int x1, y1, x2, y2;

	public C_curveComponent() {
		level = 2;
		fractal = new Fractal();
	}

	public void setXY(int _x1, int _y1, int _x2, int _y2) {
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
	}

	public void setLevel(int _level) {
		level = _level;
	}

	public void createCcurve() {
		repaint();
	}

	public void paintComponent(Graphics g) {
		fractal.drawCCurve(g, x1, y1, x2, y2, level);
	}
}