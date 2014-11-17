package frame;


import java.awt.Color;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.*;


public class InputPro extends JFrame {

    int id;
void setID(int x){
    id = x;
}
    
        int clicked=1;
     int clicked2=1;
 static  String FormulaOutput;
static String EventOutputA;
 static   String EventOutputB;
 static String EventOutputC;
 static String EventOutputD;
static   String SampleOutputF_1;
  static  String SampleOutputF_2;
static  String SampleOutputF_3;
 static String SampleOutputF_4;
 
 
    private JButton AddEventButt;
    private JButton AddSampleButt;
    private JButton EventButton1;
 
    private JButton EventButton11;
  
    private JButton EventButton13;
    private JButton EventButton14;
    private JButton EventButton15;

    private JButton EventButton17;
  
    private JButton EventButton19;
    private JButton EventButton2;
    private JButton EventButton20;
    private JButton EventButton21;
  
    private JButton EventButton23;
 
    private JButton EventButton3;
 
    private JButton EventButton5;

    private JButton EventButton7;
    private JButton EventButton8;
    private JButton EventButton9;
    private JPanel EventPanel1;
    private JPanel EventPanel2;
    private JPanel EventPanel3;
    private JPanel EventPanel4;
    private JTextField EventTextField;
    private JTextField EventTextField1;
    private JTextField EventTextField2;
    private JTextField EventTextField3;
    private JButton FormulaButton;
    private JButton FormulaButton1;
    private JButton FormulaButton10;
    private JButton FormulaButton11;
    private JButton FormulaButton2;
    private JButton FormulaButton5;
    private JButton FormulaButton6;
    private JButton FormulaButton8;
    private JButton FormulaButton9;
    private JComboBox FormulaComboBox2;
    private JTextField FormulaTextField;
    private JButton Formulautton7;
    private JButton HelpButton2;
    private JButton NextButton1;
    private JPanel SamplePanel1;
    private JPanel SamplePanel2;
    private JPanel SamplePanel3;
    private JTextField SampleTextField;
    private JTextField SampleTextField2;
    private JTextField SampleTextField3;
    private JTextField SampleTextField5;
    private JButton formulaButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    
    
