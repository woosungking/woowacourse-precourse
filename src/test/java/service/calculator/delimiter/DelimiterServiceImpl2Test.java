package service.calculator.delimiter;

import com.java.repository.delimiter.Delimiter;
import com.java.repository.delimiter.DelimiterRepository;
import com.java.service.calculator.delimiter.DelimiterService;
import com.java.service.calculator.delimiter.DelimiterServiceImpl2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class DelimiterServiceImpl2Test {
    private DelimiterRepository delimiterRepository;
    private DelimiterService delimiterService;

    @BeforeEach
    public void beforeEach(){
        // DelimiterRepository와 DelimiterService 객체를 초기화
        delimiterRepository = new DelimiterRepository();  // DelimiterRepository 객체 생성
        delimiterService = new DelimiterServiceImpl2(delimiterRepository);  // DelimiterService 생성
    }
    @Test
    public void extractCustomDelimiterTest(){
        //given
        String inputValue = "1,2//!\\n3//@\\n4//#\\n";

        //when
        List<Delimiter> result = delimiterService.extractCustomDelimiter(inputValue);

        // then
        List<String> expectedDelimiters = List.of("!", "//!\\n", "@","//@\\n","#","//#\\n");

        List<String> actualDelimiters = result.stream()
                .map(Delimiter::getValue)
                .collect(Collectors.toList());


        assertIterableEquals(expectedDelimiters, actualDelimiters, "구분자 목록이 예상과 일치하지 않습니다.");
    }

    @Test
    public void extractCustomDelimiterTest_WithIllegalArg_whenDelimiterIsNotSingleCharacter(){
        String inputValue = "1,2//!@\\n3//@\\n4//#\\n";
        assertThrows(IllegalArgumentException.class, () -> {
            delimiterService.extractCustomDelimiter(inputValue);
        });
    }

    @Test
    public void generateDelimiterRegexTest(){
        //given
        List<Delimiter> delimiters = List.of(
                new Delimiter("!"),
                new Delimiter("//!\\n"),
                new Delimiter("@"),
                new Delimiter("//@\\n"),
                new Delimiter("#"),
                new Delimiter("//#\\n")
        );
        //when
        String regex = delimiterService.generateDelimiterRegex(delimiters);
        //then
        String expectedRegex = Pattern.quote("!") + "|" +
                Pattern.quote("//!\\n") + "|" +
                Pattern.quote("@") + "|" +
                Pattern.quote("//@\\n") + "|" +
                Pattern.quote("#") + "|" +
                Pattern.quote("//#\\n");
        assertEquals(expectedRegex, regex, "정규식이 예상과 일치하지 않습니다.");

    }
}
