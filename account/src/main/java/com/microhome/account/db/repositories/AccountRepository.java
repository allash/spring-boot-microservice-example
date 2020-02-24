package com.microhome.account.db.repositories;

import com.microhome.account.db.entities.DbAccount;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AccountRepository {

    private Map<String, DbAccount> map = new HashMap<>();

    public List<DbAccount> getAccounts() {
        return new ArrayList<>(map.values());
    }

    public DbAccount getByName(String name) {
        return map.get(name);
    }

    public void create(DbAccount account) {
        if (map.containsKey(account.getName())) {
            throw new RuntimeException("Duplicate id");
        }

        map.put(account.getName(), account);
    }
}
