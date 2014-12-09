package frame;

import java.awt.Color;

/**
 * 
 * @author waleed
 * 
 *         This class represents the About Us frame that includes information
 *         about the project
 * 
 */
@SuppressWarnings("serial")
public class AboutUSPro extends javax.swing.JFrame {

	public AboutUSPro() {
		initComponents();
	}

	private void initComponents() {

		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
		setBackground(new java.awt.Color(0, 0, 0));
		getContentPane().setBackground(Color.black);
		jLabel8.setForeground(Color.white);

		// HTML syntax was used to format the layout of the text
		jLabel8.setText("<html> <center> <h1> About us  </h1> </center><br/>"
				+ "<h3><strong>The aim of this software is to help students calculate probabilities of certain events in a large <br/>sample set or a combination of samples.</strong></h3>"
				+ "<br/>"
				+ "<p><center> This software is developed by Fahad Al-Obaidli, Waleed Alharbi and Salma Alzahrani. </center>"
				+ "<p><center>If you have any problems please feel free to contact us on { F.al-Obaidli,S.alzahrani,W.Alharbi }@uea.ac.uk  </center></p>"
				+ "<p><center>&copy; All rights reserved.</center></P>"
				+ "</html>");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(

		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addComponent(jLabel8,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										704,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(40, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addComponent(jLabel8,
								javax.swing.GroupLayout.PREFERRED_SIZE, 487,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(45, Short.MAX_VALUE)));

		pack();
	}

	private javax.swing.JLabel jLabel8;
}
