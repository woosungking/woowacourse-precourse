package com.java.service.io;

import com.java.repository.output.OutputValue;

import java.util.List;

public interface OutputValueService {
    public List<OutputValue> getOutputList();
    public Integer getOutputValueToInteger(OutputValue outputValue);
    public String getOutputValueToString(OutputValue outputValue);
}
