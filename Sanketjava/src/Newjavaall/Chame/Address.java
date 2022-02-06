
package Newjavaall.Chame;

 public class Address{
	private String city;
	private String state;
	private int pincode;
	private String landMark;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, int pincode, String landMark) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.landMark = landMark;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + ", landMark=" + landMark + "]";
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	
}