package com.java.service.io;

import com.java.repository.output.OutputValue;

import java.util.List;

public interface OutputValueService {
    public List<OutputValue> getOutput();
    public Integer convertOutputToInteger(OutputValue value);
    public String convertOutputToString(OutputValue value);
}
