public class Parser {
    private String expression;
    private String numStr1;
    private String numStr2;
    private int num1, num2;
    private String operand;
    private boolean isRoman;

    public boolean isRoman() {
        return isRoman;
    }

    public Parser(String numStr) {
        this.expression = numStr;
        getValue();
    }

    public String getOperand() {
        return operand;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public boolean checkArabNum(int num) {
        return ((num > 0) && (num <= 10)) ? true : false;
    }

    public void getValue() {
        expression = expression.replaceAll(" ", "");
        String[] values = expression.split("[-+*/]");
        if (values.length != 2) {                                // Проверка на формат
            System.out.println("Wrong format !!!");
            System.exit(0);
        }
        numStr1 = values[0];
        numStr2 = values[1];
        operand = expression.replaceAll(numStr1, "");   // Получаем операнд
        operand = operand.replaceAll(numStr2, "");

        try {
            num1 = Integer.parseInt(numStr1);                       //
            num2 = Integer.parseInt(numStr2);
            if (!(checkArabNum(num1) && checkArabNum(num2))) {
                System.out.println("Wrong number. Only 1..10");
                System.exit(0);
            }
            isRoman = false;
        } catch (NumberFormatException e) {
            if ((RomanNum.isRoman(numStr1)) && (RomanNum.isRoman(numStr2))) {
                isRoman = true;
                num1 = RomanNum.getArabNumber(numStr1);
                num2 = RomanNum.getArabNumber(numStr2);
                return;
            }
            System.out.println("Wrong expression !!!");
            System.exit(0);
        }
    }

}
