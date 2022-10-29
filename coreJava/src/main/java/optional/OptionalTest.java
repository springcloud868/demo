package optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test() {
        User user = null;
        user = Optional.ofNullable(user).orElse(createUser());
        user = Optional.ofNullable(user).orElseGet(this::createUser);

    }
    public User createUser(){
        User user = new User();
        user.setName("zhangsan");
        return user;
    }

}
