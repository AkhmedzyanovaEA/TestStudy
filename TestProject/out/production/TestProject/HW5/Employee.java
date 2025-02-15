package HW5;

public class Employee {

    private String name;
    private String lastname;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String lastname, String post, String email, String phone, int salary, int age) {

        this.name = name;
        this.lastname = lastname;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPost() {
        return post;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("Information: " + this.name + ' ' + this.lastname + ' ' + this.post + ' ' + this.age);
    }
}

