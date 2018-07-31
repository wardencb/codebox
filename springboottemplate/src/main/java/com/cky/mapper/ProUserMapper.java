package com.cky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cky.entity.ProUser;

@Mapper
@Repository
public interface ProUserMapper<T extends ProUser> extends BaseMapper<T> {

}
