package com.java.service.io.output;

import com.java.repository.output.OutputValue;
import com.java.repository.output.OutputValueList;
import com.java.service.io.output.util.OutputValueUtil;

import java.util.List;

public class OutputValueServiceImpl implements OutputValueService {
    private final OutputValueList outputValueList;

    public OutputValueServiceImpl(OutputValueList outputValueList) {
        this.outputValueList = outputValueList;
    }

    @Override
    public List<OutputValue> getOutputList() {
        return outputValueList.getOutputValue();
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
        outputValueList.addOutputValue(outputValue);
        return outputValue;
    }


}
