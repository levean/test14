package com.zfkr.achievement.dao;

import com.zfkr.achievement.bean.Distribution;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("distributionMapper")
public interface DistributionMapper {

    List<Distribution> getDistributionByContId(@Param("contractId")Integer contractId);

}