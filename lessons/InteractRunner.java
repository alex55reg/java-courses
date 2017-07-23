import java.util.Scanner;

/**
	Класс для запуска калькулятора.Поддерживает ввод пользователя.
*/
public class InteractRunner {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			String exit = "no";
			String reuse = "no";
			Double result = null;
			String first;
			while (!exit.equals("yes")){
			Calculator calc = new Calculator();
				if (!reuse.equals("yes"))
					{
					System.out.println("Enter first arg: ");
					first = reader.next();
					}
				else
					first = String.valueOf(result);
				System.out.println("Enter second arg: ");
				String second = reader.next();
				System.out.println("Select arithmetic operation: +, -, *, /, ^");
				String operation = reader.next();
				switch(operation) {
					case "+":
					calc.summ(Double.valueOf(first), Double.valueOf(second));
					break;
					case "*":
					calc.mult(Double.valueOf(first), Double.valueOf(second));
					break;
					case "-":
					calc.sub(Double.valueOf(first), Double.valueOf(second));
					break;
					case "/":
					calc.div(Double.valueOf(first), Double.valueOf(second));
					break;
					case "^":
					calc.pow(Double.valueOf(first), Double.valueOf(second));
					break;
				}
				System.out.println("Result: " + calc.getResult());
			System.out.println("Exit? yes/no");	
			exit = reader.next();	
			if (!exit.equals("no")) break;
			System.out.println("Use calculation result? yes/no");
			reuse = reader.next();
			if (!reuse.equals("yes")) 
				calc.cleanResult();
			result = calc.getResult();
			}
		
		} finally {
			reader.close();
		}

	}
}