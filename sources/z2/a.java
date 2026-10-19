package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import sg.y;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ y b;

    public a(ExecutorService executorService, y yVar) {
        this.a = executorService;
        this.b = yVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
