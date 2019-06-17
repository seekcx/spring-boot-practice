package cx.seek.practice.app.mapper;

import cx.seek.practice.app.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    User findOne(@Param("id") int id);
    List<User> findAll();
}
