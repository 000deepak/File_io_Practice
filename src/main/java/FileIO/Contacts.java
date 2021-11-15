package FileIO;

public class Contacts {

    public String firstName;
    public String lastName;//Obj Attributes

    public Contacts(String firstName, String lastName) {
        this.firstName = firstName;				//Constructor
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}


    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}