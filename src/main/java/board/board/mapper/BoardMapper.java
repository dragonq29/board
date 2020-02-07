package board.board.mapper;

import board.board.dto.BoardDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
  List<BoardDto> selectBoardList() throws Exception;

}
