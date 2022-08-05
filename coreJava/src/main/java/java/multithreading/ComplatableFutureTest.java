package java.multithreading;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author zhaoyinghao
 * @decription 1
 * @date 2022/2/24
 */
public class ComplatableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long time1 = System.currentTimeMillis();
        CompletableFuture<String> future1 =
                CompletableFuture.supplyAsync(() -> {
                            try {
                                return test1("1");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                        .exceptionally(e -> {
                            System.out.println("失败:");
                            return null;
                        });

        CompletableFuture<String> future2 =
                CompletableFuture.supplyAsync(() -> {
                            try {
                                return test2("2");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                        .exceptionally(e -> {
                            System.out.println("失败:");
                            return null;
                        });
        CompletableFuture<String> future3 =
                CompletableFuture.supplyAsync(() -> {
                            try {
                                return test2("2");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                        .exceptionally(e -> {
                            System.out.println("失败:");
                            return null;
                        });
        CompletableFuture.allOf(future1, future2, future3).join();
        System.out.println(future1.get()+"========="+future2.get());
        long time2 = System.currentTimeMillis();
        System.out.println("耗时："+(time2-time1));
    }

    public static String test1(String flag) throws InterruptedException {
        System.out.println("111111");
        Thread.sleep(1000);
//        int i = 1/0;
        return flag;
    }

    public static String test2(String flag) throws InterruptedException {
        System.out.println("222222");
        Thread.sleep(1000);
        return flag;
    }

}
