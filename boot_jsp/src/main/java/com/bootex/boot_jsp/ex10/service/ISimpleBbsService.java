package com.bootex.boot_jsp.ex10.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bootex.boot_jsp.ex10.dto.SimpleBbsDto;

public interface ISimpleBbsService {

    public List<SimpleBbsDto> list();
    public SimpleBbsDto view(String id);
    public int write(Map<String, String> map);
    public int delete(@Param("_id")String id);
    public int count();
}
