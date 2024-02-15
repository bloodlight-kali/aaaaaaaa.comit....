import java.util.Scanner;
public class test_calc {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение, например 2 + 3:");
        String input = scanner.nextLine();
        input = addSpacesAroundOperators(input);
        String result = calc(input);
        System.out.println("Результат: " + result);
        scanner.close();
    }
    private static String addSpacesAroundOperators(String input) {
        input = input.replaceAll("([\\+\\-\\*\\/])", " $1 ");
        input = input.replaceAll("\\s+", " ");
        return input;
    }
    private static String calc(String input) throws Exception{
        String[] elements = input.split(" ");
        if (elements.length > 3){
            try {
                throw new Exception("размер массива больше 3");
            }
            catch (Exception e){
                System.err.println("ошибка - " + e.getMessage());
                System.exit(0);
            }
        }
        if (elements.length < 3){
            try {
                throw new Exception("размер массива меньше 3");
            }
            catch (Exception e){
                System.err.println("ошибка - " + e.getMessage());
                System.exit(0);
            }
        }
        float num1 = Float.parseFloat(elements[0]);
        float num2 = Float.parseFloat(elements[2]);
        String operator = elements[1];
        if (num1%10>Math.floor(num1) || num2%10>Math.floor(num2) ){
            try {
                throw new Exception("вы ввели не целое число ");
            }
            catch (Exception e){
                System.err.println("ошибка - " + e.getMessage());
                System.exit(0);
            }
        }
        
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            return "Вы можете ввести только числа от 1 до 10 включительно";
        }
        float result;
        switch (operator) {
            case "+":
            result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                try {
                    throw new Exception("Неверный оператор");
                }
                catch (Exception e){
                    System.err.println("ошибка - " + e.getMessage());
                    System.exit(0);
                }
            return " ";
        }
        return String.format("%.0f", result);
    }
}
