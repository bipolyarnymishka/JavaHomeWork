public class Staff {
    String fullName;
    String position;
    String email;
    String phone;
    float salary;
    int age;



    Staff(String fullName, String position, String email, String phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void info() {
        System.out.println("ФИО " + fullName);
        System.out.println("Должность " + position);
        System.out.println("email " + email);
        System.out.println("Телефон " + phone);
        System.out.println("Зарплата " + salary);
        System.out.println("Возраст "+ age);
    }


}
