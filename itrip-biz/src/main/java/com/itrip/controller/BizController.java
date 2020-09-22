package com.itrip.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.User;
import com.itrip.common.DtoUtil;
import com.itrip.common.Page;
import com.itrip.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BizController {
    @Resource
    UserService userService;
    @RequestMapping("/display")
    @ResponseBody
    public Dto display(@RequestParam(value="page",required = true,defaultValue = "1") int pageIndex,
                       @RequestParam(value="name",required = false)String userName){
        //查询分页的用户信息
        Page<User> pageUsers = userService.getPageUsers(pageIndex, userName);
        return  DtoUtil.returnDataSuccess(pageUsers);
    }
}
