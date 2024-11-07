package com.java.controller;

import com.java.repository.operand.Operand;
import com.java.repository.output.OutputValue;
import com.java.service.calculator.CalculatorFacade;
import com.java.view.InputView;
import com.java.view.OutputView;

import java.io.IOException;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    private final CalculatorFacade calculatorFacade;

    public CalculatorController(InputView inputView, OutputView outputView, CalculatorFacade calculatorFacade) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.calculatorFacade = calculatorFacade;
    }
    public void calculator() throws IOException {
        String value=inputView.stringCalculatorView();
        OutputValue result = calculatorFacade.calculate(value);
        outputView.stringCalculatorResultView(result);

    }
}
