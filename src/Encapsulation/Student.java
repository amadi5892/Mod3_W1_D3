package Encapsulation;

public class Student {
    private int id;
    private String name;
    private String email;
    private int phone;

    public void setId(int newId) {
        id = newId;
    }

    public int getId() {
        return id;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(int newPhone) {
        phone = newPhone;
    }

    public int getPhone() {
        return phone;
    }
}
