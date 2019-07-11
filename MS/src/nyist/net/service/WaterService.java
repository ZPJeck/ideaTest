package nyist.net.service;


import java.util.List;

import nyist.net.po.Water;

public interface WaterService {
	
	/*
	 * 学生查看水电�?
	 */
	public Water SelectWater(Integer We_Dnum);
	
	/*
	 * 管理员查看水电费
	 */
	public List<Water> selectWaterAdmin();
	
	/*
	 * 管理员添�?学生水电费的信息
	 */
	public void  InsertWater(Water water);
	
	/*
	 * 管理�?删除学生水电费的信息 (根据寝室�?
	 * 
	 */
	public void DeleteWater(Integer We_Dnum); 
	
}
