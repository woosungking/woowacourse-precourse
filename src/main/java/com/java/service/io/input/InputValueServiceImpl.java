package com.java.service.io.input;

import com.java.repository.input.InputValue;
import com.java.repository.input.InputValueList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValueServiceImpl implements InputValueService {
    private final InputValueList inputValueList;

    public InputValueServiceImpl(InputValueList inputValueList1) {
        this.inputValueList = inputValueList1;
    }
    @Override
    public String readInput() throws IOException{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String inputValue;
            inputValue = (String)input.readLine();
            return inputValue;
    }

    @Override
    public void saveInput(String inputValue) {
        inputValueList.addInputValue(InputValue.of(inputValue));
    }
}
