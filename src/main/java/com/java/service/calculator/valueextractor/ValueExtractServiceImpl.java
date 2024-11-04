package com.java.service.calculator.valueextractor;

import com.java.repository.delimiter.Delimiter;
import com.java.repository.delimiter.DelimiterRepository;
import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;

import java.util.List;
import java.util.regex.Pattern;

public class ValueExtractServiceImpl implements ValueExtractService{
    private final DelimiterRepository delimiterRepository;
    private final OperandRepository operandRepository;

    public ValueExtractServiceImpl(DelimiterRepository delimiterRepository, OperandRepository operandRepository) {
        this.delimiterRepository = delimiterRepository;
        this.operandRepository = operandRepository;
    }

    @Override
    public void extractValue(String inputValue) {
        List<Delimiter> dex = delimiterRepository.getDelimiterRepo();
        String regex = String.join("|", dex.stream()
                .map(Delimiter::getValue)
                .map(Pattern::quote)
                .toArray(String[]::new));
        String[] splitResult = inputValue.split(regex);
        for(String operand : splitResult){
            operandRepository.addOperand(new Operand(Integer.parseInt(operand)));
        }
    }
}
