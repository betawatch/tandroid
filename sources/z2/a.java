package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.n;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ n b;

    public a(ExecutorService executorService, n nVar) {
        this.a = executorService;
        this.b = nVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
