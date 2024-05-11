package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 配送员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-16 17:23:53
 */
@TableName("peisongyuan")
public class PeisongyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeisongyuanEntity() {
		
	}
	
	public PeisongyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 配送员账号
	 */
					
	private String peisongyuanzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：配送员账号
	 */
	public void setPeisongyuanzhanghao(String peisongyuanzhanghao) {
		this.peisongyuanzhanghao = peisongyuanzhanghao;
	}
	/**
	 * 获取：配送员账号
	 */
	public String getPeisongyuanzhanghao() {
		return peisongyuanzhanghao;
	}
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
