package com.java.memory.input;

public class Operand {

    private final Integer value;

    public Operand(String inputValue){
        this.value = Integer.parseInt(inputValue);
    }
    public Integer getValue(){
        return this.value;
    }
}
