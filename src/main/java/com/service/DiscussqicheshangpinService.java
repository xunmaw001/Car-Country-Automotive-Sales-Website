package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqicheshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqicheshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqicheshangpinView;


/**
 * 汽车商品评论表
 *
 * @author 
 * @email 
 * @date 2022-07-31 07:26:44
 */
public interface DiscussqicheshangpinService extends IService<DiscussqicheshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqicheshangpinVO> selectListVO(Wrapper<DiscussqicheshangpinEntity> wrapper);
   	
   	DiscussqicheshangpinVO selectVO(@Param("ew") Wrapper<DiscussqicheshangpinEntity> wrapper);
   	
   	List<DiscussqicheshangpinView> selectListView(Wrapper<DiscussqicheshangpinEntity> wrapper);
   	
   	DiscussqicheshangpinView selectView(@Param("ew") Wrapper<DiscussqicheshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqicheshangpinEntity> wrapper);
   	

}

