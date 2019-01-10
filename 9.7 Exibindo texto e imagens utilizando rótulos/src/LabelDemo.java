import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {

	public static void main(String[] args) {
		
		JLabel labelNorte = new JLabel("Norte");
		
		ImageIcon labelIcone = new ImageIcon("gremio.gif");
		
		JLabel labelCentro = new JLabel(labelIcone);
		
		JLabel labelSul = new JLabel(labelIcone);
		
		labelSul.setText("Sul");
		
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		app.add(labelNorte, BorderLayout.NORTH);
		app.add(labelCentro, BorderLayout.CENTER);
		app.add(labelSul, BorderLayout.SOUTH);
		
		app.setSize(400, 400);
		app.setVisible(true);
	}

}
