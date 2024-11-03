package com.java.exception;

public enum ErrorCode {
    NO_ARG_INPUT("입력값이 아무것도 입력되지 않았습니다"),
    IS_ONLY_SPACE("스페이스만 입력이 되었습니다"),
    CUSTOM_DELIMITER_IS_NOT_VALIDATED("커스텀 구분자는 문자여야 합니다.");

    private final String message;
    ErrorCode(String message){
    this.message = message;
    }
    public String getErrorMessage(){
        return this.message;
    }
}
