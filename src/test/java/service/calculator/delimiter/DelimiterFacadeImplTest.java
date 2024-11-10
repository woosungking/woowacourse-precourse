package service.calculator.delimiter;

import com.java.repository.delimiter.DelimiterList;
import com.java.service.calculator.delimiter.DelimiterFacade;
import com.java.service.calculator.delimiter.DelimiterFacadeImpl;
import com.java.service.calculator.delimiter.DelimiterService;
import com.java.service.calculator.delimiter.DelimiterServiceImpl2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DelimiterFacadeImplTest {
    private DelimiterList delimiterList;
    private  DelimiterService delimiterService;
    private  DelimiterFacade delimiterFacade;
    @BeforeEach
    public void beforeEach(){
        delimiterList = new DelimiterList();
        delimiterService = new DelimiterServiceImpl2(delimiterList);
        delimiterFacade = new DelimiterFacadeImpl(delimiterService);
    }
    /*
    문자열로 입력 되어진 값으로 부터 구분자를 추출하는데 필요한 서비스들을 한번에 실행하기 위한 메서드
     */
    @Test
    public void generateRegexFromValueTest(){
        // given
        String inputValue = "1,1//!\\n1!//@\\n//%\\n";

        // when
        String actualValue = delimiterFacade.generateRegexFromValue(inputValue);

        // then
        //String expectedValue = "\\Q:\\E|\\Q,\\E|\\Q!\\E|\\Q//!\\n\\E|\\Q@\\E|\\Q//@\\n\\E|\\Q%\\E|\\Q//%\\n\\E|\\Q!\\E|\\Q//!\\n\\E|\\Q@\\E|\\Q//@\\n\\E|\\Q%\\E|\\Q//%\\n\\E|\\Q!\\E|\\Q//!\\n\\E|\\Q@\\E|\\Q//@\\n\\E|\\Q%\\E|\\Q//%\\n\\E|\\Q!\\E|\\Q//!\\n\\E|\\Q@\\E|\\Q//@\\n\\E|\\Q%\\E|\\Q//%\\n\\E\n";
        String expectedValue = "\\\\Q:\\\\E|\\\\Q,\\\\E|\\\\Q!\\\\E|\\\\Q//!\\\\n\\\\E|\\\\Q@\\\\E|\\\\Q//@\\\\n\\\\E|\\\\Q%\\\\E|\\\\Q//%\\\\n\\\\E|\\\\Q!\\\\E|\\\\Q//!\\\\n\\\\E|\\\\Q@\\\\E|\\\\Q//@\\\\n\\\\E|\\\\Q%\\\\E|\\\\Q//%\\\\n\\\\E|\\\\Q!\\\\E|\\\\Q//!\\\\n\\\\E|\\\\Q@\\\\E|\\\\Q//@\\\\n\\\\E|\\\\Q%\\\\E|\\\\Q//%\\\\n\\\\E";

        assertEquals(expectedValue, actualValue);
    }

}
