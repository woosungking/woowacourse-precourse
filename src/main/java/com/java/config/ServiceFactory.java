package com.java.config;

import com.java.repository.delimiter.DelimiterList;
import com.java.repository.input.InputValueRepository;
import com.java.repository.operand.OperandList;
import com.java.repository.output.OutputValueList;
import com.java.service.calculator.CalculatorFacade;
import com.java.service.calculator.CalculatorFacadeImpl;
import com.java.service.calculator.calculate.CalculatorService;
import com.java.service.calculator.calculate.CalculatorServiceImpl;
import com.java.service.calculator.delimiter.DelimiterFacade;
import com.java.service.calculator.delimiter.DelimiterFacadeImpl;
import com.java.service.calculator.delimiter.DelimiterService;
import com.java.service.calculator.delimiter.DelimiterServiceImpl2;
import com.java.service.calculator.operand.OperandFacade;
import com.java.service.calculator.operand.OperandFacadeImpl;
import com.java.service.calculator.operand.OperandService;
import com.java.service.calculator.operand.OperandServiceImpl;
import com.java.service.io.input.InputValueServiceImpl;
import com.java.service.io.output.OutputValueService;
import com.java.service.io.output.OutputValueServiceImpl;
import com.java.view.InputView;
import com.java.view.OutputView;

public class ServiceFactory {

    public static InputValueServiceImpl createInputValueService() {
        return new InputValueServiceImpl(new InputValueRepository());
    }

    public static DelimiterList createDelimiterList() {
        return new DelimiterList();
    }

    public static DelimiterService createDelimiterService(DelimiterList delimiterList) {
        return new DelimiterServiceImpl2(delimiterList);
    }

    public static OperandList createOperandRepository() {
        return new OperandList();
    }

    public static OutputValueList createOutputValueRepository() {
        return new OutputValueList();
    }

    public static OperandService createOperandService(OperandList operandList) {
        return new OperandServiceImpl(operandList);
    }

    public static OutputValueService createOutputValueService(OutputValueList outputValueList) {
        return new OutputValueServiceImpl(outputValueList);
    }

    public static CalculatorService createCalculatorService() {
        return new CalculatorServiceImpl();
    }

    public static DelimiterFacade createDelimiterFacade(DelimiterService delimiterService) {
        return new DelimiterFacadeImpl(delimiterService);
    }

    public static OperandFacade createOperandFacade(OperandService operandService) {
        return new OperandFacadeImpl(operandService);
    }

    public static CalculatorFacade createCalculatorFacade(DelimiterFacade delimiterFacade, CalculatorService calculatorService, OutputValueService outputValueService, OperandFacade operandFacade) {
        return new CalculatorFacadeImpl(delimiterFacade, calculatorService, outputValueService, operandFacade);
    }

    public static InputView createInputView(InputValueServiceImpl inputValueHandler) {
        return new InputView(inputValueHandler);
    }

    public static OutputView createOutputView(OutputValueService outputValueService) {
        return new OutputView(outputValueService);
    }
}
