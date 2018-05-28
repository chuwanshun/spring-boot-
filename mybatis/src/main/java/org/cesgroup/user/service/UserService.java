package org.cesgroup.user.service;

import org.cesgroup.user.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String addUser(User user);
    String addUserByCount(String ChildId,String ParentId,int count);
    int deleteAllUsers();

}
