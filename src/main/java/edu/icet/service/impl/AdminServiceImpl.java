package edu.icet.service.impl;

import edu.icet.dto.Admin;
import edu.icet.entity.AdminEntity;
import edu.icet.repository.AdminRepository;
import edu.icet.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    final AdminRepository repository;
    final ModelMapper mapper;
    @Override
    public void addAdmin(Admin admin) {
        repository.save(mapper.map(admin, AdminEntity.class));
    }

    @Override
    public void update(Admin admin) {
        repository.save(mapper.map(admin, AdminEntity.class));
    }

    @Override
    public List<Admin> getAll() {
        ArrayList<Admin> list = new ArrayList<>();
        List<AdminEntity> all = repository.findAll();

        all.forEach(adminEntity -> list.add(mapper.map(adminEntity, Admin.class)));

        return list;
    }
}
