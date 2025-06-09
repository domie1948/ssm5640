package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxikuView;


/**
 * 游戏库评论表
 *
 * @author 
 * @email 
 * @date 2020-11-17 22:56:09
 */
public interface DiscussyouxikuService extends IService<DiscussyouxikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxikuVO> selectListVO(Wrapper<DiscussyouxikuEntity> wrapper);
   	
   	DiscussyouxikuVO selectVO(@Param("ew") Wrapper<DiscussyouxikuEntity> wrapper);
   	
   	List<DiscussyouxikuView> selectListView(Wrapper<DiscussyouxikuEntity> wrapper);
   	
   	DiscussyouxikuView selectView(@Param("ew") Wrapper<DiscussyouxikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxikuEntity> wrapper);
   	
}

