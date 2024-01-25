package com.aula.projetojavafx.gui;

import com.aula.projetojavafx.Main;
import com.aula.projetojavafx.model.entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {

    @FXML
    private TableView<Department> tableViewDepartment;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;
    @FXML
    private TableColumn<Department, String> tableColumnName;
    @FXML
    private Button btNew;
    @FXML
    private Button btEdit;

    @FXML
    public void onBtNewAction() {
        System.out.println("onBtNewAction");
    }

    @FXML
    public void onBtEditAction() {
        System.out.println("onBtEditAction");
    }






        @Override
        public void initialize(URL location, ResourceBundle resources) {
            initializeNodes();
        }

    private void initializeNodes() {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        Stage stage = (Stage) Main.getMainScene().getWindow();
        tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
    }


}
