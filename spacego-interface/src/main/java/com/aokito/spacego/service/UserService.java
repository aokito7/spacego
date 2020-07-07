package com.aokito.spacego.service;

import com.aokito.spacego.bean.UserInfo;

public interface UserService {
    public void addUserInfo(UserInfo userInfo);
    public UserInfo getUserInfo(String id);
}
