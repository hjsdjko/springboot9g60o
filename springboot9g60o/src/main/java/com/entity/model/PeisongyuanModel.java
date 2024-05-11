package com.entity.model;

import com.entity.PeisongyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 配送员
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-16 17:23:53
 */
public class PeisongyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 配送员姓名
	 */
	
	private String peisongyuanxingming;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 配送号码
	 */
	
	private String peisonghaoma;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：配送员姓名
	 */
	 
	public void setPeisongyuanxingming(String peisongyuanxingming) {
		this.peisongyuanxingming = peisongyuanxingming;
	}
	
	/**
	 * 获取：配送员姓名
	 */
	public String getPeisongyuanxingming() {
		return peisongyuanxingming;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：配送号码
	 */
	 
	public void setPeisonghaoma(String peisonghaoma) {
		this.peisonghaoma = peisonghaoma;
	}
	
	/**
	 * 获取：配送号码
	 */
	public String getPeisonghaoma() {
		return peisonghaoma;
	}
			
}
