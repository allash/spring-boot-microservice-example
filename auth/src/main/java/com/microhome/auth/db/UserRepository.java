package com.microhome.auth.db;

import com.microhome.auth.db.entities.DbUser;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<String, DbUser> users = new HashMap<>();

    public void save(DbUser user) {
        if (users.containsKey(user.getName())) {
            throw new RuntimeException("User " + user.getName() + " already exists");
        }

        users.put(user.getName(), user);
    }
}
