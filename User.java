public abstract class User {
    // Data Fields
    private String ID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;

    // Constructors
    public User(){};

    public User(String ID, String firstName, String lastName, String phoneNumber, String password) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    // Getters and setters
    public String getID() {
        return ID;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Other methods
    public String printFullName(){
        return (firstName + " " + lastName);
    }

    @Override
    public abstract String toString();

} // End of User class
