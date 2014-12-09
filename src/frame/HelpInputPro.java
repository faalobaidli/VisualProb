/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Color;

/**
 * 
 * @author waleed
 * 
 *         This class simply shows some usage guidelines for the user.
 */
@SuppressWarnings("serial")
public class HelpInputPro extends javax.swing.JFrame {

	public HelpInputPro() {
		initComponents();
	}

	private void initComponents() {

		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
		setBackground(new java.awt.Color(0, 0, 0));
		getContentPane().setBackground(Color.black);
		jLabel8.setForeground(Color.white);

		//HTML syntax used to format the layout if the text
		jLabel8.setText("<html> <center> <h1> Help </h1> </center><br/>"
				+ "<h3><strong>The aim of this software is to help students calculate probabilities of certain events in a large <br/>sample set or a combination of samples.</strong></h3>"
				+ "<p><strong>Adding samples:</strong></P><br/>"
				+ "<ul>"
				+ "<li>"
				+ " Add each sample by separating its elements using commas in the 'S' field. e.g.1, 2, 3, four, 5 </li>"
				+ "<li> Add more samples by clicking the �Add+� button for more fields to appear.</li>"
				+ "<li>For two or more samples, the elements will be combined by default or you may choose to permutation by clicking the radio button at the top.</li>"
				+ "</ul>"
				+ "<p><strong> Adding events: </strong></P><br/>"
				+ "<ul>"
				+ "<li>"
				+ " Events can be specified using operator '=', '>' or '<' e.g.>=4 </li>"
				+ "<li> To specify position for that element, using the same format of the sample with the possibility of using '*' as a wildcard e.g.*,>=4,* (represents all events where '>=4' happens in the second position/turn)</li>"
				+ "<li>Add more events by clicking the �Add+� button for more fields to appear.</li>"
				+ "</ul>"
				+ "<p><strong> Specifying the formula: </strong></P><br/>"
				+ "<ul>"
				+ "<li>"
				+ " Using the specified keys below the field, you may generate a formula be specifying the appropriate events from the drop down menu. e.g.P(A U B) (represents the probability of events A or B)</li>"
				+ "</ul>" + "</html>");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addGap(20, 20, 20)
						.addComponent(jLabel8,
								javax.swing.GroupLayout.PREFERRED_SIZE, 704,
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
