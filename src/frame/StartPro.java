package frame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * @author waleed
 * 
 *         This is the main class frame and it is the start page of the software
 *         where user have the option to either navigate to the input frame or
 *         view the About Us frame.
 * 
 */
@SuppressWarnings("serial")
public class StartPro extends javax.swing.JFrame {

	static List<InputPro> input = new ArrayList<InputPro>();
	static int solutionID = 0;

	// Variables declaration
	private JButton AboutUsButton;
	private JButton StartButton;
	private JLabel jLabel1;
	private JLabel jLabel3;
	private JLabel jLabel4;

	public StartPro() {
		initComponents();
	}

	private void initComponents() {

		StartButton = new JButton();
		AboutUsButton = new JButton();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel1 = new JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		pack();
		getContentPane().setBackground(Color.black);
		setTitle("Probability");

		StartButton.setBackground(new java.awt.Color(80, 80, 80));

		StartButton.setFont(new java.awt.Font("Tahoma", 1, 14));
		StartButton.setText("Start");
		StartButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				StartButtonActionPerformed(evt);
			}
		});

		AboutUsButton.setBackground(new java.awt.Color(80, 80, 80));

		AboutUsButton.setFont(new java.awt.Font("Tahoma", 1, 14));
		AboutUsButton.setText("About us");
		AboutUsButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AboutUsButtonActionPerformed(evt);
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon("images/coin_toss.jpg"));

		jLabel4.setIcon(new javax.swing.ImageIcon("images/dices.jpg"));

		jLabel1.setIcon(new javax.swing.ImageIcon("images/Untitled2.png"));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(63, 63, 63)
								.addComponent(AboutUsButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										95,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(StartButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										95,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(87, 87, 87))
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										455,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										262,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(215, 215, 215)
								.addComponent(jLabel1)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										109,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														501,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														0, Short.MAX_VALUE))
								.addGap(10, 10, 10)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														StartButton,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														AboutUsButton,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(27, 27, 27)));

		pack();
	}

	private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {

		input.add(new InputPro());
		input.get(solutionID).setID(solutionID);
		input.get(solutionID).setVisible(true);
		solutionID++;

	}

	private void AboutUsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		new AboutUSPro().setVisible(true);
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(StartPro.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StartPro.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StartPro.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StartPro.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}

		new StartPro().setVisible(true);

	}

}
