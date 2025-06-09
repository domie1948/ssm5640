package com.dao;

import com.entity.DiscussyouxikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxikuVO;
import com.entity.view.DiscussyouxikuView;


/**
 * 游戏库评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-17 22:56:09
 */
public interface DiscussyouxikuDao extends BaseMapper<DiscussyouxikuEntity> {
	
	List<DiscussyouxikuVO> selectListVO(@Param("ew") Wrapper<DiscussyouxikuEntity> wrapper);
	
	DiscussyouxikuVO selectVO(@Param("ew") Wrapper<DiscussyouxikuEntity> wrapper);
	
	List<DiscussyouxikuView> selectListView(@Param("ew") Wrapper<DiscussyouxikuEntity> wrapper);

	List<DiscussyouxikuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxikuEntity> wrapper);
	
	DiscussyouxikuView selectView(@Param("ew") Wrapper<DiscussyouxikuEntity> wrapper);
	
}
