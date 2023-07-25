package com.data.display.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.display.modal.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
