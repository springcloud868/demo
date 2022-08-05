package com.zyh.java.multithreading;


import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description:符合阿里巴巴规范的线程池
 */
public class ThreadPoolUtil {

    public static ThreadPoolExecutor threadPool;

    /**
     * 无返回值直接执行, 管他娘的
     * @param runnable
     */
    public  static void execute(Runnable runnable){
        getThreadPool().execute(runnable);
    }

    /**
     * 返回值直接执行, 管他娘的
     * @param callable
     */
    public  static <T> Future<T> submit(Callable<T> callable){
        return   getThreadPool().submit(callable);
    }


    /**
     * dcs获取线程池
     * @return 线程池对象
     */
    public static ThreadPoolExecutor getThreadPool() {
        if (threadPool != null) {
            return threadPool;
        } else {
            synchronized (ThreadPoolUtil.class) {
                if (threadPool == null) {
                    threadPool = new ThreadPoolExecutor(50, 100, 60, TimeUnit.SECONDS,
                            new LinkedBlockingQueue<>(32), new ThreadPoolExecutor.CallerRunsPolicy());
                }
                return threadPool;
            }
        }
    }

}
