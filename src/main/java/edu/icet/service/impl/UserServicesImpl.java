package edu.icet.service.impl;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
}
