package com.zfkr.achievement.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.zfkr.achievement.bean.Achievement;
import com.zfkr.achievement.service.AchievementService;
import com.zfkr.achievement.utils.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:xiongwei
 * @time: 2019/03/05上午 9:56
 * @description: TODO
 **/
@RestController
@RequestMapping("/achievement")
public class AchievementController {

    @Autowired
    private AchievementService achievementService;
    
    @GetMapping("/getAchList")
    public ResponseModel getAchList(){
        PageInfo<Achievement> achList = achievementService.getAchList();
        return ResponseModel.newFailure(200,"成功",achList);
    }
}
