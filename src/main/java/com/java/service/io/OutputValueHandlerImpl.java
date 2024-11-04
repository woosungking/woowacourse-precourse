package com.java.service.io;

import com.java.repository.output.OutputValue;
import com.java.repository.output.OutputValueRepository;

import java.util.List;

public class OutputValueHandlerImpl implements OutputValueHandler{
    private final OutputValueRepository outputValueRepository;

    public OutputValueHandlerImpl(OutputValueRepository outputValueRepository) {
        this.outputValueRepository = outputValueRepository;
    }

    @Override
    public List<OutputValue> readOutput() {
        return outputValueRepository.getOutputValue();
    }
}
