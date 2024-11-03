package com.java.io;

import com.java.exception.ErrorCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class InputValueHandler {
    public String readInput() throws IOException {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String inputValue;

            inputValue = (String)input.readLine();
            return inputValue;
    }
}
