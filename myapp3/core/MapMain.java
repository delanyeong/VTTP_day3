package myapp3.core;

import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class MapMain {
    public static void main ( String [] args ) {

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wilma");
        names.add("betty");

        //Create a simple Map
        Map<String , BankAccount> accts = new HashMap<>();

        for (String n : names) {
            BankAccount acct = new BankAccount(n);
            accts.put(acct.getAccountId(), acct);
        }

        BankAccount fred = new BankAccount("fred");
        BankAccount barney = new BankAccount("barney");
        BankAccount wilma = new BankAccount("wilma");
        BankAccount betty = new BankAccount("betty");

        // accts.put(fred.getAccountId(), fred);
        // accts.put(fred.getAccountId(), barney);
        // accts.put(fred.getAccountId(), wilma);
        // accts.put(fred.getAccountId(), betty);

        // System.out.printf("size : %d\n", accts.size());
        // System.out.printf("has fred : %b\n", accts.containsKey(fred.getAccountId()));
        // System.out.printf("has pebbles : %b\n", accts.containsKey("pebbles"));

        Set<String> keys = accts.keySet();
        Collection<BankAccount> values = accts.values();

        //for loop to it arrays and collection and it doesnt give index but only values
        BankAccount acct;
        // acct = accts.get(acctId);
        for (String acctId : keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s\n, name = %s" , acctId, acct.getName());
        }


    }
}