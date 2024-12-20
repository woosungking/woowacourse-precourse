package com.java.service.io.input;

import com.java.repository.input.InputValue;
import com.java.repository.input.InputValueRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValueServiceImpl implements InputValueService {
    private final InputValueRepository inputValueRepository;

    public InputValueServiceImpl(InputValueRepository inputValueRepository1) {
        this.inputValueRepository = inputValueRepository1;
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
        inputValueRepository.addInputValue(new InputValue(inputValue));
    }
}
