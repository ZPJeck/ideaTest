package nyist.net.dao;

import java.util.List;

import nyist.net.po.Hygiene;

public interface HygieneMapper{
	
	
	/*
	 * 学生用户和�?过寝室号查询 寝室的卫�? 以及得分情况�?
	 * 
	 */
	public Hygiene SelectById(Integer HDnum);
	/*
	 * 寝室管理员查
	 */
	public List<Hygiene> SelectHygiene();
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
	
}
