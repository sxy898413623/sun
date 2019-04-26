package com.sxy.demo.dao;

import com.sxy.demo.po.TransactionDetail;
import com.sxy.demo.po.TransactionDetailKey;
import feign.Param;

import java.util.List;

public interface TransactionDetailMapper {
    int deleteByPrimaryKey(TransactionDetailKey key);

    int truncate();

    int insert(TransactionDetail record);

    int insertSelective(TransactionDetail record);

    TransactionDetail selectByPrimaryKey(TransactionDetailKey key);

    List<TransactionDetail> selectByAddress(@Param("address") String address);

    int updateByPrimaryKeySelective(TransactionDetail record);

    int updateByPrimaryKey(TransactionDetail record);
}