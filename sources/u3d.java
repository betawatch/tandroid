// default package

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class u3d {
    public static final ExecutorService a;

    static {
        op7 op7Var = new op7();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), op7Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
