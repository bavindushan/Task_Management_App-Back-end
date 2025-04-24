package edu.icet.service;

import edu.icet.dto.Admin;

import java.util.List;

public interface AdminService {
    void addAdmin(Admin admin);

    void update(Admin admin);

    List<Admin> getAll();
}
