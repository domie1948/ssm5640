package com.entity.view;

import com.entity.RemenyouxipaixingbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门游戏排行榜
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
@TableName("remenyouxipaixingbang")
public class RemenyouxipaixingbangView  extends RemenyouxipaixingbangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RemenyouxipaixingbangView(){
	}
 
 	public RemenyouxipaixingbangView(RemenyouxipaixingbangEntity remenyouxipaixingbangEntity){
 	try {
			BeanUtils.copyProperties(this, remenyouxipaixingbangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
