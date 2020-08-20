import java.awt.Graphics;

//**********************************************************************
//  Name: Fractal.java
//  Draws C-Curve Fractal recursively
//**********************************************************************
public class Fractal {

	public void drawCCurve(Graphics g, int x1, int y1, int x2, int y2, int level) {
		// PRIMITIVE STATE: DRAWS A STRAIGHT LINE FROM X1,Y1 TO X2,Y2
		if (level == 1) {
			g.drawLine(x1, y1, x2, y2);
		}
		// RECURSIVE ELEMENT: TWO LINES WILL BE PRODUCED FOR EVERY EXISTING LINE
		else {
			int xn = (x1 + x2) / 2 + (y1 - y2) / 2;
			int yn = (x2 - x1) / 2 + (y1 + y2) / 2;

			drawCCurve(g, x1, y1, xn, yn, level - 1);
			drawCCurve(g, xn, yn, x2, y2, level - 1);
		}
	}
}