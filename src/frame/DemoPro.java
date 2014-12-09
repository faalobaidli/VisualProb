package frame;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import vp.*;
import controller.Controller;
import no.geosoft.cc.geometry.Geometry;
import no.geosoft.cc.graphics.*;

/**
 * @author fahad
 * 
 *         This class represents the tree demonstration of the sample set.
 * 
 */
@SuppressWarnings("serial")
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
		buttonPanel.add(new JLabel(
				"Button 1 to select color, button 2 to unselect"));

		topLevel.add(buttonPanel, BorderLayout.NORTH);

		// Create the graphic canvas
		GWindow window = new GWindow();
		topLevel.add(window.getCanvas(), BorderLayout.CENTER);

		// Create scene with default viewport and world extent settings
		scene_ = new GScene(window, "Scene");

		double w0[] = { 0.0, 2300.0, 0.0 };
		double w1[] = { 2300.0, 2300.0, 0.0 };
		double w2[] = { 0.0, 0.0, 0.0 };

		scene_.setWorldExtent(w0, w1, w2);
		// scene_.setWorldExtent(BOLD, BOLD, BOLD, BOLD);
		GStyle style = new GStyle();
		// style.setForegroundColor (new Color (0, 0, 0));
		style.setForegroundColor(Color.black);
		style.setBackgroundColor(Color.green);
		// style.setBackgroundColor (new Color (255, 255, 255));
		style.setFont(null);
		scene_.setStyle(style);

		// specify root coordinates for later reference
		int rx = 1150;
		int ry = 100;
		// create root node
		GObject root = new TestObject("/", scene_, rx, ry);

		// create and link first level/sample to root
		List<GObject> nodeList = new ArrayList<GObject>();
		int space = (rx * 2) / (p.samples.get(0).inputtokens.size() + 1);
		int start = (p.samples.get(0).inputtokens.size() / 2);
		for (int i = 0; i < p.samples.get(0).inputtokens.size(); i++) {
			nodeList.add(new TestObject(p.samples.get(0).inputtokens.get(i),
					root, space * (-start + i) + rx, ry + 200));
			nodeList.get(nodeList.size() - 1)
					.getStyle()
					.setBackgroundColor(Color.cyan);

		}

		// create and link the rest to the root
		int pl1sti = 0;
		int plendi = nodeList.size();
		int x = nodeList.size();
		for (int l = 1; l < p.samples.size(); l++) {
			pl1sti = nodeList.size() - x;
			plendi = nodeList.size();
			space = (rx * 2)
					/ (p.samples.get(l - 1).inputtokens.size()
							* p.samples.get(l).inputtokens.size() + 1);
			start = (p.samples.get(l - 1).inputtokens.size()
					* p.samples.get(l).inputtokens.size() / 2);
			x = 0;
			for (int pl = pl1sti; pl < plendi; pl++) {
				for (int e = 0; e < p.samples.get(l).inputtokens.size(); e++) {

					nodeList.add(new TestObject(p.samples.get(l).inputtokens
							.get(e), nodeList.get(pl), (space/l) * (-start*l + x)
							+ rx, ry + 300 + (350 * l)));
					// nodeList.get(nodeList.size()-1).getStyle().setBackgroundColor(new
					// Color((float)1,(float) 0.5,(float)1));
					x++;
				}
			}

		}

		pack();
		setSize(new Dimension(1000, 1000));
		setVisible(true);

		window.startInteraction(this);
	}

	public void event(GScene scene, int event, int x, int y) {
		if (event == GWindow.BUTTON1_UP || event == GWindow.BUTTON2_UP) {
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
						(float) Math.random(), (float) Math.random()));
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
