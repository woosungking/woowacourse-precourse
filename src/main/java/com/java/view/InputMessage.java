package com.java.view;

public enum InputMessage {

    ENTER_VALUE("덧샘할 문자열을 입력 해 주세요.");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
