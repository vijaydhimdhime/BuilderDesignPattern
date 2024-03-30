package BuilderDesignPattern.Phone;

public class PhoneBuilder {
	private String phoneOs;
	private String phoneRam;
	private String phoneName;
	private String phonePrice;
	private String phoneYear;
	public PhoneBuilder setPhoneOs(String phoneOs) {
		this.phoneOs = phoneOs;
		return this;
	}
	public PhoneBuilder setPhoneRam(String phoneRam) {
		this.phoneRam = phoneRam;
		return this;
	}
	public PhoneBuilder setPhoneName(String phoneName) {
		this.phoneName = phoneName;
		return this;
	}
	public PhoneBuilder setPhonePrice(String phonePrice) {
		this.phonePrice = phonePrice;
		return this;
	}
	public PhoneBuilder setPhoneYear(String phoneYear) {
		this.phoneYear = phoneYear;
		return this;
	}
	
	public Phone build()
	{
		return new Phone(phoneOs, phoneRam, phoneName, phonePrice, phoneYear);
	}
}
