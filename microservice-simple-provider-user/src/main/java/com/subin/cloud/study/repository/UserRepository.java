package com.subin.cloud.study.repository;

import com.subin.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: userDao
 * @version: 1.0
 * @author: wangsubin
 * @Date: 2018/11/19 16:45
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
