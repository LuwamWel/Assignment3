public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSocSecurityNum() {
        return socSecurityNum;
    }
    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }
    public static void main(String[] args) {

        Customer c1 = new Customer("Tom", "Murphy","12345");
        c1.setBillingAddress(new Address("Airport road", "Fairfield","IA","52557"));
        c1.setShippingAddress(new Address("Airport road", "Fairfield","IA","52557"));

        Customer c2 = new Customer("Jonh", "Doe","54321");
        c2.setBillingAddress(new Address("Ellis Ave", "Chicago","IL","60637"));
        c2.setShippingAddress(new Address("Ellis Ave", "Chicago","IL","60637"));

        Customer c3 = new Customer("Kristine", "Michael","24680");
        c3.setBillingAddress(new Address("Holloway Ave", "San Francisco","CA","94132"));
        c3.setShippingAddress(new Address("Holloway Ave", "San Francisco","CA","94132"));

        Customer [] customerArray =  {c1,c2,c3};
        for(int i=0; i < customerArray.length; i++){
            if ("Chicago".equals(customerArray[i].billingAddress.getCity())){
                System.out.println(customerArray[i]);
            }
        }
    }
}
