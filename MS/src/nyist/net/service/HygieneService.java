package nyist.net.service;

import java.util.List;

import nyist.net.po.Hygiene;

public interface HygieneService{
	
	
	/*
	 * 学生用户和寝室管理员通过寝室号查�?寝室的卫�? 以及得分情况�?
	 * 
	 */
	public Hygiene SelectById(Integer HDnum);
	
	/*
	 * 寝室管理�?添加宿舍卫生管理情况 以及的分
	 * 
	 */
	public void InsertHg(Hygiene hygiene);
	
	/*
	 * 寝室管理�?删除宿舍卫生管理情况 
	 * 
	 */
	public void DelectHg(Integer HDnum);
	/*
	 * 寝室管理员查�?寝室的卫�? 以及得分情况�?
	 */
	public List<Hygiene> SelectHygiene();
}
