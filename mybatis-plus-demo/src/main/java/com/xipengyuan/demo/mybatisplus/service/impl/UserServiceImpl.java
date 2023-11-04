package com.xipengyuan.demo.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xipengyuan.demo.mybatisplus.dal.entity.UserEntity;
import com.xipengyuan.demo.mybatisplus.dal.mapper.UserMapper;
import com.xipengyuan.demo.mybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
}
