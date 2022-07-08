package com.lucasnscr.securitykeycloack.repository;

import com.lucasnscr.securitykeycloack.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
