package com.java.service.calculator.delimiter;

import com.java.repository.delimiter.Delimiter;

import java.util.List;

public class DelimiterFacadeImpl implements DelimiterFacade{
    private final DelimiterService delimiterService;

    public DelimiterFacadeImpl(DelimiterService delimiterService) {
        this.delimiterService = delimiterService;
    }

    @Override
    public String generateRegexFromValue(String value) {
        delimiterService.extractCustomDelimiter(value);
        List<Delimiter> delimiterList = delimiterService.getDelimiterList();
        String regex = delimiterService.generateDelimiterRegex(delimiterList);
        return regex;
    }
}
