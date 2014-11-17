package frame;

import java.util.ArrayList;
import java.util.List;

import vp.*;

public class Controller {
	
	static List<String> stringList =  new ArrayList();

	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		StartPro start = new StartPro();
		stringList = start.initComponents();
        System.out.println("######");

        //System.out.println(stringList.get(0));

        Main main = new Main();
        main.main(null);
        System.out.println("######");

	}

}
