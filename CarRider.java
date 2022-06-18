package Tugas5;

public class CarRider {
    private String name, phone;
    private int age;

    public CarRider(String name, int age, String phone) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
