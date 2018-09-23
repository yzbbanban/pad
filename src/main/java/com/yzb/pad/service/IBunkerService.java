package com.yzb.pad.service;

import com.yzb.pad.pojo.Bunker;

import java.util.List;

/**
 * Created by brander on 2018/9/22
 */
public interface IBunkerService {

    boolean saveBunker(Bunker bunker);

    List<Bunker> listBunker();

}
