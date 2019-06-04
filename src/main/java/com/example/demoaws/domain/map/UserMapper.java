package com.example.demoaws.domain.map;


import com.example.demoaws.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {


    @Select("select * from tbl_user where name= #{name}")
    User findByName(@Param("name") String name);
}
