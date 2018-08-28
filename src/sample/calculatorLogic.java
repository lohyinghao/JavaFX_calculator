package sample;

import java.util.Arrays;
import java.util.List;

public class calculatorLogic {
    //private double visibleVar = 0;
    private double memoryVar;
    private List<Character> operationType = Arrays.asList('+','-','*','/');
    private int operation;

    public calculatorLogic() {
        this.memoryVar = 0;
    }

    public void setMemoryVar(double memoryVar) {
        this.memoryVar = memoryVar;
    }

    public double getMemoryVar() {
        return memoryVar;
    }

    public void setOperation(char operand, double input){
        setMemoryVar(input);
        this.operation = operationType.indexOf(operand);
    }

    public void calculate(double input){
        switch(operationType.get(operation)){
            case '+' :
                System.out.println(memoryVar + " + " + input);
                memoryVar = memoryVar + input;
                System.out.println("= " + memoryVar);
                break;
            case '-' :
                System.out.println(memoryVar + " - " + input);
                memoryVar = memoryVar - input;
                System.out.println("= " + memoryVar);
                break;
            case '*' :
                System.out.println(memoryVar + " * " + input);
                memoryVar = memoryVar * input;
                System.out.println("= " + memoryVar);
                break;
            case '/' :
                System.out.println(memoryVar + " / " + input);
                memoryVar = memoryVar / input;
                System.out.println("= " + memoryVar);
                break;
        }
    }

}
