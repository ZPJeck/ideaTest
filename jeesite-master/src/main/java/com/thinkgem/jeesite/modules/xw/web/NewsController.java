/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xw.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinkgem.jeesite.common.enums.RoleEnum;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.service.SystemService;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.xw.entity.News;
import com.thinkgem.jeesite.modules.xw.service.NewsService;

/**
 * 新闻基本表Controller
 * @author jx
 * @version 2018-09-28
 */
@Controller
@RequestMapping(value = "${adminPath}/xw/news")
public class NewsController extends BaseController {

	@Autowired
	private NewsService newsService;

	@Autowired
	private SystemService systemService;
	
	@ModelAttribute
	public News get(@RequestParam(required=false) String id) {
		News entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = newsService.get(id);
		}
		if (entity == null){
			entity = new News();
		}
		return entity;
	}
	
	@RequiresPermissions("xw:news:view")
	@RequestMapping(value = {"list", ""})
	public String list(News news, HttpServletRequest request, HttpServletResponse response, Model model) {
		if(!("1".equals(UserUtils.getUser().getId()))){
			news.setUserId(UserUtils.getUser().getId());
		}

		Page<News> page = newsService.findPage(new Page<News>(request, response), news);
		model.addAttribute("page", page);
		return "modules/xw/newsList";
	}

	@RequiresPermissions("xw:news:view")
	@RequestMapping(value = "findByStatus")
	public String findByStatus(News news, HttpServletRequest request, HttpServletResponse response, Model model) {
		if(!("1".equals(UserUtils.getUser().getId()))){
			news.setUserId(UserUtils.getUser().getId());
		}

		Page<News> page = newsService.findNews(new Page<News>(request, response), news);
		model.addAttribute("page", page);
		//request.setAttribute("userId",UserUtils.getUser().getId());
		return "modules/xw/newsList";
	}


	@RequiresPermissions("xw:news:view")
	@RequestMapping(value = "form")
	public String form(News news, Model model) {
		if(news.getContent()!= null){
			news.setContent(StringEscapeUtils.unescapeHtml4(
					news.getContent()
			));
		}
		if(UserUtils.isRole(RoleEnum.GUAN_LI_YUAN)){
			model.addAttribute("role",RoleEnum.GUAN_LI_YUAN.getType());
		}
//		/**
//		 *   新添加的功能
//		 */
//		if(UserUtils.isRole(RoleEnum.HUI_YUAN)){
//			model.addAttribute("role",RoleEnum.HUI_YUAN.getType());
//		}
		model.addAttribute("news", news);
		return "modules/xw/newsForm";
	}

	@RequiresPermissions("xw:news:edit")
	@RequestMapping(value = "save")
	public String save(News news, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, news)){
			return form(news, model);
		}
		/**
		 * @Auther: ZPJeck
		 * @Date:  2018/10/2 11:25
		 * @Description: 初次添加的时候的状态
		 */
		if(org.apache.commons.lang3.StringUtils.isEmpty(news.getId())) {
			news.setUserId(UserUtils.getUser().getId());
			news.setStatus("0");
		}
		if(!(UserUtils.isRole(RoleEnum.GUAN_LI_YUAN))){
			news.setStatus("0");
		}
		String userId = UserUtils.getUser().getId();
		news.setEamId("1");
		newsService.save(news);
		addMessage(redirectAttributes, "保存新闻审核成功");
		return "redirect:"+Global.getAdminPath()+"/xw/news/?repage";
	}
	
	@RequiresPermissions("xw:news:edit")
	@RequestMapping(value = "delete")
	public String delete(News news, RedirectAttributes redirectAttributes) {
		newsService.delete(news);
		addMessage(redirectAttributes, "删除新闻审核成功");
		return "redirect:"+Global.getAdminPath()+"/xw/news/?repage";
	}

}