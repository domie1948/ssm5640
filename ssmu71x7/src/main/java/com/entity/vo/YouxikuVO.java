package com.entity.vo;

import com.entity.YouxikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 游戏库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public class YouxikuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 游戏标签
	 */
	
	private String youxibiaoqian;
		
	/**
	 * 局域网
	 */
	
	private String juyuwang;
		
	/**
	 * 游戏封面
	 */
	
	private String youxifengmian;
		
	/**
	 * 游戏简介
	 */
	
	private String youxijianjie;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 游戏文件
	 */
	
	private String youxiwenjian;
				
	
	/**
	 * 设置：游戏分类
	 */
	 
	public void setYouxifenlei(String youxifenlei) {
		this.youxifenlei = youxifenlei;
	}
	
	/**
	 * 获取：游戏分类
	 */
	public String getYouxifenlei() {
		return youxifenlei;
	}
				
	
	/**
	 * 设置：游戏标签
	 */
	 
	public void setYouxibiaoqian(String youxibiaoqian) {
		this.youxibiaoqian = youxibiaoqian;
	}
	
	/**
	 * 获取：游戏标签
	 */
	public String getYouxibiaoqian() {
		return youxibiaoqian;
	}
				
	
	/**
	 * 设置：局域网
	 */
	 
	public void setJuyuwang(String juyuwang) {
		this.juyuwang = juyuwang;
	}
	
	/**
	 * 获取：局域网
	 */
	public String getJuyuwang() {
		return juyuwang;
	}
				
	
	/**
	 * 设置：游戏封面
	 */
	 
	public void setYouxifengmian(String youxifengmian) {
		this.youxifengmian = youxifengmian;
	}
	
	/**
	 * 获取：游戏封面
	 */
	public String getYouxifengmian() {
		return youxifengmian;
	}
				
	
	/**
	 * 设置：游戏简介
	 */
	 
	public void setYouxijianjie(String youxijianjie) {
		this.youxijianjie = youxijianjie;
	}
	
	/**
	 * 获取：游戏简介
	 */
	public String getYouxijianjie() {
		return youxijianjie;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：游戏文件
	 */
	 
	public void setYouxiwenjian(String youxiwenjian) {
		this.youxiwenjian = youxiwenjian;
	}
	
	/**
	 * 获取：游戏文件
	 */
	public String getYouxiwenjian() {
		return youxiwenjian;
	}
			
}
