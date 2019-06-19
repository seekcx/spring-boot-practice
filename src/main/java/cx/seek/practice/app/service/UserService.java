package cx.seek.practice.app.service;

import cx.seek.practice.app.entity.User;
import cx.seek.practice.app.repository.UserRepository;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

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

    public List<User> list() {
        return userRepository.findAll();
    }

}
