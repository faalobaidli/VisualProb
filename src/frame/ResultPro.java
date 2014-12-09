package frame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import controller.*;

/**
 * @author waleed
 * 
 *         This class demonstrated the results in a textual form extracted from
 *         controller.Controller class after calculations.
 * 
 */
@SuppressWarnings("serial")
public class ResultPro extends javax.swing.JFrame {

	// Variables declaration
	private JButton DemoButton;
	private JButton EditButton;
	private JButton HelpButton1;
	private JButton NewButton;
	private JLabel jLabel1;
	private JScrollPane jScrollPane1;
	private JTextArea TextAreaResult;
	static String EditEventOutputA;
	static String EditFormulaOutput;
	static String EditFormulaOutput1;
	int currentInput;

	public ResultPro(int x) {
		currentInput = x;
		initComponents();

	}

	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		TextAreaResult = new javax.swing.JTextArea();
		HelpButton1 = new javax.swing.JButton();
		NewButton = new javax.swing.JButton();
		EditButton = new javax.swing.JButton();
		DemoButton = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		getContentPane().setBackground(Color.black);
		HelpButton1.setBackground(Color.black);

		TextAreaResult.setEditable(false);
		TextAreaResult.setBackground(new java.awt.Color(204, 204, 204));
		TextAreaResult.setColumns(20);
		TextAreaResult.setRows(5);
		TextAreaResult.setWrapStyleWord(true);
		jScrollPane1.setViewportView(TextAreaResult);
		TextAreaResult
				.addAncestorListener(new javax.swing.event.AncestorListener() {
					public void ancestorMoved(
							javax.swing.event.AncestorEvent evt) {
					}

					public void ancestorAdded(
							javax.swing.event.AncestorEvent evt) {
						TextAreaResultAncestorAdded(evt);
					}

					public void ancestorRemoved(
							javax.swing.event.AncestorEvent evt) {
					}
				});

		HelpButton1.setBackground(new java.awt.Color(80, 80, 80));
		HelpButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		HelpButton1.setText("Help");
		HelpButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				HelpButton1ActionPerformed(evt);
			}
		});

		NewButton.setBackground(new java.awt.Color(80, 80, 80));
		NewButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		NewButton.setText("New ");
		NewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NewButtonActionPerformed(evt);
			}
		});

		EditButton.setBackground(new java.awt.Color(80, 80, 80));
		EditButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		EditButton.setText("Edit");
		EditButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EditButtonActionPerformed(evt);
			}
		});

		DemoButton.setBackground(new java.awt.Color(80, 80, 80));
		DemoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		DemoButton.setText("Demo");
		DemoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DemoButtonActionPerformed(evt);
			}
		});

		jLabel1.setIcon(new javax.swing.ImageIcon("images/results.png"));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(56, 56, 56)
								.addComponent(HelpButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										85,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(90, 90, 90)
								.addComponent(NewButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										85,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(90, 90, 90)
								.addComponent(EditButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										85,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(90, 90, 90)
								.addComponent(DemoButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										85,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(26, 56, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														507,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(108, 108, 108)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(34, 34, 34)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										113,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										281,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(40, 40, 40)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														HelpButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														33,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														NewButton,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														33,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														EditButton,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														33,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														DemoButton,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														33,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(25, 25, 25)));

		pack();
	}

	private void DemoButtonActionPerformed(java.awt.event.ActionEvent evt) {
		new DemoPro();
	}

	private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {

		StartPro.input.get(currentInput).setVisible(true);
		setVisible(false);

	}

	private void NewButtonActionPerformed(java.awt.event.ActionEvent evt) {

		StartPro.input.clear();
		StartPro.input.add(new InputPro());
		StartPro.input.get(StartPro.input.size() - 1).setVisible(true);

		setVisible(false);
	}

	private void HelpButton1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void TextAreaResultAncestorAdded(javax.swing.event.AncestorEvent evt) {
		String data = Controller.getInstance().problem.resultString();
		TextAreaResult.setText(data);

	}

}
