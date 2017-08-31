package com.lm.ttshop.service;

import com.lm.ttshop.pojo.po.TbItem;

/**
 * Created by 刘铭 on 2017/8/31 0031.
 */
public interface ItemService {

    TbItem selectById(Long id);

    boolean delById(Long id);

    boolean putById(Long id);

    TbItem add(TbItem item);

}
