package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxibudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxibudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxibudingView;


/**
 * 游戏补丁
 *
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public interface YouxibudingService extends IService<YouxibudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxibudingVO> selectListVO(Wrapper<YouxibudingEntity> wrapper);
   	
   	YouxibudingVO selectVO(@Param("ew") Wrapper<YouxibudingEntity> wrapper);
   	
   	List<YouxibudingView> selectListView(Wrapper<YouxibudingEntity> wrapper);
   	
   	YouxibudingView selectView(@Param("ew") Wrapper<YouxibudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxibudingEntity> wrapper);
   	
}