    public InputPro() {
        initComponents();
       
    }
  
                            
    private void initComponents() {

        SampleTextField = new JTextField();
        AddSampleButt = new JButton();
        jLabel1 = new JLabel();
        SamplePanel1 = new JPanel();
        SampleTextField2 = new JTextField();
        jLabel2 = new JLabel();
        SamplePanel3 = new JPanel();
        SampleTextField3 = new JTextField();
        jLabel4 = new JLabel();
        SamplePanel2 = new JPanel();
        SampleTextField5 = new JTextField();
        jLabel3 = new JLabel();
        EventPanel1 = new JPanel();
        EventTextField = new JTextField();
        EventButton3 = new JButton();
        EventButton2 = new JButton();
        EventButton1 = new JButton();
        jLabel6 = new JLabel();
  
        EventButton5 = new JButton();
   
        AddEventButt = new JButton();
        EventPanel2 = new JPanel();
        EventTextField1 =  new JTextField();
        EventButton7 = new JButton();
        EventButton8 = new JButton();
        EventButton9 = new JButton();
        jLabel7 = new JLabel();
   
        EventButton11 = new JButton();
     
        EventPanel3 = new JPanel();
        EventTextField2 = new JTextField();
        EventButton13 = new JButton();
        EventButton14 = new JButton();
        EventButton15 = new JButton();
        jLabel8 = new JLabel();
    
        EventButton17 = new JButton();
      
        EventPanel4 = new JPanel();
        EventTextField3 = new JTextField();
        EventButton19 = new JButton();
        EventButton20 = new JButton();
        EventButton21 = new JButton();
        jLabel9 = new JLabel();
 
        EventButton23 = new JButton();
    
        NextButton1 = new JButton();
        HelpButton2 = new JButton();
        FormulaTextField = new JTextField();
        jLabel10 = new JLabel();
        FormulaComboBox2 = new JComboBox();
        FormulaButton = new JButton();
        Formulautton7 = new JButton();
        FormulaButton2 = new JButton();
        FormulaButton1 = new JButton();
        formulaButton3 = new JButton();
        FormulaButton8 = new JButton();
        FormulaButton10 = new JButton();
        FormulaButton6 = new JButton();
        FormulaButton9 = new JButton();
        FormulaButton5 = new JButton();
        FormulaButton11 = new JButton();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("prob");
       
         getContentPane().setBackground(Color.black); 
   
        SampleTextField.setBackground(new java.awt.Color(220, 220, 220));
        SampleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SampleTextFieldActionPerformed(evt);
            }
        });

        
         AddSampleButt.setBackground(new java.awt.Color(80, 80, 80));
        AddSampleButt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddSampleButt.setText("Add+");
        AddSampleButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSampleButtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 222, 222));
      
        jLabel1.setText("S");

        SampleTextField2.setBackground(new java.awt.Color(220, 220, 220));
        SampleTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SampleTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
                
                   jLabel2.setForeground(new java.awt.Color(222, 222, 222));
        jLabel2.setText("S2");

        javax.swing.GroupLayout SamplePanel1Layout = new javax.swing.GroupLayout(SamplePanel1);
        SamplePanel1.setLayout(SamplePanel1Layout);
        
      SamplePanel1.setVisible(false);

        SamplePanel1.setBackground(Color.black);
        SamplePanel1Layout.setHorizontalGroup(
            SamplePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SamplePanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(SampleTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        SamplePanel1Layout.setVerticalGroup(
            SamplePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SamplePanel1Layout.createSequentialGroup()
                .addGroup(SamplePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SampleTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13))
        );
       
        SampleTextField3.setBackground(new java.awt.Color(220, 220, 220));
        SampleTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SampleTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(222, 222, 222));
           
        jLabel4.setText("S4");

        javax.swing.GroupLayout SamplePanel3Layout = new javax.swing.GroupLayout(SamplePanel3);
        SamplePanel3.setLayout(SamplePanel3Layout);
        
      //  SamplePanel1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      SamplePanel3.setVisible(false);

        SamplePanel3.setBackground(Color.black);
        SamplePanel3Layout.setHorizontalGroup(
            SamplePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SamplePanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(SampleTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        SamplePanel3Layout.setVerticalGroup(
            SamplePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SamplePanel3Layout.createSequentialGroup()
                .addGroup(SamplePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SampleTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        

        SampleTextField5.setBackground(new java.awt.Color(220, 220, 220));
        SampleTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SampleTextField5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                  jLabel3.setForeground(new java.awt.Color(222, 222, 222));

        jLabel3.setText("S3");

        javax.swing.GroupLayout SamplePanel2Layout = new javax.swing.GroupLayout(SamplePanel2);
        SamplePanel2.setLayout(SamplePanel2Layout);
        
       // SamplePanel1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      SamplePanel2.setVisible(false);

        SamplePanel2.setBackground(Color.black);
        SamplePanel2Layout.setHorizontalGroup(
            SamplePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SamplePanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(SampleTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SamplePanel2Layout.setVerticalGroup(
            SamplePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SamplePanel2Layout.createSequentialGroup()
                .addGroup(SamplePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SampleTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        
        EventButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        EventButton3.setText(">");
        EventButton3.setBackground(new java.awt.Color(80, 80, 80));
        EventButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton3ActionPerformed(evt);
            }
        });

        EventButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton2.setText("<");
        EventButton2.setBackground(new java.awt.Color(80, 80, 80));
        EventButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton2ActionPerformed(evt);
            }
        });

        EventButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton1.setText("*");
        EventButton1.setBackground(new java.awt.Color(80, 80, 80));
        EventButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel6.setForeground(Color.white);

        jLabel6.setText("A");


        EventButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton5.setText(",");
        EventButton5.setBackground(new java.awt.Color(80, 80, 80));
        EventButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton5ActionPerformed(evt);
            }
        });



        AddEventButt.setBackground(new java.awt.Color(80, 80, 80));
        AddEventButt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddEventButt.setText("Add +");
        AddEventButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEventButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EventPanel1Layout = new javax.swing.GroupLayout(EventPanel1);
        EventPanel1.setLayout(EventPanel1Layout);
        EventPanel1.setBackground(Color.black);
        
            EventTextField.setBackground(new java.awt.Color(220, 220, 220));
        EventTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventTextField1ActionPerformed(evt);
            }
        });
        
        EventPanel1Layout.setHorizontalGroup(
            EventPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel1Layout.createSequentialGroup()
                .addGroup(EventPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddEventButt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EventPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(EventButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       // .addComponent(EventButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        //.addComponent(EventButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        EventPanel1Layout.setVerticalGroup(
            EventPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EventTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(AddEventButt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(EventPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                  //  .addComponent(EventButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(EventButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                   // .addComponent(EventButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              //  .addContainerGap(20, Short.MAX_VALUE))
        );

        EventTextField1.setBackground(new java.awt.Color(220, 220, 220));
        EventTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventTextField1ActionPerformed(evt);
            }
        });
        
        

        EventButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        EventButton7.setText(">");
        EventButton7.setBackground(new java.awt.Color(80, 80, 80));
        EventButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton7ActionPerformed(evt);
            }
        });

        EventButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton8.setText("<");
        EventButton8.setBackground(new java.awt.Color(80, 80, 80));
        EventButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton8ActionPerformed(evt);
            }
        });

        EventButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton9.setText("*");
        EventButton9.setBackground(new java.awt.Color(80, 80, 80));
        EventButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton9ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel7.setForeground(Color.white);

        jLabel7.setText("B");



        EventButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton11.setText(",");
        EventButton11.setBackground(new java.awt.Color(80, 80, 80));
        EventButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton11ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout EventPanel2Layout = new javax.swing.GroupLayout(EventPanel2);
        EventPanel2.setLayout(EventPanel2Layout);
        EventPanel2.setVisible(false);
        EventPanel2.setBackground(Color.black);
        EventPanel2Layout.setHorizontalGroup(
            EventPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel2Layout.createSequentialGroup()
                .addGroup(EventPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EventPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(EventButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                   
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPanel2Layout.setVerticalGroup(
            EventPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EventTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addGroup(EventPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                  
                    .addComponent(EventButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
               
        );

        EventTextField2.setBackground(new java.awt.Color(220, 220, 220));
        EventTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventTextField2ActionPerformed(evt);
            }
        });

        EventButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton13.setText(">");
        EventButton13.setBackground(new java.awt.Color(80, 80, 80));
        EventButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton13ActionPerformed(evt);
            }
        });

        EventButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton14.setText("<");
        EventButton14.setBackground(new java.awt.Color(80, 80, 80));
        EventButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton14ActionPerformed(evt);
            }
        });

        EventButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton15.setText("*");
        EventButton15.setBackground(new java.awt.Color(80, 80, 80));
        EventButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton15ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel8.setForeground(Color.white);

        jLabel8.setText("C");


        EventButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton17.setText(",");
        EventButton17.setBackground(new java.awt.Color(80, 80, 80));
        EventButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton17ActionPerformed(evt);
            }
        });



        javax.swing.GroupLayout EventPanel3Layout = new javax.swing.GroupLayout(EventPanel3);
        EventPanel3.setLayout(EventPanel3Layout);
        EventPanel3.setVisible(false);
        EventPanel3.setBackground(Color.black);
        EventPanel3Layout.setHorizontalGroup(
            EventPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel3Layout.createSequentialGroup()
                .addGroup(EventPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EventPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(EventButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                      //  .addComponent(EventButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                       // .addComponent(EventButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EventPanel3Layout.setVerticalGroup(
            EventPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EventTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(EventPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                   // .addComponent(EventButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(EventButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                 //   .addComponent(EventButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        EventTextField3.setBackground(new java.awt.Color(220, 220, 220));
        EventTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventTextField3ActionPerformed(evt);
            }
        });
        EventButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton19.setText(">");
        EventButton19.setBackground(new java.awt.Color(80, 80, 80));
        EventButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton19ActionPerformed(evt);
            }
        });

        EventButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton20.setText("<");
        EventButton20.setBackground(new java.awt.Color(80, 80, 80));
        EventButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton20ActionPerformed(evt);
            }
        });

        EventButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton21.setText("*");
        EventButton21.setBackground(new java.awt.Color(80, 80, 80));
        EventButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton21ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(222, 222, 222));

        jLabel9.setText("C");

