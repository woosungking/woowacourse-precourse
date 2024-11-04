package com.java.service.calculator.delimiter;

import com.java.repository.delimiter.Delimiter;

public interface DelimiterService {
    public void extractCustomDelimiter(String inputValue);
    public void saveCustomDelimiter(Delimiter delimiter);
}
