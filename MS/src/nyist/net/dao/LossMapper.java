package nyist.net.dao;

import java.util.List;

import nyist.net.po.Loss;

public interface LossMapper {
	
	/*
	 * 学生用户遗失物品 把事件
	 * 
	 */
	public void InserLoss(Loss loss);
	
	/*
	 * 学生 查询遗失信息 
	 * 
	 */
	public List<Loss> SelectLossByExa(Loss loss);
	
	/*
	 * 管理员查看遗失 
	 */
	public List<Loss> SelectLoss();
	
	
	/*
	 *  管理员审核信
	 */
	public void AlterLoss(String  LossStu);
	
	
}
