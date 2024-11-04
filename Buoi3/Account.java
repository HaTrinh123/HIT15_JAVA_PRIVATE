package BTVNBuoi3;

public class Account {
    private int id;
    private String name;
    private int balance;
    public Account(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(int id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getID() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
