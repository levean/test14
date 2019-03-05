package com.zfkr.achievement.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zfkr.achievement.bean.Achievement;
import com.zfkr.achievement.dao.AchievementMapper;
import com.zfkr.achievement.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:xiongwei
 * @time: 2019/03/05上午 9:54
 * @description: TODO
 **/
@Service("achievementService")
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementMapper achievementMapper;

    @Override
    public PageInfo<Achievement> getAchList() {
        PageHelper.startPage(5,10);
        List<Achievement> achList = achievementMapper.getAchList();
        PageInfo<Achievement> achievementPageInfo = new PageInfo<>(achList);
        return achievementPageInfo;
    }
}
