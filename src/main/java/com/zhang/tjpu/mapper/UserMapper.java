package com.zhang.tjpu.mapper;

import com.zhang.tjpu.entity.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    //用户注册
    @Insert("INSERT INTO user(id,name,age)"
            + "VALUES(#{id},#{name},#{age})")
    @Options(useGeneratedKeys = true,keyColumn = "id")
    void addUser(User user);

    //更新年龄
    @Update("UPDATE user SET age=100 WHERE id=#{id}")
    void setUserAge(Integer id);

    //根据id检查用户
    @Select("SELECT * FROM user WHERE id=#{id}")
    User getUserById(@Param("id")Integer id);

    //根据Id和Age检查用户
    @Select("SELECT * FROM sign WHERE id=#{id} and age=#{age}")
    User getUserByIdAndAge(@Param("id")Integer id,
                           @Param("age")Integer age);

    //用户签到,signState=1,signTime=#{signTime}
    @Update("UPDATE user SET signState=1 ,signTime=#{signTime}WHERE id=#{id}")
    void userSignIn(User user);

    //用户签到,signState=1
    @Update("UPDATE user SET signState=1,signTime=#{signTime} WHERE id=#{id} and age=#{age}")
    void setSignState(@Param("signTime") String signTime,
                      @Param("id")Integer id,
                      @Param("age")Integer age);
}
