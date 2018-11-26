import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestAwt extends JFrame {

	public static void main(String[] args) {
		TestAwt prog = new TestAwt();
		JPanel pnl = new JPanel();
		pnl.setLayout(new BorderLayout());
		prog.setSize(new Dimension(500, 500));
		
		pnl.add(new MyGraphics());
		prog.add(pnl);
		prog.setVisible(true);

	}

}
