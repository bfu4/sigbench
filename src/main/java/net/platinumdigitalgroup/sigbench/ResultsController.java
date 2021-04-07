package net.platinumdigitalgroup.sigbench;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author InvokeStatic
 */
public class ResultsController implements Initializable {
    public Label pctLabel;
    public ListView<Label> resultList;

    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setResults(BenchmarkResult results) {
        double p = (double)results.score / 100;
        double marginalError = (1.96 * Math.sqrt((p * (1-p)) / results.signatures.size())) * 100;
        pctLabel.setText(results.score + "% \u00B1 " + Math.round(marginalError) + "% (" + results.matched + "/" + results.signatures.size() + ")");
        for(SignatureResult result : results.signatures) {
            if(result.matched) {
                Label lbl = new Label("" + String.format("0x%06X -> 0x%06X", result.sourcePosition, result.matchedPosition) + result.toString());
                lbl.setFont(Font.font("monospace"));
                resultList.getItems().add(lbl);
            }
        }
    }
}
