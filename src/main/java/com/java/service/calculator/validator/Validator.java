package com.java.service.calculator.validator;

import com.java.exception.ErrorCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private static final String REGEX ="^-?\\d+$";

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

    public static void isOnlyInteger(String inputValue){
        if(!inputValue.matches(REGEX)){
            throw new IllegalArgumentException(ErrorCode.INPUT_VALUE_ONLY_INTEGER.getErrorMessage());
        }
    }

}
