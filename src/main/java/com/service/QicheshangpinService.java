package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicheshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicheshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicheshangpinView;


/**
 * 汽车商品
 *
 * @author 
 * @email 
 * @date 2022-07-31 07:26:44
 */
public interface QicheshangpinService extends IService<QicheshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicheshangpinVO> selectListVO(Wrapper<QicheshangpinEntity> wrapper);
   	
   	QicheshangpinVO selectVO(@Param("ew") Wrapper<QicheshangpinEntity> wrapper);
   	
   	List<QicheshangpinView> selectListView(Wrapper<QicheshangpinEntity> wrapper);
   	
   	QicheshangpinView selectView(@Param("ew") Wrapper<QicheshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicheshangpinEntity> wrapper);
   	

}

