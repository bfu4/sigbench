module net.platinumdigitalgroup.sigbench {
	requires javafx.fxml;
	requires javafx.application;
	requires javafx.scene;

	opens net.platinumdigitalgroup.sigbench to javafx.graphics;

	exports net.platinumdigitalgroup.sigbench;
}
