package kr.co.persistence;

import java.util.List;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

public interface BoardDAO {

	void insert(BoardVO vo);

	List<BoardVO> boardList();
	


}
