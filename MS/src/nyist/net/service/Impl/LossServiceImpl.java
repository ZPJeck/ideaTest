package nyist.net.service.Impl;

import java.util.List;

import nyist.net.dao.LossMapper;
import nyist.net.po.Loss;
import nyist.net.service.LossService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LossServiceImpl implements LossService {

	@Autowired
	private  LossMapper lossMapper;

	public void InserLoss(Loss loss) {
		
		lossMapper.InserLoss(loss);
	}

	
	public List<Loss> SelectLossByExa(Loss loss) {

		return lossMapper.SelectLossByExa(loss);
	}

	
	public List<Loss> SelectLoss() {
		
		return lossMapper.SelectLoss();
	}

	public void AlterLoss(String LossStu) {
	
		lossMapper.AlterLoss(LossStu);
	}

}
