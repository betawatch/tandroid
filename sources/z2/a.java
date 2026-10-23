package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.k;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
