package com.dao;

import com.entity.RemenyouxipaixingbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemenyouxipaixingbangVO;
import com.entity.view.RemenyouxipaixingbangView;


/**
 * 热门游戏排行榜
 * 
 * @author 
 * @email 
 * @date 2020-11-17 22:56:08
 */
public interface RemenyouxipaixingbangDao extends BaseMapper<RemenyouxipaixingbangEntity> {
	
	List<RemenyouxipaixingbangVO> selectListVO(@Param("ew") Wrapper<RemenyouxipaixingbangEntity> wrapper);
	
	RemenyouxipaixingbangVO selectVO(@Param("ew") Wrapper<RemenyouxipaixingbangEntity> wrapper);
	
	List<RemenyouxipaixingbangView> selectListView(@Param("ew") Wrapper<RemenyouxipaixingbangEntity> wrapper);

	List<RemenyouxipaixingbangView> selectListView(Pagination page,@Param("ew") Wrapper<RemenyouxipaixingbangEntity> wrapper);
	
	RemenyouxipaixingbangView selectView(@Param("ew") Wrapper<RemenyouxipaixingbangEntity> wrapper);
	
}
