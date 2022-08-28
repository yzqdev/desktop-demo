package net.yzq.fxdemo;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Pair;

public class HelloController {
    @FXML
    public RadioButton rbPassword;
    @FXML
    public RadioButton rbVerifycode;

    @FXML
    public Label labelType;
    @FXML
    public HBox hbType;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private Parent createContent() {
        return new StackPane(new Text("Hello World"));
    }


}