package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import u4.g;
import w9.o;
import w9.v;
import w9.x;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class b implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ o b;
    public final /* synthetic */ da.b c;

    public b(boolean z10, o oVar, da.b bVar) {
        this.a = z10;
        this.b = oVar;
        this.c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.a) {
            return null;
        }
        o oVar = this.b;
        ExecutorService executorService = oVar.k;
        g gVar = new g(3, oVar, this.c);
        ExecutorService executorService2 = x.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new v(gVar, executorService, taskCompletionSource, 0));
        taskCompletionSource.getTask();
        return null;
    }
}
