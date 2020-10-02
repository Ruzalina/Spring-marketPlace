package com.mp.repo;

import com.mp.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    User getById(Long id);

    User getByUsername(String username);

}
