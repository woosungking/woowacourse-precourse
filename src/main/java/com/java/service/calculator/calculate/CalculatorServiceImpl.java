package com.java.service.calculator.calculate;

import com.java.repository.operand.Operand;
import com.java.service.calculator.calculate.util.CalculateUtil;

import java.util.List;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public Integer addIntegerListValue(List<Integer> operand) { //여기는 딱 더하기만 해주자.
        return operand.stream().reduce(0, Integer::sum);
    }
    @Override
    public Integer addOperandListValue(List<Operand> operand) { //여기는 딱 더하기만 해주자.
        List<Integer> integerOperand = CalculateUtil.convertOperendListToInteger(operand);
        return integerOperand.stream().reduce(0, Integer::sum);
    }
    
}
