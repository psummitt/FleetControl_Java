import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class ImageFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public ImageFrame() {
		// Set the JFrame properties
		setTitle("FleetControl");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Load the image and set it as the icon for the JLabel
		ImageIcon icon = new ImageIcon(
				getClass().getResource("/img/Truck_368x368.jpg"));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{384, 0};
		gridBagLayout.rowHeights = new int[]{368, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		// Create a JLabel for the image
		JLabel imageLabel = new JLabel();
		imageLabel.setIcon(icon);
		// Add the JLabel to the JFrame
		GridBagConstraints gbc_imageLabel = new GridBagConstraints();
		gbc_imageLabel.anchor = GridBagConstraints.NORTH;
		gbc_imageLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_imageLabel.gridx = 0;
		gbc_imageLabel.gridy = 0;
		getContentPane().add(imageLabel, gbc_imageLabel);
	}
	public static void main(String[] args) {
		// Run the application
		javax.swing.SwingUtilities.invokeLater(() -> {
			ImageFrame frame = new ImageFrame();
			frame.setVisible(true);
		});
	}
}