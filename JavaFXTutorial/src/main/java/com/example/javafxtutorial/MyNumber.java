package com.example.javafxtutorial;
import javafx.beans.property.*;

public class MyNumber {
    private DoubleProperty number = new SimpleDoubleProperty();

//    Ham getter
    public double getNumber() {
        return number.get();
    }

    public DoubleProperty numberProperty() {
        return number;
    }

//    Ham setter
    public void setNumber(double number) {
        this.number.set(number);
    }
}
