package com.java.service.calculator.operand;

import com.java.repository.operand.Operand;

import java.util.List;

public class OperandFacadeImpl implements OperandFacade{
    private final OperandService operandService;

    public OperandFacadeImpl(OperandService operandService) {
        this.operandService = operandService;
    }

    @Override
    public List<Operand> extractAndSaveOperand(String regex, String value) {
        List<Operand> operandList = operandService.extractOperand(value,regex);
        operandService.saveOperandList(operandList);
        return operandList;
    }
}
