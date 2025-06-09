package com.entity.view;

import com.entity.DiscussremenyouxipaixingbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门游戏排行榜评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-17 22:56:09
 */
@TableName("discussremenyouxipaixingbang")
public class DiscussremenyouxipaixingbangView  extends DiscussremenyouxipaixingbangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremenyouxipaixingbangView(){
	}
 
 	public DiscussremenyouxipaixingbangView(DiscussremenyouxipaixingbangEntity discussremenyouxipaixingbangEntity){
 	try {
			BeanUtils.copyProperties(this, discussremenyouxipaixingbangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
