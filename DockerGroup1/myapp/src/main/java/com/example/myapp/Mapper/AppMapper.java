package com.example.myapp.Mapper;

import com.example.myapp.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AppMapper {
    /*
     * @param id
     */
    @Select("select * from user where id=#{id}")
    User getUserById(Long id);
}
