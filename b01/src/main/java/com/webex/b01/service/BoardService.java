package com.webex.b01.service;

import com.webex.b01.dto.BoardDTO;
import com.webex.b01.dto.BoardListReplyCountDTO;
import com.webex.b01.dto.PageRequestDTO;
import com.webex.b01.dto.PageResponseDTO;

public interface BoardService {
    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);


    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

    PageResponseDTO<BoardListReplyCountDTO> listWithReplyCount(PageRequestDTO pageRequestDTO);

}
