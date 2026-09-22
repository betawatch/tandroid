package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.r;
import u4.g;
import w9.p;
import w9.x;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        int i10 = 3;
        g gVar = new g(i10, pVar, this.c);
        ExecutorService executorService2 = x.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new r(gVar, executorService, taskCompletionSource, i10));
        taskCompletionSource.getTask();
        return null;
    }
}
