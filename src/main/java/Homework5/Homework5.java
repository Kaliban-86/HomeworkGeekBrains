package Homework5;

//Домашнее задание
//        Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        Конструктор класса должен заполнять эти поля при создании объекта.
//        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//        С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Homework5 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Екимов Сергей Петрович", "заместитель директора", "ekimov@mail.ru", "89215670809", 130000, 43);
        employees[1] = new Employee("Якубовский Николай Юрьевич", "первый заместитель директора", "stupwork@mail.ru", "89115674509", 140000, 47);
        employees[2] = new Employee("Крачун Михаил Александрович", "заместитель директора по снабжению", "beerandconcrete@mail.ru", "89995676809", 1250000, 39);
        employees[3] = new Employee("Кохановский Вадим Михайлович", "начальник отдела кадров", "asdwq@mail.ru", "89210280109", 90000, 36);
        employees[4] = new Employee("Лазарев Олег Александрович", "начальник вещевой службы", "footcloths@mail.ru", "89215670809", 130000, 35);


        for (Employee employee : employees) {
            employee.sortByAge();
        }
    }
}

class Employee {
    private static final int REFERENCE_AGE = 40;
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void consoleOutput() {
        System.out.println("Ф.И.О.:\t\t" + getFullName());
        System.out.println("Должность:\t" + getPosition());
        System.out.println("Email: \t\t" + getEmail());
        System.out.println("Тел: \t\t" + getPhoneNumber());
        System.out.println("Размер з/п: " + getSalary() + " рублей");
        System.out.println("Возраст:\t" + getAge() + " лет");

    }

    public void sortByAge() {
        if (age < REFERENCE_AGE) {
            System.out.println();
            consoleOutput();
        }
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        if (salary > 0) {
            return salary;
        } else
            System.out.print("Значение указано некорректно!!! ");
        return salary;
    }

    public void setSalary(int salary) {
        if (this.salary >= 0) {
            this.salary = salary;
        }
    }

    public int getAge() {
        if (age > 0) {
            return age;
        } else
            System.out.print("Значение указано некорректно!!! ");
        return age;
    }

    public void setAge(int age) {
        if (this.age >= 0) {
            this.age = age;
        }
    }
}
