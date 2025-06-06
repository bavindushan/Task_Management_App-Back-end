package edu.icet.controller;

import edu.icet.dto.User;
import edu.icet.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    final UserServices services;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        services.addUser(user);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateUser(@RequestBody User user){
        services.updateUser(user);
    }

    @GetMapping("/get-all")
    public List<User> getAll(){
        return services.getAll();
    }
}
