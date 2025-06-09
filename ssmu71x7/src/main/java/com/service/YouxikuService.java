package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxikuView;


/**
 * 游戏库
 *
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public interface YouxikuService extends IService<YouxikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxikuVO> selectListVO(Wrapper<YouxikuEntity> wrapper);
   	
   	YouxikuVO selectVO(@Param("ew") Wrapper<YouxikuEntity> wrapper);
   	
   	List<YouxikuView> selectListView(Wrapper<YouxikuEntity> wrapper);
   	
   	YouxikuView selectView(@Param("ew") Wrapper<YouxikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxikuEntity> wrapper);
   	
}

