package BuilderDesignPattern.Phone;

public class Phone {
	private String phoneOs;
	private String phoneRam;
	private String phoneName;
	private String phonePrice;
	private String phoneYear;
	public Phone(String phoneOs, String phoneRam, String phoneName, String phonePrice, String phoneYear) {
		super();
		this.phoneOs = phoneOs;
		this.phoneRam = phoneRam;
		this.phoneName = phoneName;
		this.phonePrice = phonePrice;
		this.phoneYear = phoneYear;
	}
	
	public String getPhoneOs() {
		return phoneOs;
	}

	public String getPhoneRam() {
		return phoneRam;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public String getPhonePrice() {
		return phonePrice;
	}

	public String getPhoneYear() {
		return phoneYear;
	}

	@Override
	public String toString() {
		return "Phone :--> \nphoneOs = " + phoneOs + ",\nphoneRam = " + phoneRam + ",\nphoneName = " + phoneName + ",\nphonePrice = "
				+ phonePrice + ",\nphoneYear = " + phoneYear ;
	}
	
	

}
