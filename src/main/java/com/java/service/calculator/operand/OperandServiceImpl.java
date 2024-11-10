package com.java.service.calculator.operand;

import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandList;
import com.java.service.calculator.operand.util.OperandUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperandServiceImpl implements OperandService {
    private final OperandList operandList;

    public OperandServiceImpl(OperandList operandList) {
        this.operandList = operandList;
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
            this.operandList.addOperand(operand);
        }
    }
    @Override
    public List<Operand> getOperandList(){
        return operandList.getOperand();
    }

}
