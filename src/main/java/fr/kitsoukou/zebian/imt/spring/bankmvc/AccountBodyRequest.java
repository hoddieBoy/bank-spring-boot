package fr.kitsoukou.zebian.imt.spring.bankmvc;

public class AccountBodyRequest {

    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
