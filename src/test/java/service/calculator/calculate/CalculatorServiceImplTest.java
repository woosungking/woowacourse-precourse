package service.calculator.calculate;

import com.java.repository.operand.Operand;
import com.java.service.calculator.calculate.CalculatorService;
import com.java.service.calculator.calculate.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorServiceImplTest {
    CalculatorService calculatorService;
    @BeforeEach
    public void beforeEach(){
    calculatorService = new CalculatorServiceImpl();
    }
    @Test
    public void addIntegerListValueTest(){
        //given
        List<Integer> inputValue = new ArrayList<>();
        inputValue.add(1);
        inputValue.add(2);
        inputValue.add(3);
        //when
        Integer actualValue = calculatorService.addIntegerListValue(inputValue);
        //then
        Integer expectValue = 6;
        Assertions.assertEquals(expectValue, actualValue);
    }
    @Test
    public void addOperandListValueTest(){
        //given
        List<Operand> inputValue = new ArrayList<>();
        inputValue.add(new Operand(1));
        inputValue.add(new Operand(2));
        inputValue.add(new Operand(3));
        //when
        Integer actualValue = calculatorService.addOperandListValue(inputValue);
        //then
        Integer expectedValue = 6;
        Assertions.assertEquals(expectedValue, actualValue);
    }




}
