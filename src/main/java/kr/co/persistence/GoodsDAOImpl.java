package kr.co.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.GoodsVO;

@Repository
public class GoodsDAOImpl implements GoodsDAO {

	@Inject
	private SqlSession session;

	private final String NS = "g.o.o";

	@Override
	public void insert(GoodsVO vo) {
	
	

	 session.insert(NS+".insert", vo);
	 }
	 

	@Override
	public List<GoodsVO> goodsList() {

		return session.selectList(NS + ".goodsList");
	}


	@Override
	public GoodsVO getCheckGno(String  inputGno) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".getCheckGno", inputGno);
	}

}
