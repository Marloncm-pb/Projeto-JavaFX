package com.aula.projetojavafx.gui.util;

import javafx.scene.control.*;
public class Alerts {

    public static void showAlert(String title, String header, String content, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();

    }
}
