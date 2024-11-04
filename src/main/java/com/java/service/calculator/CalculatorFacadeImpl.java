package com.java.service.calculator;

import com.java.service.calculator.calculate.CalculatorService;
import com.java.service.calculator.delimiter.DelimiterService;
import com.java.service.calculator.validator.Validator;
import com.java.service.calculator.valueextractor.ValueExtractService;

public class CalculatorFacadeImpl implements CalculatorFacade {
    private final DelimiterService delimiterService;
    private final ValueExtractService valueExtractService;
    private final CalculatorService calculatorService;

    public CalculatorFacadeImpl(DelimiterService delimiterService, ValueExtractService valueExtractService, CalculatorService calculatorService) {
        this.delimiterService = delimiterService;
        this.valueExtractService = valueExtractService;
        this.calculatorService = calculatorService;
    }

    @Override
    public void calculate(String value) {
        Validator.startValidate(value);
        delimiterService.extractCustomDelimiter(value);
        valueExtractService.extractValue(value);
        calculatorService.addValue();

    }
}
