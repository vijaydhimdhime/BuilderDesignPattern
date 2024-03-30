package BuilderDesignPattern.Customer;

public class Customer {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String primaryEmail;
    private final String secondaryEmail;
    private final String primaryMobileNumber;
    private final String secondaryMobileNumber;

    public Customer(CustomerBuilder customerBuilder) {
        this.firstName = customerBuilder.getFirstName();
        this.middleName = customerBuilder.getMiddleName();
        this.lastName = customerBuilder.getLastName();
        this.primaryEmail = customerBuilder.getPrimaryEmail();
        this.secondaryEmail = customerBuilder.getSecondaryEmail();
        this.primaryMobileNumber = customerBuilder.getPrimaryMobileNumber();
        this.secondaryMobileNumber = customerBuilder.getSecondaryMobileNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public String getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\n" +
                "Middle Name: " + middleName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Primary Email: " + primaryEmail + "\n" +
                "Secondary Email: " + secondaryEmail + "\n" +
                "Primary Mobile Number: " + primaryMobileNumber + "\n" +
                "Secondary Mobile Number: " + secondaryMobileNumber + "\n";
    }
}

