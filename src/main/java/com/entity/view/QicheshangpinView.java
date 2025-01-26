package com.entity.view;

import com.entity.QicheshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-31 07:26:44
 */
@TableName("qicheshangpin")
public class QicheshangpinView  extends QicheshangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicheshangpinView(){
	}
 
 	public QicheshangpinView(QicheshangpinEntity qicheshangpinEntity){
 	try {
			BeanUtils.copyProperties(this, qicheshangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
