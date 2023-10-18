package com.xipengyuan.demo.persistence.repository.dao.impl;

import com.xipengyuan.demo.persistence.entity.UserEntity;
import com.xipengyuan.demo.persistence.repository.dao.UserDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Root;
import org.springframework.util.Assert;

class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Integer findUserAgeByName(String name) {
        Assert.notNull(name, "User name cannot be null");

        CriteriaBuilder builder = em.getCriteriaBuilder();

        var criteriaQuery = builder.createQuery(Integer.class);
        Root<UserEntity> root = criteriaQuery.from(UserEntity.class);
        criteriaQuery.select(root.get("age"))
                .where(builder.equal(root.get("name"), name));

        var typedQuery = em.createQuery(criteriaQuery);
        return typedQuery.getSingleResult();
    }
}
