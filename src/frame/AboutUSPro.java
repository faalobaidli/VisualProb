
package frame;

import java.awt.Color;
import javax.swing.JLabel;


public class AboutUSPro extends javax.swing.JFrame {
    
    
    
    // Variables declaration                     
    private JLabel jLabel1;
    

    public AboutUSPro() {
        initComponents();
    }

  
                            
    private void initComponents() {

        jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("About US");
            getContentPane().setBackground(Color.black);

        jLabel1.setIcon(new javax.swing.ImageIcon("images/Untitl.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 346, Short.MAX_VALUE))
        );

        pack();
    }
 
               
}
