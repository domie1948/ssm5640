package com.entity.view;

import com.entity.YouxibudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏补丁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
@TableName("youxibuding")
public class YouxibudingView  extends YouxibudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxibudingView(){
	}
 
 	public YouxibudingView(YouxibudingEntity youxibudingEntity){
 	try {
			BeanUtils.copyProperties(this, youxibudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
