package kr.co.service;

import java.util.List;

import kr.co.domain.GoodsVO;

public interface GoodsService {

	void insert(GoodsVO vo);

	List<GoodsVO> goodsList();

	GoodsVO getCheckGno(String inputGno);





}
