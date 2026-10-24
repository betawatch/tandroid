package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.k;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
