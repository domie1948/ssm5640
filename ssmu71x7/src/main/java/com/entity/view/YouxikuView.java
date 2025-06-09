package com.entity.view;

import com.entity.YouxikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
@TableName("youxiku")
public class YouxikuView  extends YouxikuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxikuView(){
	}
 
 	public YouxikuView(YouxikuEntity youxikuEntity){
 	try {
			BeanUtils.copyProperties(this, youxikuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
