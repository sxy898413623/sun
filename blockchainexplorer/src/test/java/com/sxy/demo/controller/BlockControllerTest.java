package com.sxy.demo.controller;

import com.sxy.demo.dto.BlockListDTO;
import com.sxy.demo.po.Block;
import com.sxy.demo.service.BlockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlockControllerTest {

    @Autowired
   private BlockService blockService;

    @Autowired
    private BlockController blockController;

    @Test
    public void getRecentBlocks() throws Throwable {
       List<Block> blocks = blockService.selectRecent();
        List<BlockListDTO> recentBlocks = blockController.getRecentBlocks();
        assertEquals(5,recentBlocks.size());
    }
}