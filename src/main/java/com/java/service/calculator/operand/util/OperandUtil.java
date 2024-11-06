package com.java.service.calculator.operand.util;

import com.java.exception.ErrorCode;
import com.java.repository.operand.Operand;

public class OperandUtil {

    public static Operand convertStringToIntegerAndOperand(String operand){
        try {
            Integer integerOperand = Integer.parseInt(operand);
            return new Operand(integerOperand);
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException(ErrorCode.INPUT_VALUE_ONLY_INTEGER.getErrorMessage() + e);
        }
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
