package kr.co.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.ReplyVO;

@Repository

public class ReplyDAOImpl implements ReplyDAO{

 

	@Inject

	private SqlSession session;

	

	private final String NS = "r.e.p";

	

	
	
}
