package com.zfkr.achievement.utils;

import java.util.ArrayList;

/**
 * @author:xiongwei
 * @time: 2019/03/05下午 4:06
 * @description: TODO
 **/
public class MyPageInfo {
    private static final Integer DEFALUT_PAGENUM = 1;
    private static final Integer DEFALUT_PAESIZE = 10;

    private Integer pageSize;

    private Integer pageNum;

    /**
     * 排序字段： price_asc,...
     */
    private String orderBy;

    public Integer getPageSize() {
        if (pageSize == null) {
            return DEFALUT_PAESIZE;
        }

        return pageSize;
    }

    public Integer getPageNum() {
        if (pageNum == null) {
            return DEFALUT_PAGENUM;
        }

        return pageNum;
    }

    /**
     * input: price_asc,...
     * out: price asc,...
     * @return
     */
    public String[] getOrderBy() {
        if (orderBy != null) {
            String[] orderBys = orderBy.split(",");
            ArrayList<String> orderByArrList = new ArrayList<>();

            if (orderBys.length > 0) {
                for (int i = 0; i < orderBys.length; i++) {
                    String orderBy = orderBys[i];
                    orderBy = orderBy.replace("_asc", " asc").replace("_desc", " desc");

                    orderByArrList.add(orderBy);
                }

                if (orderByArrList.size() >= 1) {
                    String[] orderByCondition = new String[orderByArrList.size()];
                    orderByArrList.toArray(orderByCondition);
                    return orderByCondition;
                }
            }
        }

        return new String[0];
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
