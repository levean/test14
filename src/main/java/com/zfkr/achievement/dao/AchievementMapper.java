package com.zfkr.achievement.dao;

import com.zfkr.achievement.bean.Achievement;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("achievementMapper")
public interface AchievementMapper {

    List<Achievement> getAchList();

}