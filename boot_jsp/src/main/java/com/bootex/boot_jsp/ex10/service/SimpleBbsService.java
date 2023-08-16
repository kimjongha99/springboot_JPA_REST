package com.bootex.boot_jsp.ex10.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootex.boot_jsp.ex10.dao.ISimpleBbsDao;
import com.bootex.boot_jsp.ex10.dto.SimpleBbsDto;

@Service
public class SimpleBbsService implements ISimpleBbsService {

    @Autowired
    ISimpleBbsDao dao;

    @Override
    public List<SimpleBbsDto> list() {
        return dao.listDao();
    }

    @Override
    public SimpleBbsDto view(String id) {
        return dao.viewDao(id);
    }

    @Override
    public int write(Map<String, String> map) {
        int nResult = dao.writeDao(map);
        return nResult;
    }

    @Override
    public int delete(String id) {
        int nResult = dao.deleteDao(id);
        return nResult;
    }

    @Override
    public int count() {
        int nTotalCount = dao.articleCount();
        return nTotalCount;
    }

}
