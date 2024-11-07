package service.calculator.operand;

import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;
import com.java.service.calculator.operand.OperandFacade;
import com.java.service.calculator.operand.OperandFacadeImpl;
import com.java.service.calculator.operand.OperandService;
import com.java.service.calculator.operand.OperandServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class OperandFacadeImplTest {
    private OperandRepository operandRepository;
    private OperandService operandService;
    private OperandFacade operandFacade;

    @BeforeEach
    public void beforeEach(){
        operandRepository = new OperandRepository();
        operandService = new OperandServiceImpl(operandRepository);
        operandFacade = new OperandFacadeImpl(operandService);
    }
    @Test
    public void extractAndSaveOperandTest(){
        //given
        String regex = Pattern.quote(",") + "|" +
                Pattern.quote(":") + "|" +
                Pattern.quote("//!\\n") + "|" +
                Pattern.quote("!");
        String inputValue = "1:,//!\\n1000";
        //기댓값
        List<Operand> expectValue = new ArrayList<>();
        expectValue.add(new Operand(1));
        expectValue.add(new Operand(1000));
        //when
        List<Operand> actualValue = operandFacade.extractAndSaveOperand(regex, inputValue);
        //then
        for(int i=0; i<actualValue.size();i++){
            Assertions.assertEquals(expectValue.get(i).getValue(), actualValue.get(i).getValue());
        }

    }
}
