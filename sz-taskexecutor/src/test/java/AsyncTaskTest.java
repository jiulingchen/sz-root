import com.sz.task.executor.TaskExecutorApplication;
import com.sz.task.executor.config.TaskExecutorConfig;
import com.sz.task.executor.service.AsyncTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@EnableAsync
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TaskExecutorApplication.class)
public class AsyncTaskTest {

    @Autowired
    AsyncTaskService asyncTaskService;

    @Test
    public void Test1(){
        for(int i=0;i<100;i++){
            asyncTaskService.executePrientLog(i);
        }
    }

    @Test
    public void Test2(){
        for(int i=0;i<100;i++){
            asyncTaskService.executePrientCustom(i);
        }
    }
}
