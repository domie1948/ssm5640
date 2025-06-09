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


import com.dao.RemenyouxipaixingbangDao;
import com.entity.RemenyouxipaixingbangEntity;
import com.service.RemenyouxipaixingbangService;
import com.entity.vo.RemenyouxipaixingbangVO;
import com.entity.view.RemenyouxipaixingbangView;

@Service("remenyouxipaixingbangService")
public class RemenyouxipaixingbangServiceImpl extends ServiceImpl<RemenyouxipaixingbangDao, RemenyouxipaixingbangEntity> implements RemenyouxipaixingbangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenyouxipaixingbangEntity> page = this.selectPage(
                new Query<RemenyouxipaixingbangEntity>(params).getPage(),
                new EntityWrapper<RemenyouxipaixingbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenyouxipaixingbangEntity> wrapper) {
		  Page<RemenyouxipaixingbangView> page =new Query<RemenyouxipaixingbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenyouxipaixingbangVO> selectListVO(Wrapper<RemenyouxipaixingbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenyouxipaixingbangVO selectVO(Wrapper<RemenyouxipaixingbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenyouxipaixingbangView> selectListView(Wrapper<RemenyouxipaixingbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenyouxipaixingbangView selectView(Wrapper<RemenyouxipaixingbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
