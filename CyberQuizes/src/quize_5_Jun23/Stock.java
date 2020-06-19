package quize_5_Jun23;

import quize_2_Jun_2.Main;

public class Stock {
	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol=tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.marketCap = this.totalShares * price;
	}
	public void adjustPrice(int value) {
		this.price = this.price + value;
		percentChange = (double) value/this.price;
		marketCap = (long) (this.totalShares * this.price);
		
	}
	@Override
	public String toString() {
		return "Ticker Symbol: " + this.tickerSymbol + "\nCompany: " + this.companyName 
				+ "\nCurrent Price: $" + this.price + " (" + this.percentChange + "%)" 
				+ "\nMarket Cap: $" + marketCap;
	}
	public static void main(String[]args) {
		Stock stock = new Stock("GOOG", "Google, Inc", 802, 453000);
		stock.adjustPrice(57);
		System.out.println(stock.toString());
	}

	
	

}
