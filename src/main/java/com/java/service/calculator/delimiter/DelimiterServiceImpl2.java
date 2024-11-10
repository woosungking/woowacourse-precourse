package com.java.service.calculator.delimiter;

import com.java.exception.ErrorCode;
import com.java.repository.delimiter.Delimiter;
import com.java.repository.delimiter.DelimiterList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterServiceImpl2 implements DelimiterService {
    private final DelimiterList delimiterList;
    private static final String REGEX = "//(.*?)\\\\n";

    public DelimiterServiceImpl2(DelimiterList delimiterList) {
        this.delimiterList = delimiterList;
    }

    private final List<Delimiter> extractedDelimiter = new ArrayList<>();
    @Override
    public List<Delimiter> extractCustomDelimiter(String inputValue) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(inputValue);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            String customDelimiter2 = matcher.group(0);
            if (customDelimiter.length() != 1) {
                throw new IllegalArgumentException(ErrorCode.CUSTOM_DELIMITER_IS_NOT_VALIDATED.getErrorMessage());
            }
            extractedDelimiter.addAll(Arrays.asList(Delimiter.of(customDelimiter),Delimiter.of(customDelimiter2)));
            extractCustomDelimiter(inputValue.substring(matcher.end()).trim());
        }
        saveAllCustomDelimter(extractedDelimiter);
        return extractedDelimiter;
    }

    @Override
    public String generateDelimiterRegex(List<Delimiter> delimiters) {
        String regex = String.join("|", delimiters.stream()
                .map(Delimiter::getValue)
                .map(Pattern::quote)
                .toArray(String[]::new));
        return regex;
    }

    @Override
    public void saveCustomDelimiter(Delimiter delimiter) {
        delimiterList.addDelimiter(delimiter);
    }

    @Override
    public void saveAllCustomDelimter(List<Delimiter> delimiters) {
        delimiterList.addAllDelimiter(delimiters);
    }

    @Override
    public List<Delimiter> getDelimiterList() {
        return delimiterList.getDelimiterRepo();
    }


}
