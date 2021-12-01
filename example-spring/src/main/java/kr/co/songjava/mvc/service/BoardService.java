package kr.co.songjava.mvc.service;

import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.parameter.BoardParameter;
import kr.co.songjava.mvc.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*
* 게시판 서비스
* @author PSJ
 */
@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

    /*
     * 목록리턴
     * @author PSJ
     */
    public List<Board> getList(){
           return repository.getList();
    }

    /*
     * 상세정보 리턴
     * @author PSJ
     */
    public Board get(int boardSeq){
        return repository.get(boardSeq);
    }

    /*
     * 등록 처리
     * @author PSJ
     */
    public void save(BoardParameter parameter){
        //조회하여 리턴된 정보
        Board board = repository.get(parameter.getBoardSeq());
        if(board == null){
            repository.save(parameter);
        }else{
            repository.update(parameter);
        }
    }

    /*
     * 삭제처리
     * @author PSJ
     */
    public void delete(int boardSeq){
        repository.delete(boardSeq);
    }


}
