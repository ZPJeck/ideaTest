/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xw.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.xw.entity.News;

/**
 * 新闻基本表DAO接口
 * @author jx
 * @version 2018-09-28
 */
@MyBatisDao
public interface NewsDao extends CrudDao<News> {
	
}