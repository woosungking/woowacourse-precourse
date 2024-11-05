package com.java.service.io;

import com.java.repository.output.OutputValue;
import com.java.repository.output.OutputValueRepository;

import java.util.List;

public class OutputValueServiceImpl implements OutputValueService {
    private final OutputValueRepository outputValueRepository;

    public OutputValueServiceImpl(OutputValueRepository outputValueRepository) {
        this.outputValueRepository = outputValueRepository;
    }

    @Override
    public List<OutputValue> getOutput() {
        return outputValueRepository.getOutputValue();
    }
    @Override
    public Integer convertOutputToInteger(OutputValue value){
        return value.getValue();
    }
    @Override
    public String convertOutputToString(OutputValue value){
        return String.valueOf(convertOutputToInteger(value));
    }



}
