package kr.co.songjava.mvc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import kr.co.songjava.configuration.exception.BaseException;
import kr.co.songjava.configuration.http.BaseResponse;
import kr.co.songjava.configuration.http.BaseResponseCode;
import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.parameter.BoardParameter;
import kr.co.songjava.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.List;


/*
* 게시판 서비스
* @author PSJ
 */
@RestController
@RequestMapping("/board")
@Api(tags="게시판 API")
public class BoardController {

    @Autowired
    private BoardService boardService;

    /*
     * 목록리턴
     * @author PSJ
     */
    @GetMapping
    @ApiOperation(value="목록 조회", notes = "목록 정보 조회 가능")
    public BaseResponse<List<Board>> getList(){
        return new BaseResponse<List<Board>>(boardService.getList());
    }

    /*
     * 상세정보 리턴
     * @author PSJ
     */
    @GetMapping("/{boardSeq}")
    @ApiOperation(value="상세조회", notes="게시물번호에 해당하는 상세정보 조회 가능")
    @ApiImplicitParams({
            @ApiImplicitParam(name="boardSeq", value = "게시물 번호", example = "1")
    })
    public BaseResponse<Board> get(@PathVariable int boardSeq){
        Board board = boardService.get(boardSeq);
        if(board==null){
            throw new BaseException(BaseResponseCode.DATA_IS_NULL, new String[] {"게시물"});
        }
        return new BaseResponse<Board>(boardService.get(boardSeq));
    }

    /*
     * 등록/수정 처리
     * @author PSJ
     */
    @PutMapping("/save")
    @ApiOperation(value="등록/수정 처리", notes="신규 게시물 저장 및 기존 게시물 업데이트 가능")
    @ApiImplicitParams({
            @ApiImplicitParam(name="boardSeq", value = "게시물 번호", example = "1"),
            @ApiImplicitParam(name="title", value = "제목", example = "spring"),
            @ApiImplicitParam(name="contents", value = "내용", example = "spring 강좌")
    })
    public BaseResponse<Integer> save(BoardParameter parameter){//보통 post, put 사용, 실제로는 get 사용 지양
        //제목, 내용 필수체크
        if(StringUtils.isEmpty(parameter.getTitle())){
            throw new BaseException(BaseResponseCode.VALIDATE_REQUIRED, new String[]{"Title", "제목"});
        }
        if(StringUtils.isEmpty(parameter.getContents())){
            throw new BaseException(BaseResponseCode.VALIDATE_REQUIRED, new String[]{"Contents", "내용"});
        }
        boardService.save(parameter);
        return new BaseResponse<Integer>(parameter.getBoardSeq());
    }

    /*
     * 삭제처리
     * @author PSJ
     */
    @DeleteMapping("/{boardSeq}")
    @ApiOperation(value="삭제 처리", notes="게시물 번호에 해당하는 정보 삭제")
    @ApiImplicitParams({
            @ApiImplicitParam(name="boardSeq", value = "게시물 번호", example = "1")
    })
    public BaseResponse<Boolean> delete(@PathVariable int boardSeq){
        Board board = boardService.get(boardSeq);
        if(board==null){
            return new BaseResponse<Boolean>(false);
        }
        boardService.delete(boardSeq);
        return new BaseResponse<Boolean>(true);
    }


}
