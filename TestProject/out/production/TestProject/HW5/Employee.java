package HW5;

public class Employee {

    private String name;
    private String lastname;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String lastname, String name, String post, String email, String phone, int salary, int age) {

        this.lastname = lastname;
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }


    public String info() {
         return ("Information: " + this.lastname + ' ' + this.name + ' ' + this.post + ' ' + this.age);
    }
}

