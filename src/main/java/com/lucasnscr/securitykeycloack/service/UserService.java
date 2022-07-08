package com.lucasnscr.securitykeycloack.service;

import com.lucasnscr.securitykeycloack.model.User;
import com.lucasnscr.securitykeycloack.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Slf4j
@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Long saveUser(User user){
        Long id;
        User  userSaved;
        log.info("Request for saveUser method");
        if (ObjectUtils.isEmpty(user)){
            throw new RuntimeException("Invalid data");
        }else{
            userSaved = userRepository.save(user);
        }
        return id = userSaved.getId();
    }

    public User getUserById(Long id){
        log.info("Request for user with " + id + " getUserById method");
        Optional<User> userOptional = userRepository.findById(id);
        if (!userOptional.isPresent()) {
            throw new RuntimeException("Plant could not be found with id : " + id);
        }
        return userOptional.get();
    }
}
