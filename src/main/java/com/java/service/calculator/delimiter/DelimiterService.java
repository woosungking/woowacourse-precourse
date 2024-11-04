package com.java.service.calculator.delimiter;

import com.java.repository.delimiter.Delimiter;

import java.util.List;

public interface DelimiterService {
    public void extractCustomDelimiter(String inputValue);
    public void saveCustomDelimiter(Delimiter delimiter);
    public String generateDelimiterRegex(List<Delimiter> delimiters);
    public List<Delimiter> getDelimiterList();
}
