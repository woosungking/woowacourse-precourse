package com.java.view;

import com.java.repository.output.OutputValue;
import com.java.repository.output.OutputValueRepository;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private final OutputValueRepository outputValueRepository;

    public OutputView(OutputValueRepository outputValueRepository) {
        this.outputValueRepository = outputValueRepository;
    }

    public void stringCalculatorResultView(){
        List<OutputValue> OutputValues= outputValueRepository.getOutputValue();
        String result = OutputValues.stream().map(OutputValue::getValue).map(String::valueOf).collect(Collectors.joining());
        System.out.println(OutputMessage.SHOW_RESULT_VALUE.getMessage()+result);
    }
}
