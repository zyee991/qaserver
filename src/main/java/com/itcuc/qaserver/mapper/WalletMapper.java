package com.itcuc.qaserver.mapper;

import com.itcuc.qaserver.model.Wallet;

public interface WalletMapper {
    int deleteByPrimaryKey(String id);

    int insert(Wallet record);

    int insertSelective(Wallet record);

    Wallet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Wallet record);

    int updateByPrimaryKey(Wallet record);
}