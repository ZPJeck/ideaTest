package nyist.net.service;

import java.util.List;

import nyist.net.po.BaoXiu;


public interface BaoXiuService {
	
	/*
	 * 学生 
	 */
	public BaoXiu SelectById(Integer BxDnum);
	
	/*
	 * 管理
	 * 
	 * 	 * 
	 */
	public List<BaoXiu> SelectBXAdmin();
	/*
	 * 
	 * 管理
	 * 
	 */
	public void UpdateByDnum(Integer BxDnum);
	/*
	 * 学生用户遗失物品 把事件提交到
	 * 
	 */
	public Boolean InserBaoxiu(BaoXiu baoXiu);
}
