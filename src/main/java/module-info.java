module sigbench {

	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.media;

	opens net.platinumdigitalgroup.sigbench to javafx.fxml;

	exports net.platinumdigitalgroup.sigbench;
}
