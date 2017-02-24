/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.util;

import java.util.List;
/**
 * 
 * 分页封装类
 * @author Ry-wk
 *
 * @param <T>
 */
public class PageResults<T> {
	// 下一页
    private Integer pageNo;
 
    // 当前页
    private Integer currentPage;
 
    // 每页个个数
    private Integer pageSize;
 
    // 总条数
    private Integer totalCount;
 
    // 总页数
    private Integer pageCount;
 
    // 记录
    private List<T> results;
 
    public Integer getPageCount() {
        return pageCount;
    }
 
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
 
    public Integer getPageNo() {
        if (pageNo == null || pageNo <= 0) {
            return 1;
        } else{
            return pageNo > pageCount ? pageCount : pageNo;
        }
    }
 
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
 
    public List<T> getResults() {
        return results;
    }
 
    public void setResults(List<T> results) {
        this.results = results;
    }
 
    public Integer getCurrentPage() {
        return currentPage;
    }
 
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
 
    public Integer getPageSize() {
        return pageSize;
    }
 
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize <= 0 ? 10 : pageSize;
    }
 
    public Integer getTotalCount() {
        return totalCount;
    }
 
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
 
    public void resetPageNo() {
        pageNo = currentPage + 1;
        pageCount = totalCount % pageSize == 0 ? totalCount / pageSize
                : totalCount / pageSize + 1;
    }
}
