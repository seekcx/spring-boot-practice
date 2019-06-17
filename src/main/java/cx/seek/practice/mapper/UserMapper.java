package cx.seek.practice.mapper;

import cx.seek.practice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    User findOne(@Param("id") int id);
}
