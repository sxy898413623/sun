package com.sxy.demo.service.impl;

import com.sxy.demo.dao.BlockMapper;
import com.sxy.demo.po.Block;
import com.sxy.demo.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<Block> selectRecent() {
        List<Block> blocks = blockMapper.selectRecent();
        return blocks;
    }

    @Override
    public Block getBlockDetail(String blockhash) {
        Block block = blockMapper.selectByPrimaryKey(blockhash);
        return block;
    }
}
