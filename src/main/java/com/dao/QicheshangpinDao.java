package com.dao;

import com.entity.QicheshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicheshangpinVO;
import com.entity.view.QicheshangpinView;


/**
 * 汽车商品
 * 
 * @author 
 * @email 
 * @date 2022-07-31 07:26:44
 */
public interface QicheshangpinDao extends BaseMapper<QicheshangpinEntity> {
	
	List<QicheshangpinVO> selectListVO(@Param("ew") Wrapper<QicheshangpinEntity> wrapper);
	
	QicheshangpinVO selectVO(@Param("ew") Wrapper<QicheshangpinEntity> wrapper);
	
	List<QicheshangpinView> selectListView(@Param("ew") Wrapper<QicheshangpinEntity> wrapper);

	List<QicheshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<QicheshangpinEntity> wrapper);
	
	QicheshangpinView selectView(@Param("ew") Wrapper<QicheshangpinEntity> wrapper);
	

}
