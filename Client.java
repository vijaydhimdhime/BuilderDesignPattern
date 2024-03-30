package BuilderDesignPattern.Phone;

public class Client {
	public static void main(String[] args) {
		/*
		 * this line provide mandatory fields
		 * */
		Phone phone = new Phone("Androide", "4 GB", "onePlus", "Rs. 21000 /-", "2023");// 
		System.out.println(phone);
		System.out.println("=====");
		/*
		 *  in this line we can provide important fields and other fields get assign default values
		*/
		Phone phone2 = new PhoneBuilder().setPhoneName("SAMSUNG").setPhoneRam("3 gb").build(); 
		System.out.println(phone2);
	}

}
