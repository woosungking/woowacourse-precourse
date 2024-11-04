package com.java.repository.delimiter;

import java.util.ArrayList;
import java.util.List;

public class DelimiterRepository {
    private final List<Delimiter> delimiterRepo = new ArrayList<>();

    public DelimiterRepository() {
        delimiterRepo.add(new Delimiter(":"));
        delimiterRepo.add(new Delimiter(","));
    }

    public void addDelimiter(Delimiter delimiter) {
        System.out.println(delimiter.getValue());
        delimiterRepo.add(delimiter);
    }

    public List<Delimiter> getDelimiterRepo() {
        return delimiterRepo; // 수정 불가능한 리스트 반환
    }
}
