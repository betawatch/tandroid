package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.m;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
