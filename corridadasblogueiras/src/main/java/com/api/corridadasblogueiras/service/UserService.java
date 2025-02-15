package com.api.corridadasblogueiras.service;

import com.api.corridadasblogueiras.model.UserModel;
import com.api.corridadasblogueiras.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public List<UserModel> findAllUsers(){
        return userRepository.findAll();
    }

    public Optional<UserModel> findUserById(Long id){
        return userRepository.findById(id);
    }

    public UserModel saveUserModel(UserModel user){
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("Name can't be null or empty");
        }
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        }
    }
}
