import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User person = new User();

        System.out.println("Введите имя:");
        Scanner in1 = new Scanner(System.in);
        person.name = in1.nextLine();
        if (person.name.isEmpty()) {
            System.out.println("Поле должно быть заполнено");
            System.exit(0);
        }

        System.out.println("Введите фамилию:");
        Scanner in2 = new Scanner(System.in);
        person.surname = in2.nextLine();
        if (person.surname.isEmpty()) {
            System.out.println("Поле должно быть заполнено");
            System.exit(0);
        }

        System.out.println("Введите отчество:");
        Scanner in3 = new Scanner(System.in);
        person.patronymic = in3.nextLine();
        if (person.patronymic.isEmpty()) {
            System.out.println("Поле должно быть заполнено");
            System.exit(0);
        }

        System.out.println("Введите дату рождения (в формате ДД:ММ:ГГГГ): ");
        Scanner in4 = new Scanner(System.in);
        person.birthday = in4.nextLine();
        var date = person.birthday.split("\\.");
        if (person.birthday.isEmpty()) {
            System.out.println("Поле должно быть заполнено");
            System.exit(0);
        }
        if (date.length != 3 ) {
            System.out.println("Неверно введена дата рождения");
            System.exit(0);
        }
        person.get_information();
    }
}
