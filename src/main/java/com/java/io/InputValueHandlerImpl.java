package com.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValueHandlerImpl implements InputValueHandler{
    public String readInput() throws IOException{

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String inputValue;

            inputValue = (String)input.readLine();
            return inputValue;
    }
}
