package ru.smal.service;

import org.hibernate.SessionFactory;
import ru.smal.dao.Dao;
import ru.smal.dao.impl.AdminDaoImpl;
import ru.smal.model.Admin;

import java.util.List;

public class AdminService {

    private final Dao<Admin, Integer> adminDao;

    public AdminService(SessionFactory factory) {
        this.adminDao = new AdminDaoImpl(factory);
    }

    public Admin findById(int id) {
        return adminDao.findById(id);
    }

    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    public boolean save(Admin admin) {
        return adminDao.save(admin);
    }

    public void update(Admin admin) {
        adminDao.update(admin);
    }

    public void delete(Admin admin) {
        adminDao.delete(admin);
    }
}