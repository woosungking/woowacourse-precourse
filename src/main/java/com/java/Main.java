package com.java;

import com.java.controller.CalculatorController;
import com.java.config.ServiceFactory;
import com.java.service.calculator.CalculatorFacade;
import com.java.service.io.input.InputValueServiceImpl;
import com.java.view.InputView;
import com.java.view.OutputView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 팩토리 메서드를 사용하여 객체 생성
        InputValueServiceImpl inputValueService = ServiceFactory.createInputValueService();
        InputView inputView = ServiceFactory.createInputView(inputValueService);
        OutputView outputView = ServiceFactory.createOutputView(ServiceFactory.createOutputValueService(ServiceFactory.createOutputValueRepository()));
        CalculatorFacade calculatorFacade = ServiceFactory.createCalculatorFacade(
                ServiceFactory.createDelimiterFacade(ServiceFactory.createDelimiterService(ServiceFactory.createDelimiterList())),
                ServiceFactory.createCalculatorService(),
                ServiceFactory.createOutputValueService(ServiceFactory.createOutputValueRepository()),
                ServiceFactory.createOperandFacade(ServiceFactory.createOperandService(ServiceFactory.createOperandRepository()))
        );

        CalculatorController calculatorController = new CalculatorController(inputView, outputView, calculatorFacade);
        calculatorController.calculator();
    }
}
