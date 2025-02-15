package HW5;

public class MainRun {

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivan", "Ivanov", "Engineer", "mailbox0@mailbox.com", "892312312", 90000, 30);
        empArray[1] = new Employee("Petr", "Petrov", "Developer", "mail1box1@mailbox.com", "892312333", 230000, 35);
        empArray[2] = new Employee("Maria", "Sokolova", "Manager", "mailbox2@mailbox.com", "892355512", 100000, 40);
        empArray[3] = new Employee("Tatiana", "Shvedova", "Director", "mailbox3@mailbox.com", "899912312", 300000, 45);
        empArray[4] = new Employee("Nikolay", "Kuznetcov", "Doctor", "mailbox4@mailbox.com", "894442312", 130000, 55);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].info();
            }
        }


    }

}