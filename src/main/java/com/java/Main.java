package com.java;

import com.java.controller.CalculatorController;
import com.java.service.io.InputValueHandlerImpl;
import com.java.repository.delimiter.DelimiterRepository;
import com.java.repository.input.InputValueRepository;
import com.java.repository.operand.OperandRepository;
import com.java.repository.output.OutputValueRepository;
import com.java.service.calculator.CalculatorFacade;
import com.java.service.calculator.CalculatorFacadeImpl;
import com.java.service.calculator.calculate.CalculatorService;
import com.java.service.calculator.calculate.CalculatorServiceImpl;
import com.java.service.calculator.delimiter.DelimiterService;
import com.java.service.calculator.delimiter.DelimiterServiceImpl2;
import com.java.service.calculator.operand.OperandService;
import com.java.service.calculator.operand.OperandServiceImpl;
import com.java.view.InputView;
import com.java.view.OutputView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputValueRepository inputValueRepository = new InputValueRepository();
        InputValueHandlerImpl inputValueHandler = new InputValueHandlerImpl(inputValueRepository);
        DelimiterRepository delimiterRepository = new DelimiterRepository();
        DelimiterService delimiterService = new DelimiterServiceImpl2(delimiterRepository);
        OperandRepository operandRepository = new OperandRepository();
        OutputValueRepository outputValueRepository = new OutputValueRepository();
        OperandService operandService = new OperandServiceImpl(operandRepository);
        CalculatorService calculatorService = new CalculatorServiceImpl(operandRepository, outputValueRepository);
        CalculatorFacade calculatorFacade = new CalculatorFacadeImpl(delimiterService, operandService, calculatorService);

        OutputView outputView = new OutputView(outputValueRepository);
        InputView inputView = new InputView(inputValueHandler);
        CalculatorController calculatorController = new CalculatorController(inputView,outputView,calculatorFacade);
        calculatorController.calculator();
    }
}