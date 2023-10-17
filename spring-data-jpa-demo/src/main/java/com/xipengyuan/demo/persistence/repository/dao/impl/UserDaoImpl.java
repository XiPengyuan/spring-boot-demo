package com.xipengyuan.demo.persistence.repository.dao.impl;

import com.xipengyuan.demo.persistence.repository.dao.UserDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

}
