package com.java.service.calculator.operand;

import com.java.repository.operand.Operand;

import java.util.List;

public interface OperandService {
    public List<Operand> extractOperand(String inputValue, String regex);
    public void saveOperand();
    public void saveOperandList(List<Operand> operandList);
    public List<Operand> getOperandList();
}
