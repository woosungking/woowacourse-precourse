package com.java.view;

import com.java.service.io.input.InputValueService;

import java.io.IOException;

public class InputView {
    private final InputValueService inputValueService;

    public InputView(InputValueService inputValueService) {
        this.inputValueService = inputValueService;
    }

    public String stringCalculatorView() throws IOException {
        System.out.println(InputMessage.ENTER_VALUE.getMessage());
        return inputValueService.readInput();
    }
}
