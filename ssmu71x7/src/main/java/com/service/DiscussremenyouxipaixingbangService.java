package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremenyouxipaixingbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremenyouxipaixingbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremenyouxipaixingbangView;


/**
 * 热门游戏排行榜评论表
 *
 * @author 
 * @email 
 * @date 2020-11-17 22:56:09
 */
public interface DiscussremenyouxipaixingbangService extends IService<DiscussremenyouxipaixingbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremenyouxipaixingbangVO> selectListVO(Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
   	
   	DiscussremenyouxipaixingbangVO selectVO(@Param("ew") Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
   	
   	List<DiscussremenyouxipaixingbangView> selectListView(Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
   	
   	DiscussremenyouxipaixingbangView selectView(@Param("ew") Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
   	
}

