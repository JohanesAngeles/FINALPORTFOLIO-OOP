import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Javaworks4 {

	 JFrame JavaWorks4Frame;
	private final JLabel JavaworksCompilation4 = new JLabel("");
	private final JLabel JavaWorksFrame4Description = new JLabel("");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Javaworks4 window = new Javaworks4();
					window.JavaWorks4Frame.setVisible(true);
					window.JavaWorks4Frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Javaworks4() {
		initialize();
	}

	private void initialize() {
		
		//frame content
		JavaWorks4Frame = new JFrame();
		JavaWorks4Frame.setResizable(false);
		JavaWorks4Frame.setBounds(100, 100, 909, 627);
		JavaWorks4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JavaWorks4Frame.getContentPane().setLayout(null);
		
		//navigation button
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Javaworks3 java3 = new Javaworks3();
				java3.JavaWorksFrame3.setVisible(true);
				JavaWorks4Frame.dispose();
			}
		});
		JavaWorksFrame4Description.setIcon(new ImageIcon(Javaworks4.class.getResource("/image/JavaWorksFrame$Descroption.png")));
		JavaWorksFrame4Description.setBounds(69, 448, 791, 108);
		
		JavaWorks4Frame.getContentPane().add(JavaWorksFrame4Description);
		returnButton.setIcon(new ImageIcon(Javaworks4.class.getResource("/image/ReturnButton2.png")));
		returnButton.setBounds(634, -7, 259, 108);
		JavaWorks4Frame.getContentPane().add(returnButton);
		JavaworksCompilation4.setIcon(new ImageIcon(Javaworks4.class.getResource("/image/Javaworks4.png")));
		JavaworksCompilation4.setBounds(0, -7, 900, 603);
		JavaWorks4Frame.getContentPane().add(JavaworksCompilation4);
	}

}
