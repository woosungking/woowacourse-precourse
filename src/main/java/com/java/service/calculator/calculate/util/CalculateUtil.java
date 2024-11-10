package com.java.service.calculator.calculate.util;

import com.java.repository.operand.Operand;

import java.util.List;

public class CalculateUtil {

    public static List<Integer> convertOperendListToInteger(List<Operand> operandList){
        return operandList.stream().map(Operand::getValue).toList();
    }

}
