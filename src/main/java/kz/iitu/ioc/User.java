package kz.iitu.ioc;

public class User implements ContentList{

    private int id;
    private String name;
    private String cardNumber;
    private int cvv;
    private long money;
    private String pin;

    public void createUser(int id, String name, String cardNumber, int cvv, long money, String pin){
        this.id = id;
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.money = money;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Id = " + getCardNumber());
        System.out.println("Name = " + getName());
        System.out.println("==========================");
    }

    @Override
    public void add(ContentList contentList) {
    }

    @Override
    public void remove(ContentList contentList) {
    }

    @Override
    public ContentList getChild(int i) {
        return null;
    }

    public long getMoney() {
        return money;
    }
}
