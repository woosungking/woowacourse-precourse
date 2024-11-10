package com.java.repository.output;

public class OutputValue {
    private Integer outputValue;

    private OutputValue(Integer outputValue) {
        this.outputValue = outputValue;
    }
    public static OutputValue of(Integer outputValue){
        return new OutputValue(outputValue);
    }

    public Integer getValue(){
        return this.outputValue;
    }

}
