package com.java.repository.delimiter;

import java.util.ArrayList;
import java.util.List;

public class DelimiterRepository {
    private final List<Delimiter> delimiterRepo;

    public DelimiterRepository() {
        delimiterRepo = new ArrayList<>();
        delimiterRepo.add(new Delimiter(":"));
        delimiterRepo.add(new Delimiter(","));
    }

    public void addDelimiter(Delimiter delimiter) {
        delimiterRepo.add(delimiter);
    }
    public void addAllDelimiter(List<Delimiter> delimiters){
        for(Delimiter delimiter : delimiters){
            addDelimiter(delimiter);
        }
    }

    public List<Delimiter> getDelimiterRepo() {
        return delimiterRepo; // 수정 불가능한 리스트 반환
    }
}
