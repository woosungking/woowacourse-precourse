package com.java.service.io;

import java.io.IOException;

public interface InputValueService {
    public String readInput() throws IOException;
    public void saveInput(String inputValue);
}
