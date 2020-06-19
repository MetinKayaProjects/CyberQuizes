package quize_4_Jun_16;

public class Pizza{
	private String size;
	private int numberOfCheeseToppings;
	private int numberOfPepperoniToppings;
	private int numberOfHamToppings;
	public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings, int numberOfHamToppings) {
		super();
		this.size = size;
		this.numberOfCheeseToppings = numberOfCheeseToppings;
		this.numberOfPepperoniToppings = numberOfPepperoniToppings;
		this.numberOfHamToppings = numberOfHamToppings;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getNumberOfCheeseToppings() {
		return numberOfCheeseToppings;
	}
	public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
		this.numberOfCheeseToppings = numberOfCheeseToppings;
	}
	public int getNumberOfPepperoniToppings() {
		return numberOfPepperoniToppings;
	}
	public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
		this.numberOfPepperoniToppings = numberOfPepperoniToppings;
	}
	public int getNumberOfHamToppings() {
		return numberOfHamToppings;
	}
	public void setNumberOfHamToppings(int numberOfHamToppings) {
		this.numberOfHamToppings = numberOfHamToppings;
	}
	
	public double calcCost() {
		double cost=0;;
		if (this.size.equalsIgnoreCase("Small")) cost=10;
		else if (this.size.equalsIgnoreCase("Medium")) cost=12;
		else if (this.size.equalsIgnoreCase("Large")) cost=14;
		
		cost += 2*(getNumberOfCheeseToppings()+getNumberOfPepperoniToppings()+getNumberOfHamToppings());
		return cost;
	}

		public String getDescription() {
			
			return this.size + " Pizza with " + getNumberOfCheeseToppings()+ " Cheese toppings, "
			+ getNumberOfPepperoniToppings()+ " Pepperoni toppings, and " 
			+ getNumberOfHamToppings() + " Ham toppings.\n" + " Total Price: " + calcCost();
		}  
//		public static void main(String[] args) {
//			Pizza p = new Pizza("Large", 0,0,2);		
//			System.out.println(p.getDescription());
//		}
	
}