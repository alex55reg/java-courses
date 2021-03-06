import java.util.Scanner;

/**
* Класс для запуска калькулятора.Поддерживает ввод пользователя.
* @autor Плеханов
* @version 1.1
*/
public class InteractRunner {
    /**
     * Данный метод является точкой входа в программу
     * @param args
     */
	public static void main(String[] args) {
        /**
         * Создание объекта класса Scanner работающий с потоком ввода
         */
		Scanner reader = new Scanner(System.in);
        /**
         * Блок програмного кода который требуется защитить от исключений
         */
		try {
            /**
             * @value поле необходимое для выхода из программы
             */
			String exit = "no";
            /**
             * @value поле повторного использования результата
             */
			String reuse = "no";
            /**
             * @value инициализация поля результата до проведения вычислений
             */
			Double result = null;
            /**
             * @value поле первого аргумента
             */
			String first;
            /**
             * Цикл выполнения вычисления
             */
			while (!exit.equals("yes")){
                /**
                 * Создания объекта класса Calculator в начале каждого цикла вычислений для сброса аргументов методов вычисления
                 */
			Calculator calc = new Calculator();
                /**
                 * True если в конце предыдущего вычисления не было выбрано использование результата вычислений
                 */
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
                /**
                 * True - выход из цикла вычисления
                 */
			if (!exit.equals("no")) break;
			System.out.println("Use calculation result? yes/no");
			reuse = reader.next();
                /**
                 * True - если не используется результат для повторных вычислений
                 */
			if (!reuse.equals("yes"))
				calc.cleanResult();
			result = calc.getResult();
			}
		
		} finally {
			reader.close();
		}

	}
}