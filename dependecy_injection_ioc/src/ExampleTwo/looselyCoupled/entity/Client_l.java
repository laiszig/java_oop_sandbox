package ExampleTwo.looselyCoupled.entity;

public class Client_l {

    private String name;
    private String email;
    private String phone;
    private boolean active = false;

    public Client_l(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isActive() {
        return active;
    }

    public void activate() {
        this.active = true;
    }
}
