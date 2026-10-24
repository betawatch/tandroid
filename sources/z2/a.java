package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.k;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ k b;

    public a(ExecutorService executorService, k kVar) {
        this.a = executorService;
        this.b = kVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
