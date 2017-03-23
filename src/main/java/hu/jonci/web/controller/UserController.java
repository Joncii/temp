package hu.jonci.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.jonci.dal.entity.ProductEntity;
import hu.jonci.dal.entity.UserEntity;
import hu.jonci.dal.repository.UserRepository;

@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserEntity getFirstUser(){
        return userRepository.findAll().iterator().next();
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public UserEntity addUser(){
        UserEntity entity = new UserEntity();
        entity.setEmail("jonasgerg@gmail.com");
        entity.setPassword("temp");
        ProductEntity product = new ProductEntity();
        product.setName("Dildo");
        product.setDescription("Feels good");
        entity.setProduct(product);
        return userRepository.insert(entity);
    }
    
}
