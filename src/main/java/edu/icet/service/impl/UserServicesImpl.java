package edu.icet.service.impl;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServicesImpl implements UserServices {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public void updateUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public List<User> getAll() {
        ArrayList<User> list = new ArrayList<>();
        List<UserEntity> all = repository.findAll();

        all.forEach(userEntity -> list.add(mapper.map(userEntity, User.class)));

        return list;
    }
}
