package s9;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tg.r;
import u4.g;
import w9.o;
import w9.w;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        int i10 = 3;
        g gVar = new g(i10, oVar, this.c);
        ExecutorService executorService2 = w.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new r(gVar, executorService, taskCompletionSource, i10));
        taskCompletionSource.getTask();
        return null;
    }
}
