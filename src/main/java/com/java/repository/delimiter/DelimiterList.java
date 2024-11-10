package com.java.repository.delimiter;

import java.util.ArrayList;
import java.util.List;

public class DelimiterList {
    private final List<Delimiter> delimiterRepo;

    public DelimiterList() {
        delimiterRepo = new ArrayList<>();
        setDefaultDelimiters();
    }
    public void addDelimiter(Delimiter delimiter) {
        delimiterRepo.add(delimiter);
    }
    public void addAllDelimiter(List<Delimiter> delimiters){
        delimiterRepo.addAll(delimiters);
    }

    public List<Delimiter> getDelimiterRepo() {
        return delimiterRepo; // 수정 불가능한 리스트 반환
    }

    private void setDefaultDelimiters(){
        delimiterRepo.add(Delimiter.of(","));
        delimiterRepo.add(Delimiter.of(":"));
    }
}
