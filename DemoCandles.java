import java.util.*;

public class DemoCandles {
	public static void main(String[] args){
		
		
		Candle wax = new Candle();
		ScentedCandle aroma = new ScentedCandle();
		
		wax.setColor("White");
		wax.setHeight(5.5);
		
		aroma.setColor("Red");
		aroma.setHeight(7.2);
		
		System.out.println("");
		System.out.println("We sell simple " +wax.getColor() +" wax candles, "+ wax.getHeight() + " inches, at the price "+ wax.getPrice()+ "$.");
		System.out.println("");
		System.out.println("We sell aroma " +aroma.getColor() +" candles, "+ aroma.getHeight() + " inches, at the price "+ aroma.getPrice()+ "$.");
	}
	
}