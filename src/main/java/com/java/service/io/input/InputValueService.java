package com.java.service.io.input;


import java.io.IOException;

public interface InputValueService {
    public String readInput() throws IOException;
    public void saveInput(String inputValue);
}
