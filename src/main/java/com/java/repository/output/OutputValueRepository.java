package com.java.repository.output;

import java.util.ArrayList;
import java.util.List;

public class OutputValueRepository {
    private final List<OutputValue> outputValueRepo = new ArrayList<>();

    public void addOutputValue(OutputValue outputValue){
        outputValueRepo.add(outputValue);
    }
    public List<OutputValue> getOutputValue(){
        return outputValueRepo;
    }
}
