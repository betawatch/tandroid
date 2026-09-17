package z2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.web.n;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
