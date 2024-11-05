package com.java.service.io.util;

import com.java.repository.output.OutputValue;

public class OutputValueUtil {

    public static Integer convertOutputToInteger(OutputValue value){
        return value.getValue();
    }

    public static String convertOutputToString(OutputValue value){
        return String.valueOf(convertOutputToInteger(value));
    }
    // 단순한 형변환이지만, OutputValue의 대한 형 변환이므로, 이 메서드를 outputValueService외에 다른 서비스에서 직접적으로 사용한다면 책임 분리가
    //명확하지 않은거 같아서 OutputValue에서 호출하겠다.
}
