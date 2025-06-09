package com.entity.view;

import com.entity.DiscussyouxikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏库评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-17 22:56:09
 */
@TableName("discussyouxiku")
public class DiscussyouxikuView  extends DiscussyouxikuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyouxikuView(){
	}
 
 	public DiscussyouxikuView(DiscussyouxikuEntity discussyouxikuEntity){
 	try {
			BeanUtils.copyProperties(this, discussyouxikuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
