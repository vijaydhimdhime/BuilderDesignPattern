package BuilderDesignPattern.Customer;

public class Client {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Tony")
                .lastName("Stark")
                .primaryEmail("tonystark@abc.com")
                .primaryMobileNumber("1234567890")
                .build();

        System.out.println(customer.toString());
        
        Customer customer2 = new CustomerBuilder()
        .firstName("kk")
        .middleName("jj")
        .lastName("pp")
        .primaryEmail("kk@gmail.com")
        .primaryMobileNumber("123456790")
        .secondaryEmail("pp@yahoo.in")
        .secondaryMobileNumber("4526318")
        .build();
        System.out.println("========");
        System.out.println("customer2 : -----\n");
        System.out.println(customer2);
    }
}
