package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import u2.l0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ l0 b;

    public a(ExecutorService executorService, l0 l0Var) {
        this.a = executorService;
        this.b = l0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
