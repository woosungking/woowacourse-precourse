package com.java.memory.input;

import java.util.ArrayList;
import java.util.List;

public class OperandRepository {
    private final List<Operand> operandRepo = new ArrayList<>();

    public void addOperand(Operand operand){
        operandRepo.add(operand);
    }
    public List<Operand> getOperand(){
        return operandRepo;
    }
}
