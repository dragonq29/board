package board.service;

import board.board.dto.BoardDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardServiceImpl implements BoardService {

  @Autowired
  private BoardMapper boardMapper;

  @Override
  public List<BoardDto> selectBoardList() throws Exception {
    return boardMapper.selectBoardList();
  }
}
