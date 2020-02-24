package com.microhome.auth.api;

import com.microhome.auth.api.dto.request.DtoCreateUserRequest;
import com.microhome.auth.db.UserRepository;
import com.microhome.auth.db.entities.DbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(DtoCreateUserRequest body) {
        DbUser user = new DbUser(body.getName(), Integer.MAX_VALUE);
        userRepository.save(user);
    }
}
