package edu.icet.service.impl;

import edu.icet.dto.Chat;
import edu.icet.dto.Task;
import edu.icet.entity.ChatEntity;
import edu.icet.repository.ChatRepository;
import edu.icet.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    final ChatRepository repository;
    final ModelMapper mapper;

    @Override
    public void addChat(Chat chat) {
        repository.save(mapper.map(chat, ChatEntity.class));
    }

    @Override
    public void deleteChat(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Chat> getAll() {
        ArrayList<Chat> list = new ArrayList<>();
        List<ChatEntity> all = repository.findAll();

        all.forEach(chatEntity -> list.add(mapper.map(chatEntity, Chat.class)));
        return list;
    }
}
