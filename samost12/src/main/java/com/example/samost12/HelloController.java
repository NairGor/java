package com.example.samost12;



import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    private ObservableList<MassiveNumbers> usersData = FXCollections.observableArrayList();
    @FXML
    private Label maxZ;
    @FXML
    private Label minZ;
    @FXML
    private TableView arr;
    @FXML
    private TableColumn<MassiveNumbers, Integer> c1;
    @FXML
    private TableColumn<MassiveNumbers, Integer> c2;
    @FXML
    private TableColumn<MassiveNumbers, Integer> c3;
    @FXML
    private TableColumn<MassiveNumbers, Integer> c4;
    @FXML
    private TableColumn<MassiveNumbers, Integer> c5;

    @FXML
    private void initialize() {
        c1.setCellValueFactory(new PropertyValueFactory<MassiveNumbers, Integer>("C1"));
        c2.setCellValueFactory(new PropertyValueFactory<MassiveNumbers, Integer>("C2"));
        c3.setCellValueFactory(new PropertyValueFactory<MassiveNumbers, Integer>("C3"));
        c4.setCellValueFactory(new PropertyValueFactory<MassiveNumbers, Integer>("C4"));
        c5.setCellValueFactory(new PropertyValueFactory<MassiveNumbers, Integer>("C5"));
        arr.setItems(usersData);
    }

    int[][] list = new int[5][5];

    @FXML
    protected void onNumbersButtonClick() {
        for (int i = 0; i < arr.getItems().size(); i++) {
            arr.getItems().clear();
        }
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                list[i][j] = (int) Math.round((Math.random() * 30) - 15);

        usersData.add(new MassiveNumbers(list[0][0], list[0][1], list[0][2], list[0][3], list[0][4]));
        usersData.add(new MassiveNumbers(list[1][0], list[1][1], list[1][2], list[1][3], list[1][4]));
        usersData.add(new MassiveNumbers(list[2][0], list[2][1], list[2][2], list[2][3], list[2][4]));
        usersData.add(new MassiveNumbers(list[3][0], list[3][1], list[3][2], list[3][3], list[3][4]));
        usersData.add(new MassiveNumbers(list[4][0], list[4][1], list[4][2], list[4][3], list[4][4]));
    }

    @FXML
    protected void onAnswerButtonClick() {
        try {
            int max1 = 0;
            int min1 = 0;
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[i].length; j++) {
                    if (list[i][j] >= max1) max1 = list[i][j];
                    if (list[i][j] <= min1) min1 = list[i][j];
                }
            }

            minZ.setText("Минимальное значение: " + String.valueOf(min1));
            maxZ.setText("Максимальное значение: " + String.valueOf(max1));


            for (int i = 0; i < arr.getItems().size(); i++) {
                arr.getItems().clear();
            }
            if (Math.abs(max1 / min1) >= 10) {
                for (int i = 0; i < list.length; i++) {
                    for (int j = 0; j < list[i].length; j++) {
                        if (list[i][j] == 0) list[i][j] = 1;
                        if (list[i][j] < 0) list[i][j] = list[i][j] * (-1);
                    }
                }
            }
            usersData.add(new MassiveNumbers(list[0][0], list[0][1], list[0][2], list[0][3], list[0][4]));
            usersData.add(new MassiveNumbers(list[1][0], list[1][1], list[1][2], list[1][3], list[1][4]));
            usersData.add(new MassiveNumbers(list[2][0], list[2][1], list[2][2], list[2][3], list[2][4]));
            usersData.add(new MassiveNumbers(list[3][0], list[3][1], list[3][2], list[3][3], list[3][4]));
            usersData.add(new MassiveNumbers(list[4][0], list[4][1], list[4][2], list[4][3], list[4][4]));
        } catch (Throwable t) {
            minZ.setText("Сначала заполните таблицу!");
            maxZ.setText("");
        }
    }
}