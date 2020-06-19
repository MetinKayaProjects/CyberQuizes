package quize_2_Jun_2;

public class Question3Accumulator {   //Assessment test #2. 3 - Accumulator
//	Write a class named Accumulator containing:
//		An instance variable named sum of type integer.
//
//		A constructor that accepts an integer parameter, 
//		whose value is used to initialize the sum instance variable.
//
//		A method named getSum that returns the value of sum.
//		A method named add that accepts an integer parameter.
//		 
//		The value of sum is increased by the value of the parameter.
//		A method named remove that accepts an integer parameter.
//		The value of sum is decreased by the value of the parameter.
//
//		Override a toString method so it returns 'Sum is: X' where X is the sum instance variable.
	int sum;
	
	public Question3Accumulator(int sum) {
		super();
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}
	
	public void add(int num) {
		sum += num;
	}
	
	public void remove(int num2) {
		sum -= num2;
	}
	
	@Override
	public String toString() {
		return "Sum is: " + sum;
	}
	
	public static void main(String[] args) {
		Question3Accumulator m = new Question3Accumulator(12);
		
		m.sum=12;
		System.out.println(m.getSum());
		m.add(10);
		System.out.println(m);
		m.remove(2);
		System.out.println(m);
		
		
		
		
		
	}

	

}
