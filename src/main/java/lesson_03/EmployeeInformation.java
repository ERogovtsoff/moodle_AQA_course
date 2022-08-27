package lesson_03;

public class EmployeeInformation {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Ivan",
                "Ivanov",
                "Ivanovich",
                "Front-end Developer",
                "vanyafront13@gmail.com",
                "79385059006",
                1200,
                43);
        employeeArray[1] = new Employee("Egor",
                "Egorov",
                "Egorovich",
                "Manual QA",
                "mircourage@gmail.com",
                "79385059006",
                600,
                22);
        employeeArray[2] = new Employee("Vasya",
                "Ivanov",
                "Ilich",
                "Back-end Developer",
                "vasyaback15@gmail.com",
                "79385059006",
                2000,
                45);
        employeeArray[3] = new Employee("Anton",
                "Ivanov",
                "Ivanovich",
                "PM",
                "ton_pm@gmail.com",
                "79385059006",
                900,
                32);
        employeeArray[4] = new Employee("Maria",
                "Ivanova",
                "Ivanovna",
                "Designer",
                "designer_mash@mail.ru",
                "79385059006",
                1500,
                56);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                System.out.println(employeeArray[i].toString());
            }
        }
    }
}
