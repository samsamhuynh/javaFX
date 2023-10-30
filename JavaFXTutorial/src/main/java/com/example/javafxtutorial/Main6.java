package com.example.javafxtutorial;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main6 {

    public static void main(String[] args) {
        MyNumber example = new MyNumber();
        example.numberProperty().addListener((observableValue, oldValue, newValue) -> {
            System.out.println(observableValue);
            System.out.println(oldValue);
            System.out.println(newValue);
        });
        example.setNumber(10);
        example.setNumber(11);

    }
}
