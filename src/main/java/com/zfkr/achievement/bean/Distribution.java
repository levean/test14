package com.zfkr.achievement.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Distribution implements Serializable {
    private Integer dId;

    private Integer contractId;

    private String contractCode;

    private Integer storefront3Id;

    private String level3;

    private Integer storefront4Id;

    private String level4;

    private Integer assignorId;

    private String assignor;

    private Integer roleType;

    private BigDecimal ratio;

    private Integer isJob;

    private Integer shopkeeperId;

    private String shopkeeper;

    private Integer amaldarId;

    private String amaldar;

    private Integer managerId;

    private String manager;

    private Integer place;

    private Integer agentExamine;

    private String agentRemark;

    private BigDecimal aMoney;

    private BigDecimal agentReceipts;

    private BigDecimal agentplatformFee;

    private BigDecimal agentpayFee;

    private BigDecimal platformFeeRatio;

    private BigDecimal sAchievement;

    private BigDecimal sCost;

    private BigDecimal sMoney;

    private Integer createBy;

    private String createByName;

    private Date createTime;

    private Integer updateBy;

    private String updateByName;

    private Date updateTime;

    private Integer isDel;

    private static final long serialVersionUID = 1L;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode == null ? null : contractCode.trim();
    }

    public Integer getStorefront3Id() {
        return storefront3Id;
    }

    public void setStorefront3Id(Integer storefront3Id) {
        this.storefront3Id = storefront3Id;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3 == null ? null : level3.trim();
    }

    public Integer getStorefront4Id() {
        return storefront4Id;
    }

    public void setStorefront4Id(Integer storefront4Id) {
        this.storefront4Id = storefront4Id;
    }

    public String getLevel4() {
        return level4;
    }

    public void setLevel4(String level4) {
        this.level4 = level4 == null ? null : level4.trim();
    }

    public Integer getAssignorId() {
        return assignorId;
    }

    public void setAssignorId(Integer assignorId) {
        this.assignorId = assignorId;
    }

    public String getAssignor() {
        return assignor;
    }

    public void setAssignor(String assignor) {
        this.assignor = assignor == null ? null : assignor.trim();
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public Integer getIsJob() {
        return isJob;
    }

    public void setIsJob(Integer isJob) {
        this.isJob = isJob;
    }

    public Integer getShopkeeperId() {
        return shopkeeperId;
    }

    public void setShopkeeperId(Integer shopkeeperId) {
        this.shopkeeperId = shopkeeperId;
    }

    public String getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(String shopkeeper) {
        this.shopkeeper = shopkeeper == null ? null : shopkeeper.trim();
    }

    public Integer getAmaldarId() {
        return amaldarId;
    }

    public void setAmaldarId(Integer amaldarId) {
        this.amaldarId = amaldarId;
    }

    public String getAmaldar() {
        return amaldar;
    }

    public void setAmaldar(String amaldar) {
        this.amaldar = amaldar == null ? null : amaldar.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getAgentExamine() {
        return agentExamine;
    }

    public void setAgentExamine(Integer agentExamine) {
        this.agentExamine = agentExamine;
    }

    public String getAgentRemark() {
        return agentRemark;
    }

    public void setAgentRemark(String agentRemark) {
        this.agentRemark = agentRemark == null ? null : agentRemark.trim();
    }

    public BigDecimal getaMoney() {
        return aMoney;
    }

    public void setaMoney(BigDecimal aMoney) {
        this.aMoney = aMoney;
    }

    public BigDecimal getAgentReceipts() {
        return agentReceipts;
    }

    public void setAgentReceipts(BigDecimal agentReceipts) {
        this.agentReceipts = agentReceipts;
    }

    public BigDecimal getAgentplatformFee() {
        return agentplatformFee;
    }

    public void setAgentplatformFee(BigDecimal agentplatformFee) {
        this.agentplatformFee = agentplatformFee;
    }

    public BigDecimal getAgentpayFee() {
        return agentpayFee;
    }

    public void setAgentpayFee(BigDecimal agentpayFee) {
        this.agentpayFee = agentpayFee;
    }

    public BigDecimal getPlatformFeeRatio() {
        return platformFeeRatio;
    }

    public void setPlatformFeeRatio(BigDecimal platformFeeRatio) {
        this.platformFeeRatio = platformFeeRatio;
    }

    public BigDecimal getsAchievement() {
        return sAchievement;
    }

    public void setsAchievement(BigDecimal sAchievement) {
        this.sAchievement = sAchievement;
    }

    public BigDecimal getsCost() {
        return sCost;
    }

    public void setsCost(BigDecimal sCost) {
        this.sCost = sCost;
    }

    public BigDecimal getsMoney() {
        return sMoney;
    }

    public void setsMoney(BigDecimal sMoney) {
        this.sMoney = sMoney;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName == null ? null : createByName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateByName() {
        return updateByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName == null ? null : updateByName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dId=").append(dId);
        sb.append(", contractId=").append(contractId);
        sb.append(", contractCode=").append(contractCode);
        sb.append(", storefront3Id=").append(storefront3Id);
        sb.append(", level3=").append(level3);
        sb.append(", storefront4Id=").append(storefront4Id);
        sb.append(", level4=").append(level4);
        sb.append(", assignorId=").append(assignorId);
        sb.append(", assignor=").append(assignor);
        sb.append(", roleType=").append(roleType);
        sb.append(", ratio=").append(ratio);
        sb.append(", isJob=").append(isJob);
        sb.append(", shopkeeperId=").append(shopkeeperId);
        sb.append(", shopkeeper=").append(shopkeeper);
        sb.append(", amaldarId=").append(amaldarId);
        sb.append(", amaldar=").append(amaldar);
        sb.append(", managerId=").append(managerId);
        sb.append(", manager=").append(manager);
        sb.append(", place=").append(place);
        sb.append(", agentExamine=").append(agentExamine);
        sb.append(", agentRemark=").append(agentRemark);
        sb.append(", aMoney=").append(aMoney);
        sb.append(", agentReceipts=").append(agentReceipts);
        sb.append(", agentplatformFee=").append(agentplatformFee);
        sb.append(", agentpayFee=").append(agentpayFee);
        sb.append(", platformFeeRatio=").append(platformFeeRatio);
        sb.append(", sAchievement=").append(sAchievement);
        sb.append(", sCost=").append(sCost);
        sb.append(", sMoney=").append(sMoney);
        sb.append(", createBy=").append(createBy);
        sb.append(", createByName=").append(createByName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateByName=").append(updateByName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}