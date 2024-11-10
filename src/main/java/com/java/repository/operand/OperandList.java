package com.java.repository.operand;

import java.util.ArrayList;
import java.util.List;

public class OperandList {
    private final List<Operand> operandList = new ArrayList<>();

    public void addOperand(Operand operand){
        operandList.add(operand);
    }
    public List<Operand> getOperand(){
        return operandList;
    }
}
