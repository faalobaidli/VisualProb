
package frame;

import java.awt.*;

import static java.awt.Font.BOLD;

import javax.swing.*;

import vp.*;
import controller.Controller;
import no.geosoft.cc.geometry.Geometry;
import no.geosoft.cc.graphics.*;

public class DemoPro extends JFrame implements GInteraction {
    
    
    private GScene scene_;
    
    Problem p = Controller.getInstance().problem;
    

    public DemoPro() {
           setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
        getContentPane().setBackground(Color.black);
        setTitle("Probability");
    
        // Create the GUI
        JPanel topLevel = new JPanel();
        topLevel.setLayout(new BorderLayout());
        getContentPane().add(topLevel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JLabel("Button 1 to select color, button 2 to unselect"));

        JPanel graphicsPanel = new JPanel();
        topLevel.add(buttonPanel, BorderLayout.NORTH);

        // Create the graphic canvas
        GWindow window = new GWindow();
        topLevel.add(window.getCanvas(), BorderLayout.CENTER);

        // Create scene with default viewport and world extent settings
        scene_ = new GScene(window, "Scene");

        double w0[] = {0.0, 1200.0, 0.0};
        double w1[] = {1200.0, 1200.0, 0.0};
        double w2[] = {0.0, 0.0, 0.0};
        scene_.setWorldExtent(w0, w1, w2);
   //  scene_.setWorldExtent(BOLD, BOLD, BOLD, BOLD);
        GStyle style = new GStyle();
        // style.setForegroundColor (new Color (0, 0, 0));
        style.setForegroundColor(Color.black);
        style.setBackgroundColor(Color.red);
        // style.setBackgroundColor (new Color (255, 255, 255));
        style.setFont(null);
        scene_.setStyle(style);

        // Create som graphic objects
        GObject object1 = new TestObject("/", scene_, 550.0, 100.0);

        GObject object2 = new TestObject(p.samples.get(0).inputtokens.get(0), object1, 250.0, 250.0);
        GObject object3 = new TestObject(p.samples.get(0).inputtokens.get(1), object1, 500.0, 250.0);
        GObject object4 = new TestObject(p.samples.get(0).inputtokens.get(2), object1, 625.0, 250.0);

        GObject object5 = new TestObject("5", object2, 150.0, 400.0);
        GObject object6 = new TestObject("6", object2, 250.0, 400.0);
        GObject object7 = new TestObject("7", object2, 350.0, 400.0);

        GObject object8 = new TestObject("8", object4, 625.0, 400.0);

        GObject object9 = new TestObject("9", object7, 250.0, 550.0);
        GObject object10 = new TestObject("10", object7, 350.0, 550.0);
        GObject object11 = new TestObject("55", object7, 400.0, 550.0);

        GObject object12 = new TestObject("11", object8, 475.0, 550.0);
        GObject object13 = new TestObject("12", object8, 600.0, 550.0);

        pack();
        setSize(new Dimension(500, 500));
        setVisible(true);

        window.startInteraction(this);
    }

    public void event(GScene scene, int event, int x, int y) {
        if (event == GWindow.BUTTON1_UP
                || event == GWindow.BUTTON2_UP) {
            boolean isSelected = event == GWindow.BUTTON1_UP;

            GSegment selectedSegment = scene_.findSegment(x, y);
            if (selectedSegment == null) {
                return;
            }

            GStyle style = selectedSegment.getOwner().getStyle();
            if (style == null) {
                return;
            }

            if (isSelected) {
                style.setBackgroundColor(new Color((float) Math.random(),
                        (float) Math.random(),
                        (float) Math.random()));
            } else {
                style.unsetBackgroundColor();
            }

            scene_.refresh();
        }
    }

    private class TestObject extends GObject {

        private TestObject parent_;
        private double x_, y_;
        private GSegment circle_;
        private GSegment line_;

        TestObject(String name, GObject parent, double x, double y) {
            parent_ = parent instanceof TestObject ? (TestObject) parent : null;

            x_ = x;
            y_ = y;

            line_ = new GSegment();
            addSegment(line_);

            circle_ = new GSegment();
            addSegment(circle_);

            circle_.setText(new GText(name, GPosition.MIDDLE));

            setStyle(new GStyle());

            parent.add(this);
        }

        double getX() {
            return x_;
        }

        double getY() {
            return y_;
        }

        public void draw() {
            if (parent_ != null) {
                line_.setGeometry(parent_.getX(), parent_.getY(), x_, y_);
            }

            circle_.setGeometryXy(Geometry.createCircle(x_, y_, 50.0));
        }
    }

}
