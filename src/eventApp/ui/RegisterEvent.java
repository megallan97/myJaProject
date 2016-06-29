package eventApp.ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class RegisterEvent extends JPanel {

	protected JFrame myFrame= null;
	/**
	 * Create the panel.
	 */
	public RegisterEvent(JFrame mf) {
		myFrame=mf;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Event Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

	}

}
