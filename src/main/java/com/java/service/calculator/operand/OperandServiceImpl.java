package com.java.service.calculator.operand;

import com.java.repository.delimiter.DelimiterRepository;
import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;
import com.java.service.calculator.operand.util.OperandUtil;
import com.java.service.calculator.validator.Validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperandServiceImpl implements OperandService {
    private final OperandRepository operandRepository;

    public OperandServiceImpl(OperandRepository operandRepository) {
        this.operandRepository = operandRepository;
    }

    @Override
    public List<Operand> extractOperand(String inputValue, String regex) {
        String[] splitResult = inputValue.split(regex);
        List<String> result = Arrays.stream(splitResult)
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
        return OperandUtil.convertStringListToOperand(result);
    }
    @Override
    public void saveOperand(){}
    @Override
    public void saveOperandList(List<Operand> operandList){
        for(Operand operand : operandList){
            operandRepository.addOperand(operand);
        }
    }
    @Override
    public List<Operand> getOperandList(){
        return operandRepository.getOperand();
    }

}
