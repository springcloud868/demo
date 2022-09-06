package future;


import java.util.concurrent.CompletableFuture;

/**
 * @author zhaoyinghao
 * @decription
 * @date 2022/1/13
 */
public class CompletableFutureInstance {

    public static void main(String[] args) {
        CompletableFuture<String> futureA = CompletableFuture.supplyAsync(() -> "hello");
        CompletableFuture<String> futureB = futureA.thenCompose(s ->
                CompletableFuture.supplyAsync(() -> s + "world"));
        CompletableFuture<String> future3 = futureB.thenCompose(s ->
                CompletableFuture.supplyAsync(s::toUpperCase));
        System.out.println(future3.join());
    }
}
