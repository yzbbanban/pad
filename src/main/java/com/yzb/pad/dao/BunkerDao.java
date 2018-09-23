package com.yzb.pad.dao;

import com.yzb.pad.pojo.Bunker;

import java.util.List;

/**
 * Created by brander on 2018/9/23
 */
public interface BunkerDao {
    /**
     * 获取单个 bunker
     *
     * @param bunker id
     * @return bunker 详情
     */
    Bunker selectByPrimaryKey(String bunker);

    /**
     *
     * @return 列表
     */
    List<Bunker> listBunkerByPage();
}
