package com.example.samost13;


import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private ObservableList<tableNumbers> userData = FXCollections.observableArrayList();
    @FXML
    private Button ansBTN;

    @FXML
    private Button clearBTN;

    @FXML
    private Button exitBTN;

    @FXML
    private Button fillArrBTN;

    @FXML
    private TableColumn<tableNumbers, Integer> kI;

    @FXML
    private TableView tableView;

    @FXML
    private TextField tfA;

    @FXML
    private TextField tfB;

    @FXML
    private TableColumn<tableNumbers, Integer> yI;

    @FXML
    void initialize() {
        kI.setCellValueFactory(new PropertyValueFactory<tableNumbers, Integer>("KI"));
        yI.setCellValueFactory(new PropertyValueFactory<tableNumbers, Integer>("YI"));
        tableView.setItems(userData);

        exitBTN.setOnAction(actionEvent -> {
            Stage stage = (Stage) exitBTN.getScene().getWindow();
            stage.close();

        });

        double[][] list = new double[10][2];
        fillArrBTN.setOnAction((actionEvent -> {
            for(int i = 0; i < tableView.getItems().size(); i++) {
                tableView.getItems().clear();
            }
            for (int i = 0; i < 10; i++) {
                list[i][0] = (Math.random() * 100) + 0;
                list[i][0] = Math.ceil(list[i][0]*Math.pow(10, 3)) / Math.pow(10, 3);
            }



            for (int i=0; i<10; i++) {
                userData.add(new tableNumbers(list[i][0], 0.0));
            }



        }));

        clearBTN.setOnAction(actionEvent -> {
            for(int i = 0; i < tableView.getItems().size(); i++) {
                tableView.getItems().clear();
            }
            tfA.setText("");
            tfB.setText("");

        });

        ansBTN.setOnAction(actionEvent -> {
            if(tfA.getText().equals("") || tfB.getText().equals("")) {
                Alert alert = new Alert(Alert.AlertType.ERROR, "???????? ????????????! ?????????????? ??????-????????????!", ButtonType.OK);
                alert.showAndWait();
            } else {
                for(int i = 0; i < tableView.getItems().size(); i++) {
                    tableView.getItems().clear();
                }
//            userData.clear();
                try {
                    double a = Double.parseDouble(tfA.getText());
                    double b = Double.parseDouble(tfB.getText());
                    if(a==0 && b==0) {
                        Alert alert = new Alert(Alert.AlertType.ERROR, "A ?? B ???? ???????????? ???????????????????????? ?????????????????? ????????!", ButtonType.OK);
                        alert.showAndWait();
                    } else {
                        double y;
                        for (int i=0; i<10;i++) {
                            y = Math.sqrt((Math.cos(list[i][0])*Math.cos(list[i][0]))/(a*a+b*b-Math.sin(list[i][0])));
                            list[i][1] = Math.ceil(y * Math.pow(10, 3))/Math.pow(10, 3);
//                            System.out.println(list[i][0] + " " + list[i][1]);

                        }
                        for (int i=0; i<10; i++) {
                            userData.add(new tableNumbers(list[i][0], list[i][1]));
                        }
                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "?????????????? ???????????? ??????????!", ButtonType.OK);
                    alert.showAndWait();
                }


            }


        });
    }
}
