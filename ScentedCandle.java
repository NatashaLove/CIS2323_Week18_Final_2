public class ScentedCandle extends Candle{
	
	private String scent;
	
	public void setScent(String scent){
			
		this.scent = scent;
	}
	public String getScent(){
		
		return scent;
	}
	
	@Override
	public void setHeight(double height){
			
		this.height = height;
		price= height *3;
	}	
}