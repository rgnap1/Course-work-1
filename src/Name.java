import java.util.Objects;
public class Name {
    private String lastName;
    private String firstName;
    private String middleName;
    private String fullName;

    public Name(String lastName, String firstName, String middleName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + middleName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getFullName(){
        return this.fullName;
    }

    @Override
    public String toString(){
        return lastName + " - " + firstName + " - " + middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return lastName.equals(name.lastName) && firstName.equals(name.firstName) && middleName.equals(name.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName);
    }
}
