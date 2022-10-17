package functionalandlambda;

public class Address {
    private int dNo;
    private String stName;
    private String city;
    private String state;
    
   
	public Address(int dNo, String stName, String city, String state) {
		super();
		this.dNo = dNo;
		this.stName = stName;
		this.city = city;
		this.state = state;
	}
	
	public int getdNo() {
		return dNo;
	}
	public void setdNo(int dNo) {
		this.dNo = dNo;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", stName=" + stName + ", city=" + city + ", state=" + state + "]";
	}
    
    
}
