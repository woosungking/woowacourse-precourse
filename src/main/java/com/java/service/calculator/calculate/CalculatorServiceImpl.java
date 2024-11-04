package com.java.service.calculator.calculate;

import com.java.repository.operand.Operand;
import com.java.repository.operand.OperandRepository;
import com.java.repository.output.OutputValue;
import com.java.repository.output.OutputValueRepository;

import java.util.List;

public class CalculatorServiceImpl implements CalculatorService{
    private final OperandRepository operandRepository;
    private final OutputValueRepository outputValueRepository;

    public CalculatorServiceImpl(OperandRepository operandRepository, OutputValueRepository outputValueRepository) {
        this.operandRepository = operandRepository;
        this.outputValueRepository = outputValueRepository;
    }

    @Override
    public void addValue() {
        List<Operand> operands = operandRepository.getOperand();
        List<Integer> sexy = operands.stream().map(Operand::getValue).toList();
        int sum = sexy.stream().reduce(0, Integer::sum);
        outputValueRepository.addOutputValue(new OutputValue(sum));
    }
}
