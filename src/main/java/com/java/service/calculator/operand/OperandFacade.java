package com.java.service.calculator.operand;

import com.java.repository.operand.Operand;

import java.util.List;

public interface OperandFacade {
    public List<Operand> extractAndSaveOperand(String regex, String value);
}
