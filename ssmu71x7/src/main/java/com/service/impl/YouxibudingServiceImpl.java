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


import com.dao.YouxibudingDao;
import com.entity.YouxibudingEntity;
import com.service.YouxibudingService;
import com.entity.vo.YouxibudingVO;
import com.entity.view.YouxibudingView;

@Service("youxibudingService")
public class YouxibudingServiceImpl extends ServiceImpl<YouxibudingDao, YouxibudingEntity> implements YouxibudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxibudingEntity> page = this.selectPage(
                new Query<YouxibudingEntity>(params).getPage(),
                new EntityWrapper<YouxibudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxibudingEntity> wrapper) {
		  Page<YouxibudingView> page =new Query<YouxibudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxibudingVO> selectListVO(Wrapper<YouxibudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxibudingVO selectVO(Wrapper<YouxibudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxibudingView> selectListView(Wrapper<YouxibudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxibudingView selectView(Wrapper<YouxibudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
