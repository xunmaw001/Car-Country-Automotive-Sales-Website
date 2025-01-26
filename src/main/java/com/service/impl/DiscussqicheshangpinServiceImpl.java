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


import com.dao.DiscussqicheshangpinDao;
import com.entity.DiscussqicheshangpinEntity;
import com.service.DiscussqicheshangpinService;
import com.entity.vo.DiscussqicheshangpinVO;
import com.entity.view.DiscussqicheshangpinView;

@Service("discussqicheshangpinService")
public class DiscussqicheshangpinServiceImpl extends ServiceImpl<DiscussqicheshangpinDao, DiscussqicheshangpinEntity> implements DiscussqicheshangpinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqicheshangpinEntity> page = this.selectPage(
                new Query<DiscussqicheshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussqicheshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqicheshangpinEntity> wrapper) {
		  Page<DiscussqicheshangpinView> page =new Query<DiscussqicheshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqicheshangpinVO> selectListVO(Wrapper<DiscussqicheshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqicheshangpinVO selectVO(Wrapper<DiscussqicheshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqicheshangpinView> selectListView(Wrapper<DiscussqicheshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqicheshangpinView selectView(Wrapper<DiscussqicheshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
