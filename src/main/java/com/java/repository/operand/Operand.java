package com.java.repository.operand;

public class Operand {

    private Integer value;

    private Operand(Integer inputValue){
        this.value = inputValue;
    }
    public static Operand of(Integer inputValue){
        return new Operand(inputValue);
    }
    public Integer getValue(){
        return this.value;
    }

}
