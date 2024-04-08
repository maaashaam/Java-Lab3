import java.time.LocalDate;
import java.time.Period;

public class User {
    String name;
    String surname;
    String patronymic;
    String birthday;

    String get_initials() {
        return surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".";
    }

    String get_sex() {
        String sex;
        int patronymic_len = patronymic.length();
        if (patronymic.substring(patronymic_len - 1).equals("ч")) {
            sex = "мужской";
        } else {
            sex = "женский";
        }
        return sex;
    }

    Integer get_age() {
        int day = Integer.parseInt(birthday.substring(0, 2));
        int month = Integer.parseInt(birthday.substring(3, 5));
        int year = Integer.parseInt(birthday.substring(6));
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(year, month, day);
        return Period.between(birth, today).getYears();
    }

    void get_information() {
        String initials = this.get_initials();
        String sex = this.get_sex();
        Integer age = this.get_age();
        System.out.println("ФИО: " + initials);
        System.out.println("Пол: " + sex);
        System.out.println("Возраст: " + age);
    }

}