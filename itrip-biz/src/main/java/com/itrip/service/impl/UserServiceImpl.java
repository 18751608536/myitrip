package com.itrip.service.impl;

import com.itrip.beans.pojo.User;
import com.itrip.common.Page;
import com.itrip.dao.UserMapper;
import com.itrip.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public Page<User> getPageUsers(int pageIndex,String userName) {
        int pageSize = 5;
        Map<String,Object> params = new HashMap<>();
        params.put("userName",userName);
        params.put("from",(pageIndex-1)*pageSize);
        params.put("limit",pageSize);
        List<User> users = userMapper.getUsers(params);
        int totalCount = userMapper.getUserCountParams(params);
        Page<User> pageUsers = new Page<>(pageIndex,pageSize,totalCount,users);
        return pageUsers;
    }
}
