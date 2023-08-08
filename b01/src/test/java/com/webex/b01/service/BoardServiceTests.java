package com.webex.b01.service;

import com.webex.b01.dto.BoardDTO;
import com.webex.b01.dto.PageRequestDTO;
import com.webex.b01.dto.PageResponseDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Log4j2
class BoardServiceTests {


    @Autowired
    private BoardService boardService;


    @Test
    void testregister() {

        log.info(boardService.getClass().getName());
    }

    @Test
    public void testRegister() {

        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
                .title("Sample Title...")
                .content("Sample Content...")
                .writer("user00")
                .build();

        Long bno = boardService.register(boardDTO);

        log.info("bno: " + bno);
    }

    @Test
    public void testModify(){
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(10L)
                .title("update___101")
                .content("업데이트 컨텐츠 101")
                .build();
        boardService.modify(boardDTO);
    }
    @Test
    public void testdelete(){
        Long bnoToRemove = 101L;

        boardService.remove(bnoToRemove);
        log.info("bno: " + bnoToRemove);
    }

    @Test
    public void testList() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .type("tcw")
                .keyword("1")
                .page(1)
                .size(10)
                .build();

        PageResponseDTO<BoardDTO> responseDTO = boardService.list(pageRequestDTO);

        log.info(responseDTO);

    }
}