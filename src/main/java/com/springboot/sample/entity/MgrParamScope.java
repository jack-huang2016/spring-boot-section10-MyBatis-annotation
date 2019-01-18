package com.springboot.sample.entity;

import java.io.Serializable;

/**
 * 请写出类的用途 
 * @author user
 * @date  2018-01-11 11:50:13
 * @version 1.0.0
 * @copyright (C) 2013 WonHigh Information Technology Co.,Ltd 
 * All Rights Reserved. 
 * 
 * The software for the WonHigh technology development, without the 
 * company's written consent, and any other individuals and 
 * organizations shall not be used, Copying, Modify or distribute 
 * the software.
 * 
 */
public class MgrParamScope implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -803904122948458856L;

	/**
     * API ID
     */
    private Integer api_id;

    /**
     * TOKEN
     */
    private String token;

    /**
     * 参数名
     */
    private String param_key;

    /**
     * 参数值范围
     */
    private String value;

   
  
    /**
     * 
     * {@linkplain #token}
     *
     * @return the value of U_DB_PT.MGR_PARAM_SCOPE.TOKEN
     */
    public String getToken() {
        return token;
    }

    /**
     * 
     * {@linkplain #token}
     * @param token the value for U_DB_PT.MGR_PARAM_SCOPE.TOKEN
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 
     * {@linkplain #value}
     *
     * @return the value of U_DB_PT.MGR_PARAM_SCOPE.VALUE
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * {@linkplain #value}
     * @param value the value for U_DB_PT.MGR_PARAM_SCOPE.VALUE
     */
    public void setValue(String value) {
        this.value = value;
    }

	public Integer getApi_id() {
		return api_id;
	}

	public void setApi_id(Integer api_id) {
		this.api_id = api_id;
	}

	public String getParam_key() {
		return param_key;
	}

	public void setParam_key(String param_key) {
		this.param_key = param_key;
	}
    
}