package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private TextField inputField;
    @FXML
    private Label resultLabel;

    public void hitungFaktorial() {
        int n = Integer.parseInt(inputField.getText());
        resultLabel.setText("Hasil Faktorial: " + faktorial(n));
    }

    public void hitungFibonacci() {
        int n = Integer.parseInt(inputField.getText());
        resultLabel.setText("Hasil Fibonacci: " + fibonacci(n));
    }

    public long faktorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * faktorial(n - 1);
    }

    public long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
