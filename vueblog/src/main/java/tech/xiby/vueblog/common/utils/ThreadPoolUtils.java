package tech.xiby.vueblog.common.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池使用类
 *
 * @author xiby
 */
public class ThreadPoolUtils {
    /**
     * 构建无界线程池，超时时间单位为分钟
     * @param coreSize 核心线程池大小
     * @param maxSize 线程池最大大小
     * @param keepAliveTime 超时时间
     * @return
     */
    public static ExecutorService build(int coreSize, int maxSize, long keepAliveTime){
        return new ThreadPoolExecutor(coreSize, maxSize, keepAliveTime, TimeUnit.MINUTES,
                new LinkedBlockingQueue<>(), new ThreadPoolExecutor.AbortPolicy());
    }
}
