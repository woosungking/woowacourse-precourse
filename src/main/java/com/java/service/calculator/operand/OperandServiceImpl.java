package com.java.service.calculator.operand;

import com.java.repository.delimiter.DelimiterRepository;
import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;

public class OperandServiceImpl implements OperandService {
    private final DelimiterRepository delimiterRepository;
    private final OperandRepository operandRepository;

    public OperandServiceImpl(DelimiterRepository delimiterRepository, OperandRepository operandRepository) {
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
