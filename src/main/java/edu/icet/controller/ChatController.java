package edu.icet.controller;

import edu.icet.dto.Chat;
import edu.icet.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatController {

    final ChatService service;

    @PostMapping("/create")
    public void addChat(@RequestBody Chat chat){
        service.addChat(chat);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteChat(@PathVariable Integer id){
        service.deleteChat(id);
    }

    @GetMapping("/get-all")
    public List<Chat> getAll(){
        return service.getAll();
    }
}
