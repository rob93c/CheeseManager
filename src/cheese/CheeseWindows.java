package cheese;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class CheeseWindows {

	private JFrame frame;
	private ImageIcon img = new ImageIcon("/home/rob93c/CheeseManager/img/icon_32w.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheeseWindows window = new CheeseWindows();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setTitle("CheeseManager");
		frame.setBounds(100, 100, 672, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(img.getImage());
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
	}
}
