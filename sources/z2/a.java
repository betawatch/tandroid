package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ m b;

    public a(ExecutorService executorService, m mVar) {
        this.a = executorService;
        this.b = mVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
