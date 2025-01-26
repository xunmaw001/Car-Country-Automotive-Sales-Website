package com.dao;

import com.entity.DiscussqicheshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqicheshangpinVO;
import com.entity.view.DiscussqicheshangpinView;


/**
 * 汽车商品评论表
 * 
 * @author 
 * @email 
 * @date 2022-07-31 07:26:44
 */
public interface DiscussqicheshangpinDao extends BaseMapper<DiscussqicheshangpinEntity> {
	
	List<DiscussqicheshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussqicheshangpinEntity> wrapper);
	
	DiscussqicheshangpinVO selectVO(@Param("ew") Wrapper<DiscussqicheshangpinEntity> wrapper);
	
	List<DiscussqicheshangpinView> selectListView(@Param("ew") Wrapper<DiscussqicheshangpinEntity> wrapper);

	List<DiscussqicheshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqicheshangpinEntity> wrapper);
	
	DiscussqicheshangpinView selectView(@Param("ew") Wrapper<DiscussqicheshangpinEntity> wrapper);
	

}
