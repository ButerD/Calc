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
        if ((result < 0) && (parserValue.isRoman())) {                 // Если число отрицательное и римское
            return "-" + RomanNum.getRomanNumber(Math.abs(result));   // добавляем знак '-'
        } else
            return parserValue.isRoman() ? RomanNum.getRomanNumber(result) : result + "";
    }


    public int calc() {
        int result = switch (operand) {
            case ("+") -> num1 + num2;
            case ("-") -> num1 - num2;
            case ("*") -> num1 * num2;
            case ("/") -> num1 / num2;
            default -> 0;
        };
        return result;
    }


}
