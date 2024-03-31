package com.szy.springbootinit.mapper;

import com.szy.springbootinit.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
* @author lenovo
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-03-27 19:03:24
* @Entity com.szy.springbootinit.model.entity.User
*/

public interface UserMapper extends BaseMapper<User> {

}




