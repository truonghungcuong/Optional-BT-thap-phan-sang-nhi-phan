import java.util.Stack;

public class DecimalToBinary {
    public static String convert(int decimal) {
        if (decimal < 0) {
            throw new UnsupportedOperationException("Khong the convert so am.");
        }
        if (decimal == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            int temp = decimal % 2;
            decimal = decimal / 2;
            stack.push(temp);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}