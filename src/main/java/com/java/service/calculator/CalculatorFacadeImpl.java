package com.java.service.calculator;

import com.java.repository.delimiter.Delimiter;
import com.java.repository.operand.Operand;
import com.java.repository.output.OutputValue;
import com.java.service.calculator.calculate.CalculatorService;
import com.java.service.calculator.delimiter.DelimiterFacade;
import com.java.service.calculator.delimiter.DelimiterFacadeImpl;
import com.java.service.calculator.delimiter.DelimiterService;
import com.java.service.calculator.operand.OperandFacade;
import com.java.service.calculator.validator.Validator;
import com.java.service.calculator.operand.OperandService;
import com.java.service.io.output.OutputValueService;
import com.java.view.OutputView;

import java.util.List;

public class CalculatorFacadeImpl implements CalculatorFacade {
    private final CalculatorService calculatorService;
    private final OutputValueService outputValueService;

    private final DelimiterFacade delimiterFacade;
    private final OperandFacade operandFacade;

    public CalculatorFacadeImpl(DelimiterFacade delimiterFacade, CalculatorService calculatorService, OutputValueService outputValueService, OperandFacade operandFacade) {
        this.calculatorService = calculatorService;
        this.outputValueService = outputValueService;
        this.delimiterFacade = delimiterFacade;
        this.operandFacade = operandFacade;
    }

    @Override
    public OutputValue calculate(String value) {
        Validator.startValidate(value);
        String regex = delimiterFacade.generateRegexFromValue(value);
        List<Operand> operandList = operandFacade.extractAndSaveOperand(regex, value);
        Integer result = calculatorService.addOperandListValue(operandList);
        return outputValueService.saveOutputValue(new OutputValue(result));
    }
}
