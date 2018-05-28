package org.cesgroup.user.dao;

import org.apache.ibatis.annotations.Mapper;
import org.cesgroup.user.entity.User;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String cid);
    int deleteAllUsers();

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}