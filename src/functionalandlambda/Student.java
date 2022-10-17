package functionalandlambda;

public class Student {
	 
	 private int sId;
	 private String name;
	 private String bGroup;
	 private Address address;
	 
	
	public Student(int sId, String name, String bGroup, Address address) {
		super();
		this.sId = sId;
		this.name = name;
		this.bGroup = bGroup;
		this.address = address;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getbGroup() {
		return bGroup;
	}
	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", bGroup=" + bGroup + ", address=" + address + "]";
	}
 
}
