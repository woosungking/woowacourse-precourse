package com.java.service.calculator.operand;

import com.java.repository.operand.Operand;

import java.util.List;

public interface OperandService {
    public List<Operand> extractOperand(String inputValue, String regex);
}
