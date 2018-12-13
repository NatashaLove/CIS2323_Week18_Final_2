public class Candle {
	
	protected String color;
	protected double height;
	protected double price;
	
	public String getColor(){
		return color;
	}
	 public double getHeight(){
		return height;
	}
	public double getPrice(){
		return price;
	}
	 
	public void setColor(String color){
			
		this.color = color;
	}
	public void setHeight(double height){
			
		this.height = height;
		price= height *2;
	}	
	// public void setPrice(double price){
		
		// price= height *2;
		// this.price= price;
		
	// }
			
	
}