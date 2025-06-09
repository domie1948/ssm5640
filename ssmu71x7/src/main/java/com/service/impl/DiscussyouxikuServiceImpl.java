package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyouxikuDao;
import com.entity.DiscussyouxikuEntity;
import com.service.DiscussyouxikuService;
import com.entity.vo.DiscussyouxikuVO;
import com.entity.view.DiscussyouxikuView;

@Service("discussyouxikuService")
public class DiscussyouxikuServiceImpl extends ServiceImpl<DiscussyouxikuDao, DiscussyouxikuEntity> implements DiscussyouxikuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxikuEntity> page = this.selectPage(
                new Query<DiscussyouxikuEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxikuEntity> wrapper) {
		  Page<DiscussyouxikuView> page =new Query<DiscussyouxikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouxikuVO> selectListVO(Wrapper<DiscussyouxikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxikuVO selectVO(Wrapper<DiscussyouxikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxikuView> selectListView(Wrapper<DiscussyouxikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxikuView selectView(Wrapper<DiscussyouxikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
