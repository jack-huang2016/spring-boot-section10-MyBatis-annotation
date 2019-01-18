package com.springboot.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.sample.entity.MgrParamScope;
import com.springboot.sample.mapper.MgrParamScopeMapper;

@RestController
public class MgrParamScopeController {
	
	@Autowired
    private MgrParamScopeMapper mgrParamScopeMapper;
	
	@RequestMapping("/search")
    public List<MgrParamScope> select(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("apiId", 1);
		map.put("token", "gaoling");
		map.put("key", "store_no");
		map.put("value", "DB07MA");
		
        return mgrParamScopeMapper.selectByParams(map);
    }
}
