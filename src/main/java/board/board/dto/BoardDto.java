package board.board.dto;

import lombok.Data;

@Data
public class BoardDto {

  private int boardIdx;
  private String title;
  private String context;
  private int hitCnt;
  private String creatorId;
  private String createDatetime;
  private String updaterId;
  private String updatedDatetime;

}
