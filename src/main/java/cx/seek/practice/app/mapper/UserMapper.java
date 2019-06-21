package cx.seek.practice.app.mapper;

import cx.seek.practice.app.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {
}
