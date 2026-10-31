package t9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import rh.l5;
import x9.p;
import x9.x;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p b;
    public final /* synthetic */ ea.d c;

    public b(boolean z10, p pVar, ea.d dVar) {
        this.a = z10;
        this.b = pVar;
        this.c = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        p pVar = this.b;
        ExecutorService executorService = pVar.k;
        pb.d dVar = new pb.d(4, pVar, this.c);
        ExecutorService executorService2 = x.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new l5(dVar, executorService, taskCompletionSource, 20));
        taskCompletionSource.getTask();
        return null;
    }
}
