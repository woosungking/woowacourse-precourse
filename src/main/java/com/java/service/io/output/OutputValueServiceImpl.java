package com.java.service.io.output;

import com.java.repository.output.OutputValue;
import com.java.repository.output.OutputValueRepository;
import com.java.service.io.output.util.OutputValueUtil;

import java.util.List;

public class OutputValueServiceImpl implements OutputValueService {
    private final OutputValueRepository outputValueRepository;

    public OutputValueServiceImpl(OutputValueRepository outputValueRepository) {
        this.outputValueRepository = outputValueRepository;
    }

    @Override
    public List<OutputValue> getOutputList() {
        return outputValueRepository.getOutputValue();
    }

    @Override
    public Integer getOutputValueToInteger(OutputValue outputValue){
        return OutputValueUtil.convertOutputToInteger(outputValue);
    }
    @Override
    public String getOutputValueToString(OutputValue outputValue){
        return OutputValueUtil.convertOutputToString(outputValue);
    }

    @Override
    public OutputValue saveOutputValue(OutputValue outputValue) {
        outputValueRepository.addOutputValue(outputValue);
        return outputValue;
    }


}
