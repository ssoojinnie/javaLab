package kr.co.songjava.mvc.repository;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.parameter.BoardParameter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {

    List<Board> getList();
    Board get(int boardSeq);
    void save(BoardParameter board);
    void delete(int boardSeq);
    void update(BoardParameter board);
}
