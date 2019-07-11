package nyist.net.service.Impl;

import java.util.List;

import nyist.net.dao.BaoXiuMapper;
import nyist.net.po.BaoXiu;
import nyist.net.service.BaoXiuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaoXiuServiceImpl implements BaoXiuService {
	
	@Autowired
	private BaoXiuMapper baoXiuMapper;
	
	
	
	public BaoXiu SelectById(Integer BxDnum) {
		//判断是否为
		return baoXiuMapper.SelectById(BxDnum);
	}

	
	public List<BaoXiu> SelectBXAdmin() {

		return baoXiuMapper.SelectBXAdmin();
	}

	
	public void UpdateByDnum(Integer BxDnum) {
		baoXiuMapper.UpdateByDnum(BxDnum);
	}


	public Boolean InserBaoxiu(BaoXiu baoXiu) {
		
		return baoXiuMapper.InserBaoxiu(baoXiu);
	}

}
