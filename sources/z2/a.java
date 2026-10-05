package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.l0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ l0 b;

    public a(ExecutorService executorService, l0 l0Var) {
        this.a = executorService;
        this.b = l0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
