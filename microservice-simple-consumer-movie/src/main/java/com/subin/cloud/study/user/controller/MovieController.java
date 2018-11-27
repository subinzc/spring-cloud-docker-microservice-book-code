package com.subin.cloud.study.user.controller;

import com.subin.cloud.study.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 请求
 * @version: 1.0
 * @author: wangsubin
 * @Date: 2018/11/23 10:58
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        //封装了返回的响应信息,包括 响应状态,响应头 和 响应体.
        //ResponseEntity<User> entity = restTemplate.getForEntity("http://localhost:8000/" + id, User.class);

        //响应体
        return restTemplate.getForObject(userServiceUrl+id,User.class);
    }


}
