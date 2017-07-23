public class Calculator {
	/**
		Результат вычисления
	*/
	private double result;
	/**

		Арифметические операции. @param params Аргументы операций.
	*/
	public void summ(double ... params) {
		for (double param : params) {
		this.result += param;
		}
	}

	public void mult(double a, double b) {
		this.result = a*b;
	}
	public void sub(double a, double b) {
		this.result = a-b;
	}
	public void div(double a, double b){
		this.result = a/b;
	}
	public void pow(double a, double b) {
		this.result = Math.pow (a, b);
	}
 	/**
		Получить результат. @result - результат вычисления.
	*/
	public double getResult() {
		return this.result;
	}


	/**
		Очистиь результат вычислений
	*/
	public void cleanResult() {
		this.result = 0;
	}
}