package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.o1;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
