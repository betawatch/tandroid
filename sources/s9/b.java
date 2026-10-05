package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.q;
import u4.g;
import w9.p;
import w9.x;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p b;
    public final /* synthetic */ da.b c;

    public b(boolean z10, p pVar, da.b bVar) {
        this.a = z10;
        this.b = pVar;
        this.c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        p pVar = this.b;
        ExecutorService executorService = pVar.k;
        g gVar = new g(3, pVar, this.c);
        ExecutorService executorService2 = x.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new q(gVar, executorService, taskCompletionSource, 4));
        taskCompletionSource.getTask();
        return null;
    }
}
