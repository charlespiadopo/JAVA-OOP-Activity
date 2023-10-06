package Main;

public class user {

    private int userID;
    private String userName;
    private String firstName, lastName;

    user(int userID, String userName, String firstName, String lastName){
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    int getUserID() {
        return userID;
    }

    String getUserName() {
        return userName;
    }

    void setfirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }
}
