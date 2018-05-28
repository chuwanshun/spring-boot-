package org.cesgroup.user.service.impl;

import javax.print.attribute.standard.NumberUp;

import org.apache.ibatis.jdbc.Null;
import org.cesgroup.user.dao.UserMapper;
import org.cesgroup.user.entity.User;
import org.cesgroup.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.StringUtils;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String addUser(User user) {

        try{
            userMapper.insert(user);
            return "插入成功";
        }
        catch (Exception e){
            return "插入失败";
        }
    }
    @Override
    public String addUserByCount(String childId,String parentId, int count) {
        try{
            int userInsertCount=0;
            for(int i=0;i<=count;i++){
                User user_new =new User();
                if(org.springframework.util.StringUtils.isEmpty(childId)){
                  return "请指定插入cid名称！！";
                }else{
                  user_new.setCid(childId+i);
                }
                if(!org.springframework.util.StringUtils.isEmpty(parentId)){
                  user_new.setPid(parentId+i);
                }
                if(userMapper.selectByPrimaryKey(user_new.getCid())==null){
                  userMapper.insert(user_new);
                }else{
                  userMapper.updateByPrimaryKey(user_new);
                }
                
                userInsertCount++;

            }
            return "插入成功"+userInsertCount+"条";
        }
        catch (Exception e){
        	System.out.println(e);
            return "插入失败";
        }

    }
    @Override
    public int deleteAllUsers() {
      // TODO Auto-generated method stub
      
      return userMapper.deleteAllUsers();
    }
}
