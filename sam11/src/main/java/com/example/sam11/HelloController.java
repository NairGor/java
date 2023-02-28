package com.example.sam11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label X;
    @FXML
    private Label A;
    @FXML
    private Label B;
    @FXML
    private Label Answer;
    @FXML
    private Label labelError;
    @FXML
    private Rectangle recError;
    @FXML
    private TextField Xfield;
    @FXML
    private TextField Afield;
    @FXML
    private TextField Bfield;
    @FXML
    private TextField AnswerField;
    @FXML
    private Button btnAnswer;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnClear;

    @FXML
    protected void onAnswerButtonClick() {
        if(Xfield.getText().equals("") || Afield.getText().equals("") || Bfield.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Поля пустые! Введите что-нибудь!", ButtonType.OK);
            alert.showAndWait();
}
            try {
                double X = Double.parseDouble(Xfield.getText());
                double A = Double.parseDouble(Afield.getText());
                double B = Double.parseDouble(Bfield.getText());
                double ans = 0;
                if(X>7){
                    ans = X*((A+B)*(A+B));
                    String s=Double.toString(ans);
                    AnswerField.setText(s);

                    labelError.setVisible(false);
                    recError.setVisible(false);
                }
                else{
                    if(A==0 && B==0){
                        AnswerField.setText("");
                        Xfield.setText("");
                        Afield.setText("");
                        Bfield.setText("");

                        labelError.setVisible(true);
                        recError.setVisible(true);
                    }
                    else{
                        ans = (X+4)/((A*A)+(B*B));
                        String s=Double.toString(ans);
                        AnswerField.setText(s);

                        labelError.setVisible(false);
                        recError.setVisible(false);
                    }
                }
        } catch (Throwable t) {

        }

    }
    @FXML
    protected void onClearButtonClick() {
        AnswerField.setText("");
        Xfield.setText("");
        Afield.setText("");
        Bfield.setText("");

        labelError.setVisible(false);
        recError.setVisible(false);
    }
    @FXML
    protected void onExitButtonClick(ActionEvent event) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}