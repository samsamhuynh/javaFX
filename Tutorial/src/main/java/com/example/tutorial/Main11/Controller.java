package com.example.tutorial.Main11;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TreeView<String> treeView;

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        TreeItem<String> root = new TreeItem<>();
        TreeItem<String> JavaFXTutorial = new TreeItem<>("JavaFXTutorial");
        TreeItem<String> sample = new TreeItem<>("sample");
        TreeItem<String> Main10 = new TreeItem<>("Main10");

        sample.getChildren().add(Main10);
        JavaFXTutorial.getChildren().add(sample);
        root.getChildren().add(JavaFXTutorial);
        root.setExpanded(true);
        sample.setExpanded(true);

        treeView.setRoot(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) ->
                System.out.println(newValue.intValue()));
    }
}
