package garage;

	
public abstract class Vehicle {
	private  String BATTERY, BRAKES , ENGINE , FRAME;
	private  int WHEELS;

	public Vehicle(String BATTERY, String BRAKES, String ENGINE , String FRAME, int WHEELS ) {
		setBATTERY(BATTERY);
		setBRAKES(BRAKES);
		setENGINE(ENGINE);
		setFRAME(FRAME);
		setWHEELS(WHEELS);
		
	}
	public String getBATTERYe(){
		return BATTERY;
	}
	public String getBRAKES(){
		return BRAKES;
	}
	public String getENGINE(){
		return ENGINE;
	}
	public String getFRAME(){
		return FRAME;
	}
	public  int getWHEELS(){
		return WHEELS;
	}
	
	
	
	
	public void setBATTERY(String BATTERY){
		this.BATTERY = BATTERY; 
	}
	public void setBRAKES(String BRAKES){
		this.BRAKES = BRAKES;
	}
	public void setENGINE(String ENGINE){
		this.ENGINE = ENGINE;
	}
	public void setFRAME(String FRAME){
		this.FRAME = FRAME;
	}
	public void setWHEELS(int WHEELS){
		this.WHEELS = WHEELS;
	}
	

	
}