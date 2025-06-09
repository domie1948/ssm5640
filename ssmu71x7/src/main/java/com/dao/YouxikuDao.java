package com.dao;

import com.entity.YouxikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxikuVO;
import com.entity.view.YouxikuView;


/**
 * 游戏库
 * 
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public interface YouxikuDao extends BaseMapper<YouxikuEntity> {
	
	List<YouxikuVO> selectListVO(@Param("ew") Wrapper<YouxikuEntity> wrapper);
	
	YouxikuVO selectVO(@Param("ew") Wrapper<YouxikuEntity> wrapper);
	
	List<YouxikuView> selectListView(@Param("ew") Wrapper<YouxikuEntity> wrapper);

	List<YouxikuView> selectListView(Pagination page,@Param("ew") Wrapper<YouxikuEntity> wrapper);
	
	YouxikuView selectView(@Param("ew") Wrapper<YouxikuEntity> wrapper);
	
}
