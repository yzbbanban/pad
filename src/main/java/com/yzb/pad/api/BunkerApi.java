package com.yzb.pad.api;

import com.yzb.pad.common.ServerResponse;
import com.yzb.pad.pojo.Bunker;
import com.yzb.pad.service.IBunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by brander on 2018/9/23
 */
@RestController
@RequestMapping("v1/bunker")
public class BunkerApi {

    @Autowired
    private IBunkerService bunkerService;

    @PostMapping("save")
    public ServerResponse<String> save(Bunker bunker){

        return ServerResponse.createBySuccess();
    }


    @GetMapping("list")
    public ServerResponse list(Integer pageSize,Integer pageNum){
        return ServerResponse.createBySuccess(bunkerService.listBunker());
    }

}
