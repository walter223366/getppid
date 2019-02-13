package TestThread;

import service.TestService;

import java.util.concurrent.Callable;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2018年12月11日
 */
public class ThreadTest implements Callable<String>{

    private TestService testService;
    private String name;
    private int countAtomic;

    public ThreadTest(TestService testService, String name, int countAtomic) {
        this.testService = testService;
        this.name = name;
        this.countAtomic = countAtomic;
    }

    @Override
    public String call() throws Exception {
        return testService.hello(countAtomic+"号线程");
    }
}
