package com.itrip.service;

import com.itrip.beans.pojo.User;
import com.itrip.common.Page;

/**
 * 用户业务的逻辑服务接口
 */
public interface UserService {
    /**
     * 分页查询用户
     * @param pageIndex
     * @param pageSize
     * @param userName
     * @return
     */
    Page<User> getPageUsers(int pageIndex,String userName);
}
