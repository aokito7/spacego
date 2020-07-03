package com.aokito.spacego.usermanage.service;

import com.aokito.spacego.usermanage.bean.UserInfo;

public interface UserService {
    public void addUserInfo(UserInfo userInfo);
    public UserInfo getUserInfo(String id);
}
