package com.dao;

import com.entity.YouxibudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxibudingVO;
import com.entity.view.YouxibudingView;


/**
 * 游戏补丁
 * 
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public interface YouxibudingDao extends BaseMapper<YouxibudingEntity> {
	
	List<YouxibudingVO> selectListVO(@Param("ew") Wrapper<YouxibudingEntity> wrapper);
	
	YouxibudingVO selectVO(@Param("ew") Wrapper<YouxibudingEntity> wrapper);
	
	List<YouxibudingView> selectListView(@Param("ew") Wrapper<YouxibudingEntity> wrapper);

	List<YouxibudingView> selectListView(Pagination page,@Param("ew") Wrapper<YouxibudingEntity> wrapper);
	
	YouxibudingView selectView(@Param("ew") Wrapper<YouxibudingEntity> wrapper);
	
}
