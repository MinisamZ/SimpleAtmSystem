package kz.iitu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context.getBean("user2", User.class).toString());
        BankService bank = new BankService();
//        System.out.println(bank.login("4669897724657621", "6952", context));
//        System.out.println("=================");
//        ArrayList<User> people = new ArrayList<User>();
//        people.add(context.getBean("user1", User.class));
//        people.add(context.getBean("user2", User.class));
//        people.add(context.getBean("user3", User.class));
//        for(User person : people){
//
//            System.out.println(person);
//        }
        System.out.println("=================");
        ContentList bankFull = bank.populateTheListOfUsers(context);


        while (true) {
            System.out.println("=================\n" +
                    "1. ATM\n" +
                    "2. List accounts");
            String input = scan.nextLine();
            if (input.equals("1") || input.equals("ATM")) {
                ATM.startATM(bank, bankFull);
            }
            if (input.equals("2") || input.equals("List accounts")) {
                bankFull.print();
            }
            if (input.equals("9") || input.equals("exit"))
                break;
        }


    }

}
