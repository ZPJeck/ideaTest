/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xw.service;

import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.xw.entity.News;
import com.thinkgem.jeesite.modules.xw.dao.NewsDao;

/**
 * 新闻基本表Service
 * @author jx
 * @version 2018-09-28
 */
@Service
@Transactional(readOnly = true)
public class NewsService extends CrudService<NewsDao, News> {

	public News get(String id) {
		return super.get(id);
	}
	
	public List<News> findList(News news) {
		return super.findList(news);
	}
	
	public Page<News> findPage(Page<News> page, News news) {
		return super.findPage(page, news);
	}
	
	@Transactional(readOnly = false)
	public void save(News news) {
		if(news.getContent()!= null){
			news.setContent(StringEscapeUtils.unescapeHtml4(
					news.getContent()
			));
		}
		super.save(news);
	}
	
	@Transactional(readOnly = false)
	public void delete(News news) {
		super.delete(news);
	}
	
}