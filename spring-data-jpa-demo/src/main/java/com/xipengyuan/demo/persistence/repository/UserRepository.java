package com.xipengyuan.demo.persistence.repository;

import com.xipengyuan.demo.persistence.entity.UserEntity;
import com.xipengyuan.demo.persistence.repository.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>, UserDao {
}
