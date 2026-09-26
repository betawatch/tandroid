package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.o1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ o1 b;

    public a(ExecutorService executorService, o1 o1Var) {
        this.a = executorService;
        this.b = o1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
