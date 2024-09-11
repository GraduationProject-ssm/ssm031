package com.entity.view;

import com.entity.ShequtingcheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区停车
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 15:35:54
 */
@TableName("shequtingche")
public class ShequtingcheView  extends ShequtingcheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequtingcheView(){
	}
 
 	public ShequtingcheView(ShequtingcheEntity shequtingcheEntity){
 	try {
			BeanUtils.copyProperties(this, shequtingcheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
