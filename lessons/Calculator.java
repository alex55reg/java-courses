/**
 * Класс для выполнения арифметических операций
 * @autor Плеханов
 * @version 1.1
 */
public class Calculator {
	/**
	* @value поле результат вычисления
	*/
	private double result;
	/**
	* Сложение
	* @param params аргументы сложения
	*/
	public void summ(double ... params) {
		for (double param : params) {
		this.result += param;
		}
	}
	/**
	* Умножение
	* @param double a, double b аргументы умножения
	*/
	public void mult(double a, double b) {
		this.result = a*b;
	}
	/**
	* Вычитание
	* @param double a, double b аргументы вычитания
	*/
	public void sub(double a, double b) {
		this.result = a-b;
	}
	/**
	* Деление
	* @param double a, double b аргументы деления
	*/
	public void div(double a, double b){
		this.result = a/b;
	}
	/**
	* Возведение в степень
	* @param double a основание, double b показатель степени
	*/
	public void pow(double a, double b) {
		this.result = Math.pow (a, b);
	}
 	/**
	* Получить результат. @result - результат вычисления
	*/
	public double getResult() {
		return this.result;
	}
	/**
	* Очистиь результат вычислений
	*/
	public void cleanResult() {
		this.result = 0;
	}
}