// default package

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
