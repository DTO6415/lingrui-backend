import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入第一个数字:");
		long firstNumber = scanner.nextLong();
		System.out.println("请输入运算符 (+, -, *, /):");
        char operator = scanner.next().charAt(0);
		System.out.println("请输入第二个数字:");	
		long secondNumber = scanner.nextLong();
        if (operator == '/' && secondNumber == 0) {
            System.out.println("除数不能为 0");
			scanner.close();
			return;
        }
		switch (operator) {
			case '+':
				System.out.println(firstNumber + secondNumber);
				break;
			case '-':
				System.out.println(firstNumber - secondNumber);
				break;
			case '*':
				System.out.println(firstNumber * secondNumber);
				break;
			case '/':
				System.out.println(firstNumber / secondNumber);
				break;
			default:
				System.out.println("非法运算符");
		}
		scanner.close();
	}
}