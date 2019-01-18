package com.springboot.sample.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.springboot.sample.entity.MgrParamScope;

public interface MgrParamScopeMapper {
	
	//备注：实体类的属性必须要和查询的数据库表的字段名字一样才能把查出来的结果映射到实体属性上。
	@Select("SELECT API_ID,TOKEN,PARAM_KEY,VALUE FROM U_DB_PT.MGR_PARAM_SCOPE WHERE API_ID = #{params.apiId} AND TOKEN = #{params.token} AND PARAM_KEY = #{params.key} AND VALUE = #{params.value}")
	public List<MgrParamScope> selectByParams(@Param("params") Map<String,Object> params);
}
