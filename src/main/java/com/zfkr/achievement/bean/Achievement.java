package com.zfkr.achievement.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Achievement implements Serializable {
    private Integer aId;

    private Integer type;

    private Integer contractId;

    private String contractCode;

    private String customerCode;

    private String houseCode;

    private Integer contType;

    private Date signDate;

    private BigDecimal receiCommission;

    private BigDecimal damagesfee;

    private BigDecimal money;

    private Integer result;

    private Integer auditorId;

    private String auditor;

    private String auditorDepartment;

    private Date examineDate;

    private String remark;

    private Integer createBy;

    private String createByName;

    private Integer createDepId;

    private String createDepName;

    private Date createTime;

    private Integer updateBy;

    private String updateByName;

    private Date updateTime;

    private Integer isDel;

    private Integer preAuditId;

    private String preAuditName;

    private Integer nextAuditId;

    private String nextAuditName;

    private Integer flowInstanceId;

    private Integer cityId;

    private List<Distribution> distributions;

    public List<Distribution> getDistributions() {
        return distributions;
    }

    public void setDistributions(List<Distribution> distributions) {
        this.distributions = distributions;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode == null ? null : houseCode.trim();
    }

    public Integer getContType() {
        return contType;
    }

    public void setContType(Integer contType) {
        this.contType = contType;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public BigDecimal getReceiCommission() {
        return receiCommission;
    }

    public void setReceiCommission(BigDecimal receiCommission) {
        this.receiCommission = receiCommission;
    }

    public BigDecimal getDamagesfee() {
        return damagesfee;
    }

    public void setDamagesfee(BigDecimal damagesfee) {
        this.damagesfee = damagesfee;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getAuditorDepartment() {
        return auditorDepartment;
    }

    public void setAuditorDepartment(String auditorDepartment) {
        this.auditorDepartment = auditorDepartment == null ? null : auditorDepartment.trim();
    }

    public Date getExamineDate() {
        return examineDate;
    }

    public void setExamineDate(Date examineDate) {
        this.examineDate = examineDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Integer getCreateDepId() {
        return createDepId;
    }

    public void setCreateDepId(Integer createDepId) {
        this.createDepId = createDepId;
    }

    public String getCreateDepName() {
        return createDepName;
    }

    public void setCreateDepName(String createDepName) {
        this.createDepName = createDepName == null ? null : createDepName.trim();
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

    public Integer getPreAuditId() {
        return preAuditId;
    }

    public void setPreAuditId(Integer preAuditId) {
        this.preAuditId = preAuditId;
    }

    public String getPreAuditName() {
        return preAuditName;
    }

    public void setPreAuditName(String preAuditName) {
        this.preAuditName = preAuditName == null ? null : preAuditName.trim();
    }

    public Integer getNextAuditId() {
        return nextAuditId;
    }

    public void setNextAuditId(Integer nextAuditId) {
        this.nextAuditId = nextAuditId;
    }

    public String getNextAuditName() {
        return nextAuditName;
    }

    public void setNextAuditName(String nextAuditName) {
        this.nextAuditName = nextAuditName == null ? null : nextAuditName.trim();
    }

    public Integer getFlowInstanceId() {
        return flowInstanceId;
    }

    public void setFlowInstanceId(Integer flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aId=").append(aId);
        sb.append(", type=").append(type);
        sb.append(", contractId=").append(contractId);
        sb.append(", contractCode=").append(contractCode);
        sb.append(", customerCode=").append(customerCode);
        sb.append(", houseCode=").append(houseCode);
        sb.append(", contType=").append(contType);
        sb.append(", signDate=").append(signDate);
        sb.append(", receiCommission=").append(receiCommission);
        sb.append(", damagesfee=").append(damagesfee);
        sb.append(", money=").append(money);
        sb.append(", result=").append(result);
        sb.append(", auditorId=").append(auditorId);
        sb.append(", auditor=").append(auditor);
        sb.append(", auditorDepartment=").append(auditorDepartment);
        sb.append(", examineDate=").append(examineDate);
        sb.append(", remark=").append(remark);
        sb.append(", createBy=").append(createBy);
        sb.append(", createByName=").append(createByName);
        sb.append(", createDepId=").append(createDepId);
        sb.append(", createDepName=").append(createDepName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateByName=").append(updateByName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", preAuditId=").append(preAuditId);
        sb.append(", preAuditName=").append(preAuditName);
        sb.append(", nextAuditId=").append(nextAuditId);
        sb.append(", nextAuditName=").append(nextAuditName);
        sb.append(", flowInstanceId=").append(flowInstanceId);
        sb.append(", cityId=").append(cityId);
        sb.append("]");
        return sb.toString();
    }

    public Achievement(Integer aId, Integer type, Integer contractId, String contractCode, String customerCode, String houseCode, Integer contType, Date signDate, BigDecimal receiCommission, BigDecimal damagesfee, BigDecimal money, Integer result, Integer auditorId, String auditor, String auditorDepartment, Date examineDate, String remark, Integer createBy, String createByName, Integer createDepId, String createDepName, Date createTime, Integer updateBy, String updateByName, Date updateTime, Integer isDel, Integer preAuditId, String preAuditName, Integer nextAuditId, String nextAuditName, Integer flowInstanceId, Integer cityId, List<Distribution> distributions) {
        this.aId = aId;
        this.type = type;
        this.contractId = contractId;
        this.contractCode = contractCode;
        this.customerCode = customerCode;
        this.houseCode = houseCode;
        this.contType = contType;
        this.signDate = signDate;
        this.receiCommission = receiCommission;
        this.damagesfee = damagesfee;
        this.money = money;
        this.result = result;
        this.auditorId = auditorId;
        this.auditor = auditor;
        this.auditorDepartment = auditorDepartment;
        this.examineDate = examineDate;
        this.remark = remark;
        this.createBy = createBy;
        this.createByName = createByName;
        this.createDepId = createDepId;
        this.createDepName = createDepName;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateByName = updateByName;
        this.updateTime = updateTime;
        this.isDel = isDel;
        this.preAuditId = preAuditId;
        this.preAuditName = preAuditName;
        this.nextAuditId = nextAuditId;
        this.nextAuditName = nextAuditName;
        this.flowInstanceId = flowInstanceId;
        this.cityId = cityId;
        this.distributions = distributions;
    }

    public Achievement() {
    }
}