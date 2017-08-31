package com.lm.ttshop.web;

import com.lm.ttshop.pojo.po.TbItem;
import com.lm.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 刘铭 on 2017/8/31 0031.
 */

@Controller
@Scope("prototype")
public class Action {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/{jn}")
    public String test(@PathVariable String jn){

        return jn;
    }

    @ResponseBody
    @RequestMapping(value = "/item/{id}" ,method = RequestMethod.GET)
    public TbItem getItem(@PathVariable Long id){
        TbItem item = itemService.selectById(id);
        return item;
    }


}
