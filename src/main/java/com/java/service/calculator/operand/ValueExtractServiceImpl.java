package com.java.service.calculator.operand;

import com.java.repository.delimiter.DelimiterRepository;
import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;

public class ValueExtractServiceImpl implements ValueExtractService{
    private final DelimiterRepository delimiterRepository;
    private final OperandRepository operandRepository;

    public ValueExtractServiceImpl(DelimiterRepository delimiterRepository, OperandRepository operandRepository) {
        this.delimiterRepository = delimiterRepository;
        this.operandRepository = operandRepository;
    }

    @Override
    public void extractValue(String inputValue, String regex) {
        String[] splitResult = inputValue.split(regex);
        for(String operand : splitResult){
            operandRepository.addOperand(new Operand(Integer.parseInt(operand)));
        }
    }
}
