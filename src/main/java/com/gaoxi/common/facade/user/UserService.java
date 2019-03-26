package com.gaoxi.common.facade.user;

import com.gaoxi.common.entity.user.UserEntity;
import com.gaoxi.common.req.User.LoginReq;

public interface UserService {
    public UserEntity login();
}
