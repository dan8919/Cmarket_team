package kr.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.domain.GoodsVO;
import kr.co.persistence.GoodsDAO;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsDAO gDao;

	@Override
	public void insert(GoodsVO vo) {

		gDao.insert(vo);
		
	}

	@Override
	public List<GoodsVO> goodsList() {
		// TODO Auto-generated method stub
		return gDao.goodsList();
	}

	@Override
	public GoodsVO getCheckGno(String inputGno) {
		// TODO Auto-generated method stub
		return gDao.getCheckGno(inputGno);
	}


	

}
