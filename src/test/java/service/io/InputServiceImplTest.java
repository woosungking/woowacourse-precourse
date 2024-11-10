package service.io;

import com.java.repository.input.InputValueRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputServiceImplTest {
    private InputValueRepository inputValueRepository;
    @BeforeEach
    public void beforeEach(){
        inputValueRepository = new InputValueRepository();
    }
    @Test
    public void readValueTest(){

    }
}
