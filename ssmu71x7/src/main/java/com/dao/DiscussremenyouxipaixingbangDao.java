package com.dao;

import com.entity.DiscussremenyouxipaixingbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremenyouxipaixingbangVO;
import com.entity.view.DiscussremenyouxipaixingbangView;


/**
 * 热门游戏排行榜评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-17 22:56:09
 */
public interface DiscussremenyouxipaixingbangDao extends BaseMapper<DiscussremenyouxipaixingbangEntity> {
	
	List<DiscussremenyouxipaixingbangVO> selectListVO(@Param("ew") Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
	
	DiscussremenyouxipaixingbangVO selectVO(@Param("ew") Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
	
	List<DiscussremenyouxipaixingbangView> selectListView(@Param("ew") Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);

	List<DiscussremenyouxipaixingbangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
	
	DiscussremenyouxipaixingbangView selectView(@Param("ew") Wrapper<DiscussremenyouxipaixingbangEntity> wrapper);
	
}
