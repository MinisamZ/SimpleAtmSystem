package kz.iitu.ioc;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;

public class BankService implements BankServiceImpl {
    public ContentList populateTheListOfUsers(ApplicationContext context) {
        ContentList bank = new Bank();
        int counter = 1;

        while (true) {
            try {
                bank.add((User) context.getBean("user" + counter));
            } catch (NoSuchBeanDefinitionException e) {
                System.out.println("Список закончил.");
                return bank;
//            System.out.println(e.getMessage());
            }
            counter++;
        }
//        System.out.println(1);
//        User user31 = (User) bank.getChild(1);
//        System.out.println(user31.toString());
//        System.out.println(user31.getName());;
////        bank.print();
    }

    public User login(String cardNumberLocal, String pinLocal, ContentList bankFull) {
        User userLocal;
        int counter = 0;

        while (true) {
            System.out.println("asd");
            try {
                System.out.println(counter);
                userLocal = (User) bankFull.getChild(counter);
                userLocal.print();
//                userLocal = (User) context.getBean("user" + counter);
                if (userLocal.getCardNumber().equals(cardNumberLocal) && userLocal.getPin().equals(pinLocal)) {
                    return userLocal;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Нет такого пользователя");
                return null;
//            System.out.println(e.getMessage());
            }
            counter++;
        }
    }
}
