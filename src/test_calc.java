import java.util.Scanner;
public class test_calc {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение, например 2 + 3:");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат: " + result);
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
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        String operator = elements[1];
        if (num1 >10){
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        if (num1 < 1){
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        if (num2 >10){
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        if (num2 < 1){
            return " Вы можете ввести только числа от 1 до 10 включительно";
        }
        int result;
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
                    throw new Exception("неверный оператор");
                }
                catch (Exception e){
                    System.err.println("ошибка - " + e.getMessage());
                    System.exit(0);
                }
                return null;
        }
        return String.valueOf(result);
    }
}
