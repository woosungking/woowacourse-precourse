package com.java.repository.input;

import java.util.ArrayList;
import java.util.List;

public class InputValueList {
    private final List<InputValue> inputValueRepo=new ArrayList<>();

    public void addInputValue(InputValue inputValue){
        inputValueRepo.add(inputValue);
    }

    public List<InputValue> getInputValue(){
        return inputValueRepo;
    }
}
