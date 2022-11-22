package hu.petrik.peoplerestclientjavafx;

import javafx.scene.control.Alert;

public abstract class Controller {

    protected void error(String headerText){
        error(headerText, "");
    }
    protected void error(String headerText, String contentText){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    protected void warning(String headerText) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
}
