package com.java.repository.delimiter;

public class Delimiter {
    private String value;
    public Delimiter(){
        //아무런 작업을 하지 않음.
    }
    private Delimiter(String value){
        this.value=value;
    }
    public static Delimiter of(String value){
        return new Delimiter(value);
    }
    public String getValue(){
        return this.value;
    }
}
