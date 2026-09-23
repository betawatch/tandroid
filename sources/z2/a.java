package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v3.d;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ d b;

    public a(ExecutorService executorService, d dVar) {
        this.a = executorService;
        this.b = dVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
