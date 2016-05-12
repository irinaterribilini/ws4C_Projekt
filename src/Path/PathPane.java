package Path;

import javafx.scene.layout.HBox;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.shape.Circle;

/**
 * @author Dieter Holz
 */
public class PathPane extends HBox {
	private Circle circleStart;

	public PathPane() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		circleStart = new Circle(250, 200, 30,
				new RadialGradient(0, 0, 0.2, 0.3, 1, true, CycleMethod.NO_CYCLE));

		circleStart.getStyleClass().addAll("playground", "pathPlayground");
	}

	private void layoutControls() {
		getChildren().addAll(circleStart);
	}
}
