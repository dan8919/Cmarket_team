package kr.co.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

@Repository

public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;
	
	private final String NS = "b.o.a";

	@Override

	public void insert(BoardVO vo) {
		
		
		Integer bno = session.selectOne(NS+".getBno");
		
		if(bno != null) {
			bno += 1;
		}else {
			bno = 1;
		}
		
		vo.setBno(bno);
		
		session.insert(NS+".insert",vo );
	}

	@Override
	public List<BoardVO> boardList() {
		// TODO Auto-generated method stub
		return session.selectList(NS+".boardList");
	}
	
	

}
