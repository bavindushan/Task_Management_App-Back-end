package edu.icet.service;

import edu.icet.dto.Chat;

import java.util.List;

public interface ChatService {
    void addChat(Chat chat);

    void deleteChat(Integer id);

    List<Chat> getAll();
}
