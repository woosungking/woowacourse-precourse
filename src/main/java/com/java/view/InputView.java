package com.java.view;

import com.java.service.io.InputValueHandler;

import java.io.IOException;

public class InputView {
    private final InputValueHandler inputValueHandler;

    public InputView(InputValueHandler inputValueHandler) {
        this.inputValueHandler = inputValueHandler;
    }

    public String getStringCalculatorView() throws IOException {
        System.out.println(InputMessage.ENTER_VALUE.getMessage());
        return inputValueHandler.readInput();
    }
}
