public class Calculator {


    private Parser parserValue;
    private int num1;
    private int num2;
    private String operand;
    private int result;


    @Override
    public String toString() {
        return parserValue.isRoman() ? RomanNum.getRomanNumber(result) : result + "";
    }

    public Calculator(Parser parserValue) {
        this.parserValue = parserValue;
        this.num1 = parserValue.getNum1();
        this.num2 = parserValue.getNum2();
        this.operand = parserValue.getOperand();

    }

    public String printResult() {
        result = calc();
        if((result < 0) && (parserValue.isRoman())) {                 // Если число отрицательное и римское
            return "-" + RomanNum.getRomanNumber(Math.abs(result));   // добавляем знак '-'
        } else
        return  parserValue.isRoman() ? RomanNum.getRomanNumber(result) : result + "";
    }


    public int calc() {
        int result = 0;

        switch (operand) {
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("/"):
//                if (num2 == 0) {
//                    throw new ArithmeticException("Error division by zero!!!");
//                }
                result = num1 / num2;
        }
        return result;
    }


}
