package com.api.corridadasblogueiras.repository;

import com.api.corridadasblogueiras.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long> {
}
