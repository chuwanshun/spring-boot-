package org.cesgroup.user.controller;

import org.cesgroup.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/addUserByCount")
    public String addUser(String cid,String pid ,String count){

       return userService.addUserByCount(cid,pid,Integer.parseInt(count==null?"100":count));
    }
    @RequestMapping(value="/deleteAll")
    public int deleteAllUsers(){
      
      return userService.deleteAllUsers();
    }

}