//        EventButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
//        EventButton22.setText("fff");
//        EventButton22.setBackground(new java.awt.Color(255, 255, 255));
//        EventButton22.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                EventButton22ActionPerformed(evt);
//            }
//        });

        EventButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EventButton23.setText(",");
        EventButton23.setBackground(new java.awt.Color(80, 80, 80));
        EventButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventButton23ActionPerformed(evt);
            }
        });

//        EventButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
//        EventButton24.setText("&");
//        EventButton24.setBackground(new java.awt.Color(80, 80, 80));
//        EventButton24.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                EventButton24ActionPerformed(evt);
//            }
//        });

        javax.swing.GroupLayout EventPanel4Layout = new javax.swing.GroupLayout(EventPanel4);
        EventPanel4.setLayout(EventPanel4Layout);
        EventPanel4.setVisible(false);
        EventPanel4.setBackground(Color.black);
        EventPanel4Layout.setHorizontalGroup(
            EventPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel4Layout.createSequentialGroup()
                .addGroup(EventPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EventPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EventPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(EventButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EventButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    //    .addComponent(EventButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                       // .addComponent(EventButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        EventPanel4Layout.setVerticalGroup(
            EventPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EventPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EventTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(EventPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                   // .addComponent(EventButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(EventButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                   // .addComponent(EventButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        NextButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NextButton1.setText("Next");
        NextButton1.setBackground(new java.awt.Color(80, 80, 80));
        NextButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButton1ActionPerformed(evt);
            }
        });

        HelpButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HelpButton2.setText("Help");
        HelpButton2.setBackground(new java.awt.Color(80, 80, 80));
        HelpButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButton2ActionPerformed(evt);
            }
        });

        FormulaTextField.setEditable(false);
        
        FormulaTextField.setBackground(new java.awt.Color(220, 220, 220));
        FormulaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(222, 222, 222));
        jLabel10.setText("F");

        FormulaComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));
        
        FormulaComboBox2.setBackground(new java.awt.Color(80, 80, 80));
        FormulaComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaComboBox2ActionPerformed(evt);
            }
        });

        FormulaButton.setText("P");
        FormulaButton.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButtonActionPerformed(evt);
            }
        });

        Formulautton7.setText(",");
        
        Formulautton7.setBackground(new java.awt.Color(80, 80, 80));
        Formulautton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Formulautton7ActionPerformed(evt);
            }
        });

        FormulaButton2.setText("(");
        
        FormulaButton2.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton2ActionPerformed(evt);
            }
        });

        FormulaButton1.setText(")");
        
        FormulaButton1.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton1ActionPerformed(evt);
            }
        });

        formulaButton3.setText("+");
        
        formulaButton3.setBackground(new java.awt.Color(80, 80, 80));
        formulaButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formulaButton3ActionPerformed(evt);
            }
        });

        FormulaButton8.setText("-");
        
        FormulaButton8.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton8ActionPerformed(evt);
            }
        });

        FormulaButton10.setText("∩");
        
        FormulaButton10.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton10ActionPerformed(evt);
            }
        });

        FormulaButton6.setText("}");
        
        FormulaButton6.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton6ActionPerformed(evt);
            }
        });

        FormulaButton9.setText("∪");
        
        FormulaButton9.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton9ActionPerformed(evt);
            }
        });

        FormulaButton5.setText("{");
        
        FormulaButton5.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton5ActionPerformed(evt);
            }
        });

        FormulaButton11.setText("Delete");
        
        FormulaButton11.setBackground(new java.awt.Color(80, 80, 80));
        FormulaButton11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        FormulaButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormulaButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(SampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddSampleButt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FormulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(FormulaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Formulautton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FormulaButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(FormulaButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(FormulaButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FormulaButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FormulaButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FormulaButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(formulaButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(FormulaComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(FormulaButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FormulaButton11))))))
                            .addComponent(SamplePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SamplePanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SamplePanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EventPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(HelpButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(EventPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddSampleButt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SampleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(SamplePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(SamplePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EventPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EventPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SamplePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FormulaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FormulaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Formulautton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formulaButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FormulaButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormulaButton11))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HelpButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
    }                      

    private void SampleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void FormulaButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               

        FormulaOutput = FormulaTextField.getText() + ")";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

        // TODO add your handling code here:
    }                                              

    private void AddEventButtActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        
                  clicked2++;
  System.out.println(clicked2);
    if (clicked2 == 2){
        EventPanel2.setVisible(true);
  //  frame.pack() 
            pack();
            
    }
    else if (clicked2==3){
        EventPanel3.setVisible(true);
        pack();
    }
        
    else if (clicked2==4){
        EventPanel4.setVisible(true);
        pack();
    }
    }                                            

    private void AddSampleButtActionPerformed(java.awt.event.ActionEvent evt) {                                              

        
             clicked++;
  System.out.println(clicked);
    if (clicked == 2){
        SamplePanel1.setVisible(true);
       pack();
    }
    else if (clicked==3){
        SamplePanel2.setVisible(true);
        pack();
    }
        
    else if (clicked==4){
        SamplePanel3.setVisible(true);
        pack();
    }
       









    }                                             

    private void FormulaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

        FormulaOutput = FormulaTextField.getText() + "p";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

    }                                             

    private void FormulaButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               

        FormulaOutput = FormulaTextField.getText() + "(";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

    }                                              

    private void formulaButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               

        FormulaOutput = FormulaTextField.getText() + "+";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

    }                                              

    private void FormulaButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                               

        FormulaOutput = FormulaTextField.getText() + "-";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

    }                                              

    private void FormulaButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        
        if   (FormulaOutput.length() > 0) {
        
        FormulaOutput = FormulaOutput.substring(0, FormulaOutput.length() - 1);
        FormulaTextField.setText(FormulaOutput);
         System.out.println("Last Element Removed.");
    }
        



    }                                               

    private void FormulaButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                               

        FormulaOutput = FormulaTextField.getText() + "∪";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

    }                                              

    private void FormulaButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                                

        FormulaOutput = FormulaTextField.getText() + "∩";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

    }                                               

    private void Formulautton7ActionPerformed(java.awt.event.ActionEvent evt) {                                              

        FormulaOutput = FormulaTextField.getText() + ",";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);


    }                                             

    private void FormulaButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                               

        FormulaOutput = FormulaTextField.getText() + "}";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);


    }                                              

    private void FormulaButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                               

        FormulaOutput = FormulaTextField.getText() + "{";
        System.out.println(FormulaOutput);
        FormulaTextField.setText(FormulaOutput);

    }                                              

    private void SampleTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void SampleTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void SampleTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void EventButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        EventOutputA = EventTextField.getText() + ",";
        System.out.println(EventOutputA);
        EventTextField.setText(EventOutputA);


    }                                            

    private void EventButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        EventOutputA = EventTextField.getText() + "*";
        System.out.println(EventOutputA);
        EventTextField.setText(EventOutputA);

    }                                            

    private void EventButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        EventOutputA = EventTextField.getText() + "<";
        System.out.println(EventOutputA);
        EventTextField.setText(EventOutputA);

    }                                            

    private void EventButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        EventOutputA = EventTextField.getText() + ">";
        System.out.println(EventOutputA);
        EventTextField.setText(EventOutputA);


    }                                            
                                          

    private void EventButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                              

        EventOutputB = EventTextField1.getText() + ",";
        System.out.println(EventOutputB);
        EventTextField1.setText(EventOutputB);
       
    }                                             

    private void EventButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        EventOutputB = EventTextField1.getText() + "*";
        System.out.println(EventOutputB);
        EventTextField1.setText(EventOutputB);
        
    }                                            

    private void EventButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        EventOutputB = EventTextField1.getText() + "<";
        System.out.println(EventOutputB);
        EventTextField1.setText(EventOutputB);

    }                                            

    private void EventButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                             

        EventOutputB = EventTextField1.getText() + ">";
        System.out.println(EventOutputB);
        EventTextField1.setText(EventOutputB);
  
    }                                            

                                           

    private void EventButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                              

        EventOutputC = EventTextField2.getText() + ",";
        System.out.println(EventOutputC);
        EventTextField2.setText(EventOutputC);


    }                                             

    private void EventButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                              

        EventOutputC = EventTextField2.getText() + "*";
        System.out.println(EventOutputC);
        EventTextField2.setText(EventOutputC);


    }                                             

    private void EventButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                              

        EventOutputC = EventTextField2.getText() + "<";
        System.out.println(EventOutputC);
        EventTextField2.setText(EventOutputC);
        
    }                                             

    private void EventButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        EventOutputC = EventTextField2.getText() + "> ";
        System.out.println(EventOutputC);
        EventTextField2.setText(EventOutputC);

    }                                             

                                 

    private void EventButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        EventOutputD = EventTextField3.getText() + ",";
        System.out.println(EventOutputD);
        EventTextField3.setText(EventOutputD);
    }                                             

    private void EventButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                              

        EventOutputD = EventTextField3.getText() + "*";
        System.out.println(EventOutputD);
        EventTextField3.setText(EventOutputD);

    }                                             

    private void EventButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                              

        EventOutputD = EventTextField3.getText() + "<";
        System.out.println(EventOutputD);
        EventTextField3.setText(EventOutputD);
