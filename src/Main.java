public class Main {
    public static void main(String[] args) {
        // task 1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // task 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // task 3
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}