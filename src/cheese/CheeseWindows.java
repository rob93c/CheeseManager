package cheese;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class CheeseWindows {

	private JFrame frmCheesemanagerByRobc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheeseWindows window = new CheeseWindows();
					window.frmCheesemanagerByRobc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheeseWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheesemanagerByRobc = new JFrame();
		frmCheesemanagerByRobc.setTitle("CheeseManager");
		frmCheesemanagerByRobc.setBounds(100, 100, 672, 562);
		frmCheesemanagerByRobc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
