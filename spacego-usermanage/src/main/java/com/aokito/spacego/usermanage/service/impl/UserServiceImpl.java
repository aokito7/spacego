package com.aokito.spacego.usermanage.service.impl;

import com.aokito.spacego.bean.UserInfo;
import com.aokito.spacego.service.UserService;
import com.aokito.spacego.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public void addUserInfo(UserInfo userInfo){
        userInfoMapper.insertSelective(userInfo);
    }

    public UserInfo getUserInfo(String id){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return userInfo;
    }
}
