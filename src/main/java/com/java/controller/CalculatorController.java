package com.java.controller;

import com.java.io.InputValueHandler;
import com.java.service.splitor.Splitor;
import com.java.service.splitor.SplitorImpl;
import com.java.service.validator.Validator;

import java.io.IOException;
import java.util.Arrays;

public class CalculatorController {
    private final InputValueHandler inputValueHandler;
    private final Splitor splitor;

    public CalculatorController(InputValueHandler inputValueHandler, Splitor splitor) {
        this.inputValueHandler = inputValueHandler;
        this.splitor=splitor;
    }
    public void calculator() throws IOException {
        String value= inputValueHandler.readInput();
        Validator.startValidate(value);
        splitor.getCustomDelimiter(value);



    }
}
