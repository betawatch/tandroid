// default package

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
