package com.webex.b01.repository;

import com.webex.b01.domain.Board;
import com.webex.b01.repository.search.BoardSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board,Long>, BoardSearch {


    @Query(value = "select now()",nativeQuery = true)
    String getTime();
}
