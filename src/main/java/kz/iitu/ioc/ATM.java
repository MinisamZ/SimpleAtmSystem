package kz.iitu.ioc;

import java.util.Scanner;

public class ATM {
    public static void startATM(BankService bank, ContentList bankFull){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер карты и pin через enter");
        String cardNumberLocal = scan.nextLine();
        String pinLocal = scan.nextLine();
        User userLocal = (User) bank.login(cardNumberLocal, pinLocal, bankFull);
        if (userLocal != null) {
            while (true) {
                System.out.println("=================\n" +
                        "1.Take money\n" +
                        "2.Put money\n" +
                        "3.Balance\n" +
                        "4.Change pin\n" +
                        "5.exit");
                String input2 = scan.nextLine();
                if (input2.equals("1")) {
                    System.out.println("Сколько хотете снять?");
                    int money = scan.nextInt();
                    System.out.println("Вас счет равен: " + (userLocal.getMoney() - money));
                    scan.nextLine();
                }
                if (input2.equals("2")) {
                    System.out.println("Сколько хотете Положить?");
                    int money = scan.nextInt();
                    System.out.println("Вас счет равен: " + (userLocal.getMoney() + money));
                    scan.nextLine();
                }
                if (input2.equals("3")) {
                    System.out.println("Ваш баланс равен: "+ userLocal.getMoney());

                }
                if (input2.equals("4")) {
                    System.out.println("Введите новый пароль:");
                    scan.nextLine();
                    System.out.println("Ваш новый пароль сохранен");
                }
                if (input2.equals("5") || input2.equals("exit"))
                    break;
            }
        } else {
            System.out.println("Не верный номер или pin");
        }

    }
}
