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


import com.dao.QicheshangpinDao;
import com.entity.QicheshangpinEntity;
import com.service.QicheshangpinService;
import com.entity.vo.QicheshangpinVO;
import com.entity.view.QicheshangpinView;

@Service("qicheshangpinService")
public class QicheshangpinServiceImpl extends ServiceImpl<QicheshangpinDao, QicheshangpinEntity> implements QicheshangpinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicheshangpinEntity> page = this.selectPage(
                new Query<QicheshangpinEntity>(params).getPage(),
                new EntityWrapper<QicheshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicheshangpinEntity> wrapper) {
		  Page<QicheshangpinView> page =new Query<QicheshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicheshangpinVO> selectListVO(Wrapper<QicheshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicheshangpinVO selectVO(Wrapper<QicheshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicheshangpinView> selectListView(Wrapper<QicheshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicheshangpinView selectView(Wrapper<QicheshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
