package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenyouxipaixingbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenyouxipaixingbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenyouxipaixingbangView;


/**
 * 热门游戏排行榜
 *
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public interface RemenyouxipaixingbangService extends IService<RemenyouxipaixingbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenyouxipaixingbangVO> selectListVO(Wrapper<RemenyouxipaixingbangEntity> wrapper);
   	
   	RemenyouxipaixingbangVO selectVO(@Param("ew") Wrapper<RemenyouxipaixingbangEntity> wrapper);
   	
   	List<RemenyouxipaixingbangView> selectListView(Wrapper<RemenyouxipaixingbangEntity> wrapper);
   	
   	RemenyouxipaixingbangView selectView(@Param("ew") Wrapper<RemenyouxipaixingbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenyouxipaixingbangEntity> wrapper);
   	
}

