package cx.seek.practice.app.service;

import java.util.List;
import java.util.Optional;
import cx.seek.practice.app.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import cx.seek.practice.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User detail(long id) throws HttpClientErrorException {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "用户不存在");
        }
        return user.get();
    }

    public Page<User> list(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
