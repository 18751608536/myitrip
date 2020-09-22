package com.itrip.dao;

import com.itrip.beans.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 根据参数分页查询用户
     * @param params
     * @return
     */
    List<User> getUsers(Map<String,Object> params);

    /**
     * 根据参数查询个数
     * @param params
     * @return
     */
    int getUserCountParams(Map<String,Object> params);
}
