package kr.co.service;

import java.util.List;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

public interface BoardService {

	void insert(BoardVO vo);

	List<BoardVO> boardList();



	
}
