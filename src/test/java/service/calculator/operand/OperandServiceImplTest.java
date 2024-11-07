package service.calculator.operand;

import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;
import com.java.service.calculator.operand.OperandService;
import com.java.service.calculator.operand.OperandServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OperandServiceImplTest {
    private  OperandRepository operandRepository;
    private  OperandService operandService;
    @BeforeEach
    public void beforeEach(){
        operandRepository = new OperandRepository();
        operandService = new OperandServiceImpl(operandRepository);
    }
    @Test
    public void getAndSaveOperandListTest(){
        //given
        List<Operand> expectedValue = new ArrayList<>();
        expectedValue.add(new Operand(1));
        expectedValue.add(new Operand(2));
        expectedValue.add(new Operand(3));
        //when
        operandService.saveOperandList(expectedValue);
        List<Operand> actualValue = operandService.getOperandList();
        //then
        for(int i=0; i<actualValue.size(); i++){
            Assertions.assertEquals(actualValue.get(i).getValue(), expectedValue.get(i).getValue());
        }
    }

}
