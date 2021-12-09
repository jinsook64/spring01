package cs.dit.service;

import java.util.List;

import cs.dit.domain.BoardVO;

public interface BoardService {
	//Service의 메서드를 설계할 때는 현실적인 로직의 이름을 사용하는 것이 관례
	
	public List<BoardVO> getList();
	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);

}
