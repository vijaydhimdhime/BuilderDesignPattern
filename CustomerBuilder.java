package BuilderDesignPattern.Customer;

public class CustomerBuilder implements ICustomerBuilder {
    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    @Override
    public CustomerBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CustomerBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CustomerBuilder middleName(final String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public CustomerBuilder primaryEmail(final String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder secondaryEmail(final String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
        return this;
    }

    @Override
    public CustomerBuilder primaryMobileNumber(final String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
        return this;
    }

    @Override
    public CustomerBuilder secondaryMobileNumber(final String secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
        return this;
    }

    public Customer build() {
        return new Customer(this);
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
}

