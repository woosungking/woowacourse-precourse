package com.java.util;

import com.java.exception.ErrorCode;

public class Validator {
    public static void startValidate(String inputValue){
        isOnlySpace(inputValue);
        isEmpty(inputValue);
    }

    public static void isOnlySpace(String inputValue){
        if(inputValue.trim().isEmpty()){
            throw new IllegalArgumentException(ErrorCode.IS_ONLY_SPACE.getErrorMessage());
        }
    }
    public static void isEmpty(String inputValue){
        if(inputValue.isEmpty()){
            throw new IllegalArgumentException(ErrorCode.NO_ARG_INPUT.getErrorMessage());
        }
    }

}
