package com.java.view;

public enum OutputMessage {
    SHOW_RESULT_VALUE("결과 : ");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }
    public String getMessage(){
        return message;
    }

}
