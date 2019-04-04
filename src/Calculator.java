public class Calculator {

    public static int calculate(int firtOperand, int secondOperand , char operator) {
        switch (operator) {
            case '+':
                return firtOperand + secondOperand ;
            case '-':
                return firtOperand - secondOperand ;
            case '*':
                return firtOperand * secondOperand ;
            case '/':
                if (secondOperand  != 0)
                    return firtOperand / secondOperand ;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}