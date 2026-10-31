package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ xg.a b;

    public a(ExecutorService executorService, xg.a aVar) {
        this.a = executorService;
        this.b = aVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
