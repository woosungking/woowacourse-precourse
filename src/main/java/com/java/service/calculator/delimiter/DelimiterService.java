package com.java.service.calculator.delimiter;

import com.java.repository.delimiter.Delimiter;

import java.util.List;

public interface DelimiterService {
    public List<Delimiter> extractCustomDelimiter(String inputValue);
    public String generateDelimiterRegex(List<Delimiter> delimiters);
    public void saveCustomDelimiter(Delimiter delimiter);
    public void saveAllCustomDelimter(List<Delimiter> delimiters);
    public List<Delimiter> getDelimiterList();
}
