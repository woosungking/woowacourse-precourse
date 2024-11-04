package com.java.service.calculator.delimiter;

import com.java.exception.ErrorCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterServiceImpl {

    public  final List<String> DELIMITER = new ArrayList<>(Arrays.asList(":", ","));
    private  final String REGEX = "//(.*?)\\\\n";

    public  void getCustomDelimiter(String inputValue) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(inputValue);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            if (customDelimiter.length() != 1) {
                throw new IllegalArgumentException(ErrorCode.CUSTOM_DELIMITER_IS_NOT_VALIDATED.getErrorMessage());
            }
            DELIMITER.add(customDelimiter);
            DELIMITER.add(matcher.group(0));
            System.out.println(matcher.end());
            String remaining = inputValue.substring(matcher.end()).trim();
            getCustomDelimiter(remaining);
        }
    }


}
