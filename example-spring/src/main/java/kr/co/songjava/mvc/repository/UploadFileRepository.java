package kr.co.songjava.mvc.repository;

import kr.co.songjava.mvc.parameter.UploadFileParameter;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadFileRepository {

    void save(UploadFileParameter parameter);
}
