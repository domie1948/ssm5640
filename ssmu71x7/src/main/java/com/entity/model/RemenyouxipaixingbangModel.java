package com.entity.model;

import com.entity.RemenyouxipaixingbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 热门游戏排行榜
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public class RemenyouxipaixingbangModel  implements Serializable {
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
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 游戏文件
	 */
	
	private String youxiwenjian;
		
	/**
	 * 本周排名
	 */
	
	private String benzhoupaiming;
		
	/**
	 * 游戏简介
	 */
	
	private String youxijianjie;
				
	
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
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
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
				
	
	/**
	 * 设置：本周排名
	 */
	 
	public void setBenzhoupaiming(String benzhoupaiming) {
		this.benzhoupaiming = benzhoupaiming;
	}
	
	/**
	 * 获取：本周排名
	 */
	public String getBenzhoupaiming() {
		return benzhoupaiming;
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
			
}
