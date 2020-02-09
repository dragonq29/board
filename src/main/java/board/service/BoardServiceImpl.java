package board.service;

import board.board.dto.BoardDto;
import board.board.mapper.BoardMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

  @Autowired
  private BoardMapper boardMapper;

  @Override
  public List<BoardDto> selectBoardList() throws Exception {
    return boardMapper.selectBoardList();
  }

  @Override
  public void insertBoard(BoardDto board) throws Exception {
    boardMapper.insertBoard(board);
  }

  /**
   * 상세 조희 기능.
   * 선택한 게시물의 조회수를 1 올리고, DB를 조회해서 상세 내용을 가져옴
   * @param boardIdx 선택한 게시물 번호
   * @return 선택한 게시물 상세 내용
   * @throws Exception
   */
  @Override
  public BoardDto selectBoardDetail(int boardIdx) throws Exception {

    boardMapper.updateHitCount(boardIdx);

    BoardDto board = boardMapper.selectBoardDetail(boardIdx);

    return board;
  }

  @Override
  public void updateBoard(BoardDto board) throws Exception {
    boardMapper.updateBoard(board);
  }

  @Override
  public void deleteBoard(int boardIdx) throws Exception {
    boardMapper.deleteBoard(boardIdx);
  }
}
