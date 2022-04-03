import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Для завершения процесса ввода, введите end");

        while (true) {
            System.out.print("Введите номер телефона: ");
            String userTel = scanner.nextLine();
            if (userTel.equals("end"))
                break;
            System.out.print("Введите ФИО: ");
            String userName = scanner.nextLine();
            if (userName.equals("end"))
                break;

            EnterData enterData = (tel, name) -> {
                list.add(tel + " - " + name);
            };
            enterData.telAndName(userTel, userName);
            System.out.println();
        }

        System.out.println("\nТаблица данных:");
        list.stream()
                .forEach(System.out::println);
    }
}