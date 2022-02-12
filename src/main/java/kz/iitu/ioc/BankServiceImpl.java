package kz.iitu.ioc;

import org.springframework.context.ApplicationContext;

public interface BankServiceImpl {
    public User login(String cardNumberLocal, String pinLocal, ContentList bank);

}
