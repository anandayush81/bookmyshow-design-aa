package lld3.bookmyshow.services;

import lld3.bookmyshow.models.User;
import lld3.bookmyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public User createUser(String username, String password) {
        User user = new User(username, password);
        return userRepository.save(user);
    }
}
