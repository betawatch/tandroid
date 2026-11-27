// default package

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class r99 implements Executor {
    public final /* synthetic */ ExecutorService a;
    public final /* synthetic */ lq5 b;

    public r99(ExecutorService executorService, lq5 lq5Var) {
        this.a = executorService;
        this.b = lq5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
