package kr.co.persistence;

import java.util.List;

import kr.co.domain.GoodsVO;

public interface GoodsDAO {

	void insert(GoodsVO vo);

	List<GoodsVO> goodsList();

	GoodsVO getCheckGno(String inputGno);

}
