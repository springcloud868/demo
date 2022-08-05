package java.multithreading;

import java.util.concurrent.Callable;

/**
 * @author zhaoyinghao
 * @decription
 * @date 2022/2/24
 */
class TestCallable implements Callable<String> {

    private String message;

    public TestCallable(String message) {
        this.message = message;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(300);
        System.out.println(String.format("打印消息%s", message));
        return "OK";
    }
}
