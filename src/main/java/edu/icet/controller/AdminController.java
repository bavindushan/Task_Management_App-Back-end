package edu.icet.controller;

import edu.icet.dto.Admin;
import edu.icet.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    final AdminService service;

    @PostMapping("/create")
    public void addAdmin(@RequestBody Admin admin){
        service.addAdmin(admin);
    }

    @PutMapping("/update")
    public void updateAdmin(@RequestBody Admin admin){
        service.update(admin);
    }

    @GetMapping("/get-all")
    public List<Admin> getAll(){
        return service.getAll();
    }
}
