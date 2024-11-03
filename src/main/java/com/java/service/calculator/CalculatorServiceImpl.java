package com.java.service.calculator;

import com.java.service.validator.Validator;

public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String addValue(String inputValue) {
        Validator.startValidate(inputValue);

        return "";
    }
}
