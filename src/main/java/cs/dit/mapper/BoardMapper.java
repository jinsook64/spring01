package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList(); //SQL 매퍼 처리
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);

}
