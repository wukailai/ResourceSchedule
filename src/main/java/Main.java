import manager.ConnectionManager;
import manager.ConstraintManager;
import schedule.Scheduler;

/**
 * 资源调度入口
 */

public class Main {
    public static void main(String[] args) throws Exception {
        //初始化
        init();
        //单线程执行
        new Thread(new Scheduler()).start();
    }

    /**
     * 初始化
     */
    private static void init() throws Exception {
        ConnectionManager.getInstance().init();
        ConstraintManager.getInstance().init();
    }
}