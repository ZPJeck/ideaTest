package nyist.net.service.Impl;

import java.util.List;

import nyist.net.dao.WaterMapper;
import nyist.net.po.Water;
import nyist.net.service.WaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WaterServiceImpl implements WaterService {

	@Autowired
	WaterMapper waterMapper;

	public Water SelectWater(Integer We_Dnum) {
		
		return waterMapper.SelectWater(We_Dnum);
	}

	public List<Water> selectWaterAdmin() {
		
		return waterMapper.selectWaterAdmin();
	}

	public void InsertWater(Water water) {
		
		waterMapper.InsertWater(water);
	}

	
	public void DeleteWater(Integer We_Dnum) {
		waterMapper.DeleteWater(We_Dnum);
	}

}
