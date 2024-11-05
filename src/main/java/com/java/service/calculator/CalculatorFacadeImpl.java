package com.java.service.calculator;

import com.java.repository.delimiter.Delimiter;
import com.java.repository.operand.Operand;
import com.java.repository.output.OutputValue;
import com.java.service.calculator.calculate.CalculatorService;
import com.java.service.calculator.delimiter.DelimiterFacade;
import com.java.service.calculator.delimiter.DelimiterFacadeImpl;
import com.java.service.calculator.delimiter.DelimiterService;
import com.java.service.calculator.validator.Validator;
import com.java.service.calculator.operand.OperandService;
import com.java.service.io.output.OutputValueService;
import com.java.view.OutputView;

import java.util.List;

public class CalculatorFacadeImpl implements CalculatorFacade {
    private final OperandService operandService;
    private final CalculatorService calculatorService;
    private final OutputValueService outputValueService;
    private final OutputView outputView;

    private final DelimiterFacade delimiterFacade;

    public CalculatorFacadeImpl( DelimiterFacade delimiterFacade, OperandService operandService, CalculatorService calculatorService, OutputValueService outputValueService, OutputView outputView) {
        this.operandService = operandService;
        this.calculatorService = calculatorService;
        this.outputValueService = outputValueService;
        this.outputView = outputView;
        this.delimiterFacade = delimiterFacade;
    }

    @Override
    public void calculate(String value) {
        Validator.startValidate(value);
        String regex = delimiterFacade.generateRegexFromValue(value);

        List<Operand> operandList = operandService.extractOperand(value,regex);
        operandService.saveOperandList(operandList);

        Integer result = calculatorService.addOperandListValue(operandList);
        OutputValue value1 = outputValueService.saveOutputValue(new OutputValue(result));

        outputView.stringCalculatorResultView(value1);


    }
}
