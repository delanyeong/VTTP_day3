package myapp3.core;

import java.util.UUID;

public class BankAccount {

    //What happens to the default constructor?
    //You need to provide a name to instantiate?

    private String accountId = UUID.randomUUID().toString().substring(0,0);
    private String name;

    public BankAccount(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}