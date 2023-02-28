package com.example.z13_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private ObservableList<tableStr> userData = FXCollections.observableArrayList();
    @FXML
    private Button addStrBtn;
    @FXML
    private Button editBtn;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn<tableStr, String> tbColumn;
    @FXML
    private TextArea textArea;
    @FXML
    void initialize() {
        tbColumn.setCellValueFactory(new PropertyValueFactory<tableStr, String>("STR"));
        tableView.setItems(userData);
        List<String> strList = new ArrayList();

        addStrBtn.setOnAction(actionEvent -> {
//            userData.add(new tableStr(""));
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Введите строку");
            dialog.setHeaderText("Введите слово/словосочетание");
            dialog.setContentText("Слово/словосочетание");
            dialog.showAndWait();
            if(!dialog.getEditor().getText().equals("")) {
                userData.add(new tableStr(dialog.getEditor().getText()));
                strList.add(dialog.getEditor().getText());
            }
        });

        editBtn.setOnAction(actionEvent -> {
            String text = textArea.getText();
            int k=0;

            while (text.indexOf('@')!=-1) {
                System.out.println(text.indexOf('@'));
                if(k==strList.size()) {
                    k=0;
                }
                text = text.replaceFirst("@",  strList.get(k));
                k++;
            }
            textArea.setText(text);
        });
    }
}
