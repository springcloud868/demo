package java.multithreading;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.Future;

/**
 * @author zhaoyinghao
 * @decription
 * @date 2022/2/24
 */
public class ThreadDemoTest {


    @Test
    public void test() throws Exception{
        long start = System.currentTimeMillis();
        ArrayList<Future> futureList = new ArrayList<>();
        // 发送10次消息
        for (int i = 0; i < 1000; i++) {
            try {
                String msg = String.format("这是第{%s}条消息", i);
                Future<String> messageFuture = ThreadPoolUtil.submit(() -> {
//                    Thread.sleep(1000);
                    System.out.printf(Thread.currentThread()+"打印消息%s%n", msg);
                    return "OK";
                });
                futureList.add(messageFuture);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (val message : futureList) {
            String messageData = (String) message.get();
            System.out.println(messageData);
        }
        System.out.printf("共计耗时{%s}毫秒%n", System.currentTimeMillis() - start);
    }


}