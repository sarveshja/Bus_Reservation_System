package MyBusResv;

public class Bus {
	private int busNo;
	private Boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public boolean getAc() {
		return ac;
	}
	
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int cap) {
		this.capacity = cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public void setBusNo(int no) {
		busNo=no;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus NUmber:"+ busNo +" AC:"+ac+" Capacity:"+capacity);
		
	}

}
