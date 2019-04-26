package com.sxy.demo.service;

import com.sxy.demo.po.Block;

import java.util.List;

public interface BlockService {
    List<Block> selectRecent();
    Block getBlockDetail(String blockhash);
}
