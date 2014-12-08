package frame;

import java.awt.Color;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import vp.Problem;

import controller.*;

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

    private static String EditEventOutputB;
    private static String EditEventOutputC;
    private static String EditEventOutputD;
    static String EditFormulaOutput;
    private static String EditSampleOutputF_1;
    private static String EditSampleOutputF_2;
    private static String EditSampleOutputF_3;
    private static String EditSampleOutputF_4;
    static String EditFormulaOutput1;
    int currentInput;

    
//    Problem p = Controller.getInstance().problem;
    
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
        TextAreaResult.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextAreaResultAncestorAdded(evt);
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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
//        if(p.sampleSet > 100 )  then DemoButton.inactive		// restriction for the tree
        DemoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("images/results.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(HelpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(DemoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 56, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HelpButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DemoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
        );

        pack();
    }

    private void DemoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         new DemoPro();
    }

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {

        StartPro.input.get(currentInput).setVisible(true);
        setVisible(false);
       
    }

    private void NewButtonActionPerformed(java.awt.event.ActionEvent evt) {

        StartPro.input.clear();
        StartPro.input.add(new InputPro());
        // StartPro.input.get(currentInput).setVisible(true);
        StartPro.input.get(StartPro.input.size() - 1).setVisible(true);

        setVisible(false);
    }

    private void HelpButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void TextAreaResultAncestorAdded(javax.swing.event.AncestorEvent evt) {

//        EditEventOutputA = new InputPro().EventOutputA;
//        EditEventOutputB = new InputPro().EventOutputB;
//        EditEventOutputC = new InputPro().EventOutputC;
//        EditEventOutputD = new InputPro().EventOutputD;
//        EditFormulaOutput = new InputPro().FormulaOutput;
//        EditSampleOutputF_1 = new InputPro().SampleOutputF_1;
//        EditSampleOutputF_2 = new InputPro().SampleOutputF_2;
//        EditSampleOutputF_3 = new InputPro().SampleOutputF_3;
//        EditSampleOutputF_4 = new InputPro().SampleOutputF_4;

    	String data = Controller.getInstance().problem.resultString();
    	
//        String newline = System.getProperty("line.separator");
        TextAreaResult.setText(data);
//        TextAreaResult.setText("The Event A output is :" + EditEventOutputA + newline + "The Fourmula output is :" + EditFormulaOutput + newline
//                + "The Sample space 1 output is :" + EditSampleOutputF_1 + newline + "The Event B output is :" + EditEventOutputB + newline
//                + "The Event C output is :" + EditEventOutputC + newline + "The Event D output is :" + EditEventOutputD + newline
//                + "The Sample space 2 output is" + EditSampleOutputF_2 + newline + "The Sample space 3 output is"
//                + EditSampleOutputF_3 + newline + "The Sample space 4 output is" + EditSampleOutputF_4);

       
    }

}
