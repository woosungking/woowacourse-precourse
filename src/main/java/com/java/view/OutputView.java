package com.java.view;

import com.java.repository.output.OutputValue;
import com.java.service.io.output.OutputValueService;

public class OutputView {
    private final OutputValueService outputValueService;

    public OutputView(OutputValueService outputValueService) {
        this.outputValueService = outputValueService;
    }

    public void stringCalculatorResultView(OutputValue outputValue){
        String result = outputValueService.getOutputValueToString(outputValue); //어떤 인수가 와야하는지 보면 좋을거같아서 이부부은 분리안함.
        System.out.println(OutputMessage.SHOW_RESULT_VALUE.getMessage()+result);
    }
}
