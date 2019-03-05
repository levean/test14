package com.zfkr.achievement.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.zfkr.achievement.bean.Achievement;

public interface AchievementService {

    PageInfo<Achievement> getAchList();
}
