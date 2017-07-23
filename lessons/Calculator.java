public class Calculator {
	/**
		��������� ����������
	*/
	private double result;
	/**

		�������������� ��������. @param params ��������� ��������.
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
		�������� ���������. @result - ��������� ����������.
	*/
	public double getResult() {
		return this.result;
	}


	/**
		������� ��������� ����������
	*/
	public void cleanResult() {
		this.result = 0;
	}
}