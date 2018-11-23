package com.yzb.pad.api;

import com.yzb.pad.common.ServerResponse;
import com.yzb.pad.pojo.Bucket;
import com.yzb.pad.pojo.Bunker;
import com.yzb.pad.service.IBunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


/**
 * Created by brander on 2018/9/23
 */
@RestController
@RequestMapping("v1/bunker")
public class BunkerApi {
    private Logger logger = Logger.getLogger(Bucket.class.getName());

    @Autowired
    private IBunkerService bunkerService;

    @PostMapping("save")
    public ServerResponse<String> save(Bucket bucket) {
        logger.info("====bucket==> " + bucket.toString());
        Bunker bunker = new Bunker();
        bunker.setBunker(bucket.getIdName());
        bunker.setRaw(bucket.getBucketName());
        bunker.setWeight(bucket.getWeight());
        bunker.setBatch(bucket.getBucketNumber());
        if (bunkerService.saveBunker(bunker)) {
            logger.info("====bucket==> success");
            return ServerResponse.createBySuccess();
        }
        logger.info("====bucket==> error");
        return ServerResponse.createByError();
    }


    @GetMapping("list")
    public ServerResponse list() {
        return ServerResponse.createBySuccess("SUCCESS", bunkerService.listBunker());
    }

}
