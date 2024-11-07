package com.java.service.calculator.calculate;

import com.java.repository.operand.Operand;

import java.util.List;

public interface CalculatorService {
    Integer addOperandListValue(List<Operand> operand);
    Integer addIntegerListValue(List<Integer> operand);
}
