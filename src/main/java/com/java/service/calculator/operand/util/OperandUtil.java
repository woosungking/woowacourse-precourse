package com.java.service.calculator.operand.util;

import com.java.exception.ErrorCode;
import com.java.repository.operand.Operand;
import com.java.service.calculator.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class OperandUtil {

    public static Operand convertStringToIntegerAndOperand(String operand){
        try {
            Integer integerOperand = Integer.parseInt(operand);
            return Operand.of(integerOperand);
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException(ErrorCode.INPUT_VALUE_ONLY_INTEGER.getErrorMessage() + e);
        }
    }
    public static List<Operand> convertStringListToOperand(List<String> strOperand){
        List<Operand> operandList = new ArrayList<>();
        for(String operand : strOperand){
            Validator.isOnlyInteger(operand);
            operandList.add(OperandUtil.convertStringToIntegerAndOperand(operand));
        }
        return operandList;
    }
//public static Operand convertStringToIntegerAndOperand(String operand){
//    try {
//        Integer integerOperand = Integer.parseInt(operand);
//        return new Operand(integerOperand);
//    }catch(IllegalArgumentException e){
//        throw new IllegalArgumentException(ErrorCode.INPUT_VALUE_ONLY_INTEGER.getErrorMessage() + e);
//    }
//}
}
