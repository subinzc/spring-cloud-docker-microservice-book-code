package com.subin.cloud.study.controller;


import com.subin.cloud.study.entity.User;
import com.subin.cloud.study.repository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @version: 1.0
 * @author: wangsubin
 * @Date: 2018/11/19 16:49
 */
@RestController
public class UserController {

    private static final Log LOG = LogFactory.getLog(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        LOG.info("查询客户信息,id:"+id);
        User findOne = userRepository.findOne(id);
        //List<User> all = userRepository.findAll();
        return findOne;
    }
}
