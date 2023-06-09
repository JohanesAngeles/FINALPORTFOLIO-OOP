import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Javaworks3 {

	 JFrame JavaWorksFrame3;
	 private final JLabel JavaworksCompilation3 = new JLabel("");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Javaworks3 window = new Javaworks3();
					window.JavaWorksFrame3.setVisible(true);
					window.JavaWorksFrame3.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Javaworks3() {
		initialize();
	}
    
	private void initialize() {
		
		//frame content
		JavaWorksFrame3 = new JFrame();
		JavaWorksFrame3.setResizable(false);
		JavaWorksFrame3.setBounds(100, 100, 909, 632);
		JavaWorksFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JavaWorksFrame3.getContentPane().setLayout(null);
		
		//navigation content 
		JLabel proceedButton = new JLabel("");
		proceedButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Javaworks4 java4 = new Javaworks4();
				java4.JavaWorks4Frame.setVisible(true);
				JavaWorksFrame3.dispose();
	
			
				
			}
		});
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Javaworks2 java2 = new Javaworks2();
				java2.JavaWorks2Frame.setVisible(true);
				JavaWorksFrame3.dispose();
			}
		});
		
		JLabel ReservationSlotDescription = new JLabel("");
		ReservationSlotDescription.setIcon(new ImageIcon(Javaworks3.class.getResource("/image/ReserveSlotDeacription.png")));
		ReservationSlotDescription.setBounds(463, 91, 374, 100);
		JavaWorksFrame3.getContentPane().add(ReservationSlotDescription);
		
		JLabel MenuSystemDescription = new JLabel("");
		MenuSystemDescription.setIcon(new ImageIcon(Javaworks3.class.getResource("/image/menudescription.png")));
		MenuSystemDescription.setBounds(79, 99, 374, 81);
		JavaWorksFrame3.getContentPane().add(MenuSystemDescription);
		returnButton.setIcon(new ImageIcon(Javaworks3.class.getResource("/image/ReturnButton2.png")));
		returnButton.setBounds(640, 0, 253, 86);
		JavaWorksFrame3.getContentPane().add(returnButton);
		proceedButton.setIcon(new ImageIcon(Javaworks3.class.getResource("/image/proceedButton.png")));
		proceedButton.setBounds(323, 499, 264, 261);
		JavaWorksFrame3.getContentPane().add(proceedButton);
		JavaworksCompilation3.setIcon(new ImageIcon(Javaworks3.class.getResource("/image/Javaworks3.png")));
		JavaworksCompilation3.setBounds(0, 0, 903, 593);
		JavaWorksFrame3.getContentPane().add(JavaworksCompilation3);
	}

}
