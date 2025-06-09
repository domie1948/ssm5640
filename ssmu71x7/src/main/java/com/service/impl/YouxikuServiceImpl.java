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


import com.dao.YouxikuDao;
import com.entity.YouxikuEntity;
import com.service.YouxikuService;
import com.entity.vo.YouxikuVO;
import com.entity.view.YouxikuView;

@Service("youxikuService")
public class YouxikuServiceImpl extends ServiceImpl<YouxikuDao, YouxikuEntity> implements YouxikuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxikuEntity> page = this.selectPage(
                new Query<YouxikuEntity>(params).getPage(),
                new EntityWrapper<YouxikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxikuEntity> wrapper) {
		  Page<YouxikuView> page =new Query<YouxikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxikuVO> selectListVO(Wrapper<YouxikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxikuVO selectVO(Wrapper<YouxikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxikuView> selectListView(Wrapper<YouxikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxikuView selectView(Wrapper<YouxikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
