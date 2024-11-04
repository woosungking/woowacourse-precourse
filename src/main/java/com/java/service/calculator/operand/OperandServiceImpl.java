package com.java.service.calculator.operand;

import com.java.repository.delimiter.DelimiterRepository;
import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperandServiceImpl implements OperandService {
    private final DelimiterRepository delimiterRepository;
    private final OperandRepository operandRepository;

    public OperandServiceImpl(DelimiterRepository delimiterRepository, OperandRepository operandRepository) {
        this.delimiterRepository = delimiterRepository;
        this.operandRepository = operandRepository;
    }

    @Override
    public List<Operand> extractOperand(String inputValue, String regex) {
        String[] splitResult = inputValue.split(regex);
        List<String> result = Arrays.asList(splitResult);
        return convertStringListToOperand(result);
    }

    public void saveOperand(){}
    public void saveOperandList(List<Operand> operandList){
        for(Operand operand : operandList){
            operandRepository.addOperand(operand);
        }
    }


    public List<Operand> convertStringListToOperand(List<String> strOperand){
        List<Operand> operandList = new ArrayList<>();
        for(String operand : strOperand){
            operandList.add(new Operand(Integer.parseInt(operand)));
        }
        return operandList;
    }
}
