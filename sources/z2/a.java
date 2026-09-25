package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.o1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
