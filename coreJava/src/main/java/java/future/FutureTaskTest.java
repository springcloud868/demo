package java.future;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author zhaoyinghao
 * @decription
 * @date 2022/3/2
 */
public class FutureTaskTest {

    /**
     * 线程池最好作为全局变量, 若作为局部变量记得用完后shutdown
     */
    ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("thread-start-runner-%d").build();
    ExecutorService taskExe= new ThreadPoolExecutor(10,20,800L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(100),namedThreadFactory);

    int count=0;
    @Test
    public void test() {

        //任务列表
        List<FutureTask<Integer>> taskList=new ArrayList<>();
        for(int i=0;i<100;i++){
            //创建100个任务放入【任务列表】
            FutureTask<Integer> futureTask=new FutureTask<>(() -> 1);
            //执行的结果装回原来的FutureTask中,后续直接遍历集合taskList来获取结果即可
            taskList.add(futureTask);
            taskExe.submit(futureTask);
        }
        //获取结果
        try{
            for(FutureTask<Integer> futureTask:taskList){
                count+=futureTask.get();
            }
        } catch (InterruptedException e) {
            System.out.printf("线程执行被中断", e);
        } catch (ExecutionException e) {
            System.out.printf("线程执行出现异常",e);
        }
        //关闭线程池
        taskExe.shutdown();
        //打印: 100
        System.out.println(count);
    }
}
