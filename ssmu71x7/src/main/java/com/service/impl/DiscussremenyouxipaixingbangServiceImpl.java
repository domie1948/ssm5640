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


import com.dao.DiscussremenyouxipaixingbangDao;
import com.entity.DiscussremenyouxipaixingbangEntity;
import com.service.DiscussremenyouxipaixingbangService;
import com.entity.vo.DiscussremenyouxipaixingbangVO;
import com.entity.view.DiscussremenyouxipaixingbangView;

@Service("discussremenyouxipaixingbangService")
public class DiscussremenyouxipaixingbangServiceImpl extends ServiceImpl<DiscussremenyouxipaixingbangDao, DiscussremenyouxipaixingbangEntity> implements DiscussremenyouxipaixingbangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremenyouxipaixingbangEntity> page = this.selectPage(
                new Query<DiscussremenyouxipaixingbangEntity>(params).getPage(),
                new EntityWrapper<DiscussremenyouxipaixingbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremenyouxipaixingbangEntity> wrapper) {
		  Page<DiscussremenyouxipaixingbangView> page =new Query<DiscussremenyouxipaixingbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremenyouxipaixingbangVO> selectListVO(Wrapper<DiscussremenyouxipaixingbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremenyouxipaixingbangVO selectVO(Wrapper<DiscussremenyouxipaixingbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremenyouxipaixingbangView> selectListView(Wrapper<DiscussremenyouxipaixingbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremenyouxipaixingbangView selectView(Wrapper<DiscussremenyouxipaixingbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
