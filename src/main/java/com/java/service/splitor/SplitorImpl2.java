package com.java.service.splitor;

import com.java.exception.ErrorCode;
import com.java.memory.delimiter.Delimiter;
import com.java.memory.delimiter.DelimiterRepository;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitorImpl2 implements Splitor{
    private final DelimiterRepository delimiterRepository;
    private static final String REGEX = "//(.*?)\\\\n";

    public SplitorImpl2(DelimiterRepository delimiterRepository) {
        this.delimiterRepository = delimiterRepository;
    }


    @Override
    public void getCustomDelimiter(String inputValue) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(inputValue);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            if (customDelimiter.length() != 1) {
                throw new IllegalArgumentException(ErrorCode.CUSTOM_DELIMITER_IS_NOT_VALIDATED.getErrorMessage());
            }
            delimiterRepository.addDelimiter(new Delimiter(customDelimiter));
            delimiterRepository.addDelimiter(new Delimiter(matcher.group(0)));
            String remaining = inputValue.substring(matcher.end()).trim();
            getCustomDelimiter(remaining);
        }
        System.out.println(delimiterRepository.getDelimiterRepo());
    }
}
