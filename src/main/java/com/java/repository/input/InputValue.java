package com.java.repository.input;

public class InputValue {
    private String inputValue;

    private InputValue(String inputValue) {
        this.inputValue = inputValue;
    }
    public static InputValue of(String inputValue){
        return new InputValue(inputValue);
    }

    public String getValue(){
        return this.inputValue;
    }
}
