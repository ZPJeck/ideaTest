package nyist.net.service.Impl;

import java.util.List;

import nyist.net.dao.HygieneMapper;
import nyist.net.po.Hygiene;
import nyist.net.service.HygieneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HygieneServiceImpl implements HygieneService {

	@Autowired
	HygieneMapper hygieneMapper;

	public Hygiene SelectById(Integer HDnum) {
		
		return hygieneMapper.SelectById(HDnum);
	}

	public void InsertHg(Hygiene hygiene) {
		hygieneMapper.InsertHg(hygiene);
	}

	public void DelectHg(Integer HDnum) {
		hygieneMapper.DelectHg(HDnum);
	}

	public List<Hygiene> SelectHygiene() {
		
		return hygieneMapper.SelectHygiene();
	}

}
