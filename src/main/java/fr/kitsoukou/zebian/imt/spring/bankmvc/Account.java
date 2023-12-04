package fr.kitsoukou.zebian.imt.spring.bankmvc;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Table("accounts")
public class Account implements Persistable<String> {

    @Transient
    @JsonIgnore
    private boolean isNew = true;

    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String getId() {
        return owner;
    }

    @Override
    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
