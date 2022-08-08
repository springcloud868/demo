import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class TestStr {

    @Test
    public void test() {
        String str = "123";
        log.info(test1(str));
    }

    public String test1(final String name) {
        return name;
    }
}
