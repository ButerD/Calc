import java.util.Map;
import java.util.TreeMap;

public  class RomanNum {
    private final static Map<String, Integer> mapNum = new TreeMap<>();
    static {
        mapNum.put("I",1);
        mapNum.put("II",2);
        mapNum.put("III",3);
        mapNum.put("IV",4);
        mapNum.put("V",5);
        mapNum.put("VI",6);
        mapNum.put("VII",7);
        mapNum.put("VII",8);
        mapNum.put("IX",9);
        mapNum.put("X",10);
    }

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    // проверкf римской цифры в диапазоне I-X
    public static boolean isRoman(String num) {
        return mapNum.containsKey(num);
    }

    public static int getArabNumber(String num) {
        return mapNum.get(num);
    }

    //перевода арабского числа в римское от I до С
    public static String getRomanNumber(int num) {
        int i = map.floorKey(num);
        if (i == num) {
            return map.get(num);
        }
        else
            return map.get(i) + getRomanNumber(num - i);

    }
}
