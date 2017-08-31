package com.lm.ttshop.service.impl;

import com.lm.ttshop.dao.TbItemMapper;
import com.lm.ttshop.pojo.po.TbItem;
import com.lm.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 刘铭 on 2017/8/31 0031.
 */

@Service
@Scope("prototype")
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;


    @Override
    public TbItem selectById(Long id) {

        TbItem item = itemMapper.selectByPrimaryKey(id);


        return item;
    }

    @Override
    public boolean delById(Long id) {
        int i = itemMapper.deleteByPrimaryKey(id);
        return i == 1;

    }

    @Override
    public boolean putById(Long id) {
        return false;
    }

    @Override
    public TbItem add(TbItem item) {
        return null;
    }
}
