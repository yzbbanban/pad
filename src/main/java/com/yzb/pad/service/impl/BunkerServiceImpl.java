package com.yzb.pad.service.impl;

import com.yzb.pad.dao.BunkerDao;
import com.yzb.pad.pojo.Bunker;
import com.yzb.pad.service.IBunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by brander on 2018/9/22
 */
@Service
public class BunkerServiceImpl implements IBunkerService{

    @Autowired
    private BunkerDao bunkerDao;

    @Override
    public boolean saveBunker(Bunker bunker) {
        return false;
    }

    @Override
    public List<Bunker> listBunker() {
        return bunkerDao.listBunkerByPage();
    }
}