// TODO add your handling code here:
    }                                             

    private void EventButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        EventOutputD = EventTextField3.getText() + " > ";
        System.out.println(EventOutputD);
        EventTextField3.setText(EventOutputD);


    }                                             

                                            

    private void EventTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void EventTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void EventTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void NextButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
        
        
        String newline = System.getProperty("line.separator");
        String message = "*Please add your Sample Space "+ newline+" *Please add your Event"+ newline+" *Please add your Formula";
        if (SampleTextField.getText().isEmpty() && FormulaTextField.getText().isEmpty() && EventTextField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(new JFrame(), message, "Erorrs", JOptionPane.ERROR_MESSAGE);
          //  JOptionPane.showMessageDialog(new JFrame(), "Please add your sample space  ", "Erorrs", JOptionPane.ERROR_MESSAGE);
            
            
            
            

        } 
        
        else if (SampleTextField.getText().isEmpty()){
        
        
            JOptionPane.showMessageDialog(new JFrame(), "*Please add your Sample Space", "Erorrs", JOptionPane.ERROR_MESSAGE);
        }
        
             else if (EventTextField.getText().isEmpty()){
        
        
            JOptionPane.showMessageDialog(new JFrame(), "*Please add your Event", "Erorrs", JOptionPane.ERROR_MESSAGE);
        }
             
                  else if (FormulaTextField.getText().isEmpty()){
        
        
            JOptionPane.showMessageDialog(new JFrame(), "*Please add your Formula", "Erorrs", JOptionPane.ERROR_MESSAGE);
        }
        
        
        else if (!SampleTextField.getText().isEmpty() && !FormulaTextField.getText().isEmpty() && !EventTextField.getText().isEmpty()) {
      // new DEMO();
         new   ResultPro(id).setVisible(true);
       //  new InputPro().setVisible(false);
         //id++;
         setVisible(false);
           
          //  JOptionPane.showMessageDialog(new JFrame(), "Please add your sample space  ", "Erorrs", JOptionPane.ERROR_MESSAGE);
            

        } else {
             JOptionPane.showMessageDialog(new JFrame(), message, "Erorrs", JOptionPane.ERROR_MESSAGE);
     

        }
      
        
        String formula = FormulaTextField.getText();
        
        List<String> samples = new ArrayList();
        if (!SampleTextField.getText().isEmpty()){
        	samples.add(SampleTextField.getText());
        }
        if (!SampleTextField2.getText().isEmpty()){
        	samples.add(SampleTextField2.getText());
        }
        if (!SampleTextField5.getText().isEmpty()){
        	samples.add(SampleTextField5.getText());
        }
        if (!SampleTextField3.getText().isEmpty()){
        	samples.add(SampleTextField3.getText());
        }
        
        List<String> events = new ArrayList();
        if (!EventTextField.getText().isEmpty()){
        	events.add(EventTextField.getText());
        }
        if (!EventTextField1.getText().isEmpty()){
        	events.add(EventTextField1.getText());
        }
        if (!EventTextField2.getText().isEmpty()){
        	events.add(EventTextField2.getText());
        }
        if (!EventTextField3.getText().isEmpty()){
        	events.add(EventTextField3.getText());
        }
        
        Problem p = new Proplem(samples, events, formula);
        
        Controller.getInstance().setData(p.resultString);
        

    }                                           

    private void HelpButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void FormulaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void FormulaComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        {
        JComboBox comboBx = (JComboBox) evt.getSource();
        Object selected = FormulaComboBox2.getSelectedItem();
        if (selected.toString().equals("A")) {
            //jTextField3.setText("A");
            FormulaOutput = FormulaTextField.getText() + "A";
            System.out.println(FormulaOutput);
            FormulaTextField.setText(FormulaOutput);

        } else if (selected.toString().equals("B")) {
            //  jTextField3.setText("B"); 
            FormulaOutput = FormulaTextField.getText() + "B";
            System.out.println(FormulaOutput);
            FormulaTextField.setText(FormulaOutput);
        } else if (selected.toString().equals("C")) {
            // jTextField3.setText("C"); 
            FormulaOutput = FormulaTextField.getText() + "C";
            System.out.println(FormulaOutput);
            FormulaTextField.setText(FormulaOutput);
        } else if (selected.toString().equals("D")) {
            FormulaOutput = FormulaTextField.getText() + "D";
            System.out.println(FormulaOutput);
            FormulaTextField.setText(FormulaOutput);
            // jTextField3.setText("D"); 
        }

        getContentPane().add(comboBx);
        getContentPane().add(FormulaTextField);
    }

    }                                                

}